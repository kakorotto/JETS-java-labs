

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCombination;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class Controller extends BorderPane {

    MenuBar menuBar;
    Menu fileMenu;
    Menu editMenu;
    Menu helpMenu;
    MenuItem newMenu;
    MenuItem openMenu;
    MenuItem saveMenu;
    MenuItem closeMenu;
    MenuItem copyMenu;
    MenuItem cutMenu;
    MenuItem pasteMenu;
    MenuItem selectMenu;
    MenuItem aboutMenu;
    TextArea textArea;
    FileChooser fileChooser;

    File selectedFile = null;
    Boolean fileFlag = false;
    BufferedWriter out;

    public Controller(Stage primaryStage) {

        menuBar = new MenuBar();
        fileMenu = new Menu();
        editMenu = new Menu();
        helpMenu = new Menu();

        newMenu = new MenuItem();
        openMenu = new MenuItem();
        saveMenu = new MenuItem();
        closeMenu = new MenuItem();
        copyMenu = new MenuItem();
        cutMenu = new MenuItem();
        pasteMenu = new MenuItem();
        selectMenu = new MenuItem();
        aboutMenu = new MenuItem();
        textArea = new TextArea();
        fileChooser = new FileChooser();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(menuBar, javafx.geometry.Pos.CENTER);

        fileMenu.setMnemonicParsing(false);
        fileMenu.setText("File");

        newMenu.setMnemonicParsing(false);
        newMenu.setText("New");
        newMenu.setAccelerator(new KeyCodeCombination(KeyCode.N, KeyCombination.CONTROL_DOWN));

        newMenu.setOnAction(event -> {
            primaryStage.setTitle("new MyNotepad");
            selectedFile = null;
            textArea.setText("");
        });

        openMenu.setMnemonicParsing(false);
        openMenu.setText("Open");
        openMenu.setAccelerator(new KeyCodeCombination(KeyCode.O, KeyCombination.CONTROL_DOWN));

        openMenu.setOnAction(event -> {

            selectedFile = fileChooser.showOpenDialog(primaryStage);

            if (selectedFile != null) {
                try {
                    textArea.setText("");
                    fileFlag = true;
                    FileReader br = new FileReader(selectedFile);
                    int r = 0;
                    StringBuilder str = new StringBuilder("");

                    while ((r = br.read()) != -1) {

                        str.append((char) r);
                        System.out.print((char) r);
                    }

                    textArea.setText(str.toString());
                    primaryStage.setTitle(selectedFile.getName());

                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });

        saveMenu.setMnemonicParsing(false);
        saveMenu.setText("Save");
        saveMenu.setAccelerator(new KeyCodeCombination(KeyCode.S, KeyCombination.CONTROL_DOWN));

        saveMenu.setOnAction(event -> {

            if (selectedFile != null) {
                try {
                    FileWriter fstream = new FileWriter(selectedFile);
                    out = new BufferedWriter(fstream);
                    out.write(textArea.getText());

                } catch (IOException e) {
                    System.err.println("Error: " + e.getMessage());

                } finally {
                    if (out != null) {
                        try {
                            out.close();
                            primaryStage.setTitle(selectedFile.getName());
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                }

            } else {
                fileChooser.getExtensionFilters().addAll(new ExtensionFilter("All Files", "*.txt"));
                selectedFile = fileChooser.showSaveDialog(primaryStage);

                if (selectedFile != null) {
                    try {
                        primaryStage.setTitle(selectedFile.getName());
                        FileWriter fstream = new FileWriter(selectedFile);
                        out = new BufferedWriter(fstream);
                        out.write(textArea.getText());

                    } catch (IOException e) {
                        System.err.println("Error: " + e.getMessage());

                    } finally {
                        if (out != null) {
                            try {
                                out.close();
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }
                }

                System.out.print(selectedFile);

            }
        });

        closeMenu.setMnemonicParsing(false);
        closeMenu.setText("Exit");
        closeMenu.setAccelerator(new KeyCodeCombination(KeyCode.X, KeyCombination.CONTROL_DOWN));

        closeMenu.setOnAction(event -> Platform.exit());

        editMenu.setMnemonicParsing(false);
        editMenu.setText("Edit");

        copyMenu.setMnemonicParsing(false);
        copyMenu.setText("Copy");

        copyMenu.setOnAction(event -> textArea.copy());

        cutMenu.setMnemonicParsing(false);
        cutMenu.setText("Cut");

        cutMenu.setOnAction(event -> textArea.cut());

        pasteMenu.setMnemonicParsing(false);
        pasteMenu.setText("Paste");

        pasteMenu.setOnAction(event -> textArea.paste());

        selectMenu.setMnemonicParsing(false);
        selectMenu.setText("Select All");

        selectMenu.setOnAction(event -> textArea.selectAll());

        helpMenu.setMnemonicParsing(false);
        helpMenu.setText("Help");

        aboutMenu.setMnemonicParsing(false);
        aboutMenu.setText("About");
        aboutMenu.setOnAction(event -> {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("About my NotePad");
            alert.setHeaderText("About");
            alert.setContentText("My Name is : .... and this is about ....");
            alert.showAndWait();
        });
        setTop(menuBar);

        BorderPane.setAlignment(textArea, javafx.geometry.Pos.CENTER);
        textArea.setPrefHeight(200.0);
        textArea.setPrefWidth(200.0);
        setCenter(textArea);

        fileMenu.getItems().add(newMenu);
        fileMenu.getItems().add(openMenu);
        fileMenu.getItems().add(saveMenu);
        fileMenu.getItems().add(closeMenu);
        menuBar.getMenus().add(fileMenu);
        editMenu.getItems().add(copyMenu);
        editMenu.getItems().add(cutMenu);
        editMenu.getItems().add(pasteMenu);
        editMenu.getItems().add(selectMenu);
        menuBar.getMenus().add(editMenu);
        helpMenu.getItems().add(aboutMenu);
        menuBar.getMenus().add(helpMenu);

    }
}

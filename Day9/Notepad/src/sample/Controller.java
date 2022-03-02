package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller extends BorderPane {
    @FXML
    protected MenuItem newItem, openItem, saveItem, closeItem, undoItem, cutItem, copyItem, pasteItem, deleteItem, selectItem, aboutItem;
    @FXML
    protected TextArea textAreaId;
    protected   BufferedWriter out ;
    protected Boolean fileFlag;
    protected FileChooser fileChooser;
    protected File selectedFile;
   // protected BufferedWriter bufferedWriter ;
    private File fileSelect = new File("output.txt");

    public Controller(Stage primaryStage) {

        public void onNew (ActionEvent actionEvent) throws IOException {

            newItem.setAccelerator(new KeyCodeCombination(KeyCode.N, KeyCombination.CONTROL_DOWN));
            fileFlag = true;
            textAreaId.setText("");
            System.out.println("working");
        }
        public void onOpen (ActionEvent actionEvent) throws IOException {


            openItem.setAccelerator(new KeyCodeCombination(KeyCode.O, KeyCombination.CONTROL_DOWN));
//            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
//            stage.setScene(new Scene(root));
            //stage.show();

            selectedFile = fileChooser.showOpenDialog(null);

            if (selectedFile != null)
                try {
                    textAreaId.setText("");
                    fileFlag = false;
                    FileReader fileReader = new FileReader(selectedFile);
                    int ch = 0;
                    StringBuilder stringBuilder = new StringBuilder("");

                    while ((ch = fileReader.read()) != -1) {

                        stringBuilder.append((char) ch);
                        System.out.print((char) ch);
                    }

                    textAreaId.setText(stringBuilder.toString());


                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }


            System.out.println(selectedFile);


//        fileChooser.setTitle("Open Resource File");
//        fileChooser.showOpenDialog(new Stage());
            System.out.println("working");
        }
        public void onSave (ActionEvent actionEvent) throws IOException {


            saveItem.setAccelerator(new KeyCodeCombination(KeyCode.S, KeyCombination.CONTROL_DOWN));


            if (!fileFlag) {
                if (selectedFile != null)
                    try {
                        FileWriter fstringBuildeream = new FileWriter(selectedFile);
                        out = new BufferedWriter(fstringBuildeream);
                        out.write(textAreaId.getText());

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

            } else {
                fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("All Files", "*.txt"));
                selectedFile = fileChooser.showSaveDialog(new Stage());

                if (selectedFile != null)
                    try {
                        FileWriter fstringBuildeream = new FileWriter(selectedFile); //true tells to append data.
                        out = new BufferedWriter(fstringBuildeream);
                        out.write(textAreaId.getText());

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


            System.out.println("working");
        }
        public void onClose (ActionEvent actionEvent) throws IOException {
            //System.out.println("working");
            closeItem.setAccelerator(new KeyCodeCombination(KeyCode.X, KeyCombination.CONTROL_DOWN));
            Platform.exit();
        }
        public void onUndo (ActionEvent actionEvent) throws IOException {
            System.out.println("working");
        }
        public void onCut (ActionEvent actionEvent) throws IOException {
            this.textAreaId.cut();
            System.out.println("working");
        }
        public void onCopy (ActionEvent actionEvent) throws IOException {
            this.textAreaId.copy();
            System.out.println("working");
        }
        public void onPaste (ActionEvent actionEvent) throws IOException {
            this.textAreaId.paste();
            System.out.println("working");
        }
        public void onDelete (ActionEvent actionEvent) throws IOException {
            this.textAreaId.deleteNextChar();
            System.out.println("working");

        }
        public void onSelect (ActionEvent actionEvent) throws IOException {
            this.textAreaId.selectAll();
            System.out.println("working");
        }
        public void onAbout (ActionEvent actionEvent) throws IOException {
            //System.out.println("working");
            showMessage(Alert.AlertType.INFORMATION, "This is about: ", "The creator of this notepad who is ......");
        }
        private Optional<ButtonType> showMessage (Alert.AlertType type, String header, String message, ButtonType...
        buttonType){
            Alert alert = new Alert(type);
            alert.setHeaderText(header);
            alert.setContentText(message);
            if (buttonType.length > 0) {
                alert.getButtonTypes().clear();
                alert.getButtonTypes().addAll(buttonType);
            }
            return alert.showAndWait();
        }
    }
}

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.text.*;
public class CSSDemoApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("css_demo.fxml"));
	StackPane root = new StackPane();    
        Scene scene = new Scene(root, 400, 400);
	scene.getStylesheets().add(getClass().getResource("demo.css").toExternalForm());
	Text text = new Text("Hello World");
        root.getChildren().add(text);
        text.getStyleClass().add("my-word");
	root.getStyleClass().add("root");
       // scene.getStylesheets().add("scene");
	primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    
    @Override
    public void start(Stage primaryStage) throws IOException {
        Controller notepad = new Controller(primaryStage);
        Scene scene = new Scene(notepad);
        primaryStage.setTitle("My Notepad");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    

    public static void main(String[] args) {
        launch(args);
    }
    
}

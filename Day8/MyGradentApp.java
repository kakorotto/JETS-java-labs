import java.io.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class MyGradentApp extends Application{


public MyGradentApp() {
	String name = Thread.currentThread().getName();
	System.out.println("constructor "+name);
}
public void init() throws Exception{
	super.init();
	String name = Thread.currentThread().getName();
	System.out.println("init() "+name);
}
public void start(Stage primaryStage) {
	String name = Thread.currentThread().getName();
	System.out.println("start() "+name);
	
	primaryStage.setTitle("Hello JFX");
 	Text text = new Text("Hello World");
    	Reflection reflection  = new Reflection();
        text.setEffect(reflection);
        text.setFont(Font.font("Aria", FontWeight.BOLD, 50));
        text.setFill(Color.RED);
        StackPane root = new StackPane();    
        root.getChildren().add(text);
        Stop[] stop = {new Stop(0, Color.BLACK),  
        new Stop(0.5, Color.WHITE),
        new Stop(1, Color.BLACK)};
        LinearGradient linearGradient = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, stop);
	Scene scene = new Scene(root,400,350);
	scene.setFill(linearGradient);
	primaryStage.setScene(scene);
	primaryStage.show();
}
public void stop() throws Exception{
	super.stop();
	String name = Thread.currentThread().getName();
	System.out.println("stop() "+name);
}


public static void main(String[] args){
		launch(args);
}
}
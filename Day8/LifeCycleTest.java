import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
public class LifeCycleTest extends Application{


public LifeCycleTest() {
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
	
	StackPane root = new StackPane();
	root.getChildren().add(new Text("Hello from life cycle"));
	Scene scene = new Scene(root,300,250);
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
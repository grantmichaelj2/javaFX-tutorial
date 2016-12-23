//Tutorial #1
//thenewboston's tutorial on javaFx
//All the imported classes we need to run javaFx for GUI applications
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//Inherits all the functions from the Application class
//Ensure we make our main class public or else you will get an error
public class javafx1 extends Application{
	
	public static void main(String[] args){
		
		//Method inside application class
		//Sets up javaFx application
		launch(args);
		
	}
	
	//Inherited from the Application class
	//start() method is what will run our GUI
	
	@Override
	public void start(Stage primaryStage){
		
		//Sets title of the window (stage) of the GUI
		primaryStage.setTitle("Title of the Window");
		
		//Creates a new button object
		//You can also set the button text within the the button method button = new Button("Click me");
		Button button = new Button();
		//You can set text to the button in the following method
		button.setText("Click me");
		
		//Simple layout
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		//Sets up your stage with the labels/buttons you created for the scene.
		Scene scene = new Scene(layout, 300, 250);
		
		//Finalizes everything you want to show
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
}
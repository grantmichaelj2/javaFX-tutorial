//Tutorial #2
//thenewboston's tutorial on javaFx
//Adjusted for sakes of how I prefer to code vs what Bucky actually does
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//Ensure we implement EventHandler<>
public class javafx2 extends Application{
	
	public static void main(String[] args){
		
		launch(args);
		
	}
	
	@Override
	public void start(Stage primaryStage){
		
		testClass testButton = new testClass();
		
		primaryStage.setTitle("Title of the Window");
		
		Button button = new Button();
		button.setText("Click me");
		
		//The class/function that will be called
		button.setOnAction(e -> testButton.handler());
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 300, 250);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}	


/*Creates a class to hold all of our button functions*/
class testClass{
	
	public void handler(){
		
		System.out.println("Test Successful");
		
	}
	
}
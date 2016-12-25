//Tutorial #4
//thenewboston's tutorial on javaFx
//Adjusted for sakes of how I prefer to code vs what Bucky actually does
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class javafx4 extends Application{

    //Creates our window and sets up content for it.
    Stage window;
    Scene scene1, scene2;

	public static void main(String[] args){

		launch(args);

	}

	@Override
	public void start(Stage primaryStage){

        window = primaryStage;

        //What we are adding to our first scene
        Label label1 = new Label("Welcome to the first Window");
        Button button1 = new Button("Go to scence 2");
        button1.setOnAction(e -> window.setScene(scene2));

        //Set up our layout
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);

        //What we are adding to our second scene
        Button button2 = new Button("Go to scence 2");
        button2.setOnAction(e -> window.setScene(scene1));

        //Set up our second layout
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 300, 300);

        window.setScene(scene1);
        window.setTitle("Title");
        window.show();
	}
}

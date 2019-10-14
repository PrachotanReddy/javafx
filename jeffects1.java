import javafx.scene.control.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class jeffects1 extends Application{
	public void start(Stage primaryStage){
		primaryStage.setTitle("First javafx applicaton");
		Label lbl=new Label();
		lbl.setText("Welcome");
		lbl.setTextFill(Color.MAGENTA);
		FlowPane root=new FlowPane(20,20);
		root.getChildren().add(lbl);
		Scene myscene=new Scene(root,500,200);
		primaryStage.setScene(myscene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
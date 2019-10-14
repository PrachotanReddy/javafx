import javafx.scene.control.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.event.*;
import javafx.geometry.*;

public class jeffects3 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage mystage){
		mystage.setTitle("Sign In");
	
	GridPane root=new GridPane();
	Scene myscene=new Scene(root,300,100);
	Label lbl=new Label("Welcome");
	Label u=new Label("User Name");
	Label p=new Label("Password");
	TextField b = new TextField("Enter the User Name");
	PasswordField pw= new PasswordField();
	Button click = new Button("Sign in");
	Label c= new Label();
	EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
		public void handle(ActionEvent e) 
			{
				c.setText("Welcome "+b.getText()); 
			} 
		};
		click.setOnAction(event);
		root.addRow(0,lbl);
		root.addRow(1,u,b);
		root.addRow(2,p,pw);
		root.addRow(3,c,click);
		//root.setHalignment(c, HPos.RIGHT);
		mystage.setScene(myscene);
		mystage.show();
}
}
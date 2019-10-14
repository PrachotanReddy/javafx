import javafx.scene.control.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.event.*;
import javafx.geometry.*;

public class jeffects4 extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage mystage){
		mystage.setTitle("Factorial");
	
	GridPane root=new GridPane();
	Scene myscene=new Scene(root,300,100);
	Label lbl=new Label("Welcome");
	Label l=new Label("GCD goes here");
	TextField b = new TextField("Enter the 1st number");
	TextField c = new TextField("Enter the 2nd number");
	EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
		public void handle(ActionEvent e) 
			{ int i,r;
				r=1;
			int t=Integer.parseInt(b.getText());
			int u=Integer.parseInt(c.getText());


 	  	for (i = 1; i <= t && i <= u; i++)
   		{
      		if (t % i == 0 && u % i == 0)
         		r = i;
   		}
				l.setText(Integer.toString(r)); 
			} 
		};
		c.setOnAction(event);
		root.addRow(0,lbl);
		root.addRow(1,b);
		root.addRow(2,c);
		root.addRow(3,l);
		mystage.setScene(myscene);
		mystage.show();
}}
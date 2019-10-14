import javafx.scene.control.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.event.*;
import javafx.geometry.*;

public class jeffects2 extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage mystage){
		mystage.setTitle("Factorial");
	
	FlowPane root=new FlowPane(10,10);
	Scene myscene=new Scene(root,300,100);
	Label lbl=new Label("Welcome");
	Label l=new Label("Answer goes here");
	TextField b = new TextField("Enter the number");
	EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
		public void handle(ActionEvent e) 
			{ int i,r;
				r=1;
			int t=Integer.parseInt(b.getText());

				for (i=t;i>0 ;i-- ) {
					r=r*i;
				}
				l.setText(Integer.toString(r)); 
			} 
		};
		b.setOnAction(event);
		root.getChildren().addAll(lbl,b,l);
		//root.getChildren().add(b);
		//root.getChildren().add(l);
		mystage.setScene(myscene);
		mystage.show();
}}
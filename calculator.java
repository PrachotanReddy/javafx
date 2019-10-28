import javafx.scene.control.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.event.*;
import javafx.geometry.*;

public class calculator extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage mystage){
		mystage.setTitle("calculator");
	
	GridPane root=new GridPane();
	Scene myscene=new Scene(root,300,100);
	//Label lbl=new Label("Welcome");
	Label u=new Label("Number1");
	Label p=new Label("Number2");
	TextField num1 = new TextField("Enter Number 1 ");
	TextField num2 = new TextField("Enter Number 2 ");
	Button click = new Button("Calculate");
	Label s= new Label();
	Label pro=new Label();
	Label dif=new Label();
	Label quo=new Label();
	EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
		public void handle(ActionEvent e) 
			{float sum;
				float product,diff,quotient;
			float n1=Float.parseFloat(num1.getText());
			float n2=Float.parseFloat(num2.getText());				
				sum=n1+n2;
				product=n1*n2;
				diff=n1-n2;
				quotient=n1/n2;
				s.setText("Sum is"+Float.toString(sum));
				pro.setText("P is"+Float.toString(product)); 
				dif.setText("D is"+Float.toString(diff)); 
				quo.setText("Q is"+Float.toString(quotient));  
			} 
		};
		click.setOnAction(event);
		//root.addRow(0,lbl);
		root.addRow(1,u,num1);
		root.addRow(2,p,num2);
		root.addRow(3,click);
		root.addRow(4,s,pro);
		root.addRow(5,dif,quo);
		//root.setHalignment(c, HPos.RIGHT);
		mystage.setScene(myscene);
		mystage.show();
}
}
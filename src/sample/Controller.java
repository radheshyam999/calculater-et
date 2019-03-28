package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller { //  Contoraler class //

@FXML
	private Label result; // lable aces ing
    private long number=0;
    private  String operater ="";
    private  boolean start =true;
@FXML
      public void ProcessNumber(ActionEvent event){ //
      
      	if (start){
      		result.setText ("");
      		start =false;
        }
      	String value = ((Button)event.getSource ()).getText (); // i am geting data from buuton here
      	result.setText (result.getText ()+value); // seting that data here //
	
      	
      	
      
      }
@FXML
      public void ProcessOperater(ActionEvent event){ //  //   acecssiing opertaor  nd working i= on  that //
         String  value = ((Button)event.getSource ()).getText ();
         
	    result.setText (result.getText ()+value);
	
      }

@FXML
     public void Clear(ActionEvent event){ // acing  clear  buuton here
     
     
     }




}

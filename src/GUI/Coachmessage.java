
package GUI;

import health.club.Coach;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author abdo
 */
public class Coachmessage extends Application {
    TextArea message;
    TextField id;
    @Override
    public void start(Stage primaryStage) {
            GridPane grid = new GridPane();
     
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(20,20,20,20));
         grid.setVgap(10); 
      grid.setHgap(10);  
        StackPane root = new StackPane();
       message = new TextArea();
        message.setMaxWidth(200);
        message.setMaxHeight(200);
      
        
        grid.add(message,1,3);
        
        Label label = new Label("ID");
        label.setFont(Font.font(20));
        
       id = new TextField("");
        id.setMaxWidth(100);
                 grid.add(label,0,1);
                 grid.add(id, 1, 1);
        Button send = new Button("Send");
        Button sendall = new Button("Send All");
       
         grid.add(send,1,4);
         grid.add(sendall,2,4);
         
         
         send.setOnAction(event -> {
    Coach x=new Coach();   
    try{
       
       //action Send button for Specific Member
       
                    if(!id.getText().equals(""))
                    {
                      x.SendMassageForSpecificM(Integer.parseInt(id.getText()),message.getText());
                      setdata();
                      setid();
                     }else
                    {JOptionPane.showMessageDialog(null,"Please Enter ID Member For Send Message!");}
   
                   }catch(Exception e){
                 System.out.println(e);
                  }
                  });
 //sendall for member
        sendall.setOnAction(event -> {
    Coach x=new Coach();
            try{
                if(id.getText().equals("")){             //Action Send All Fot All Members
                 x.SendMassageForAll(message.getText());
                  setdata();}
                {JOptionPane.showMessageDialog(null,"Please Remove Id to Send For All!");}
                      }catch(Exception e){
                 System.out.println(e);
                  }
          });

        
        Scene scene = new Scene(grid, 500, 500);
        
        primaryStage.setTitle("Message");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

   
    


public void setdata(){
    message.setText("");
    
    }
public void setid(){
    id.setText("");
}
}

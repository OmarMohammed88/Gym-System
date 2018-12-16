
package GUI;

import com.sun.corba.se.impl.util.Utility;
import GUI.ad;
import health.club.Admin;
import health.club.Member;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import com.sun.corba.se.impl.util.Utility;
import health.club.Coach;


public class Addmember extends Application implements EventHandler<ActionEvent>{
    Stage s1;
    TextField id,name,username,age,charge;
    PasswordField password;
    Button addmember,back;
    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(20,20,20,20));
        
        Scene scene = new Scene(grid,500,500);
      
        Label ID =  new Label("id");
        TextField id = new TextField("");
        Label Name =  new Label("User name");
        TextField name = new TextField("");
        Label UserName =  new Label("EndOfDate");
        TextField username = new TextField("");
        Label Password =  new Label("Password");
        PasswordField password = new PasswordField();
        Label Age =  new Label("ID Coach");
        TextField age = new TextField("");
        Label Charge =  new Label("Billing");
        TextField charge = new TextField("");
       
        
        
        
        
        grid.add(ID , 0 , 0);
        grid.add(id ,1 , 0);
        grid.add(Name , 0 , 1);
        grid.add(name ,1 , 1);
        grid.add(UserName , 0 , 2);
        grid.add(username ,1 , 2);
        grid.add(Password , 0 , 3);
        grid.add(password ,1 , 3);
        grid.add(Age , 0, 4);
        grid.add(age ,1 , 4);
        grid.add(Charge , 0 , 5);
        grid.add(charge ,1 , 5);

          addmember = new Button("Add Member");
         grid.add(addmember,1,6);
         
       addmember.setOnAction(event -> {
Coach x=new Coach();
                try{
                 Member a=new Member();
                 a.setId(Integer.parseInt(id.getText()));
                 a.setName(name.getText());
                 a.setEmail(username.getText());
                 a.setBiiling(Double.parseDouble(charge.getText()));
                 a.setGender('m');
                 a.setPassword(password.getText());
                 x.settrainers(Integer.parseInt(age.getText()), a);
                 a.addmember();
}catch(Exception e){
                 System.out.println(e);}

         

        });
        
         
        
        primaryStage.setTitle("Add member");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    protected void restdata(){
   id.setText("");
   name.setText("");
   username.setText("");
   password.setText("");
   age.setText("");
   charge.setText("");
   }
    

    @Override
    public void handle(ActionEvent event) {
      if(event.getSource()== back)
   {
       ad h = new ad();
     s1.close();
     try
     {
     h.start(new Stage());
     }catch(Exception e){
    }
   }
   
    }
 
    
    
    

    
}

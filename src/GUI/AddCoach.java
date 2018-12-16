/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import health.club.Coach;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.Event;
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

/**
 *
 * @author abdo
 */
public class AddCoach extends Application {
    
    TextField id,name,username,age,salary;
    PasswordField password;
    Stage s1;
    Button addcoach;
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(20,20,20,20));
        
        Scene scene = new Scene(grid,500,500);
      
        Label ID =  new Label("Id");
         id = new TextField("");
        Label Name =  new Label("Full name");
         name = new TextField("");
        Label UserName =  new Label("User name");
         username = new TextField("");
        Label Password =  new Label("Password");
          password = new PasswordField();
        Label Age =  new Label("Age");
         age = new TextField("");
        Label Salary =  new Label("Salary");
         salary = new TextField("");
        grid.add(ID , 0 , 0);
        grid.add(id ,1 , 0);
        grid.add(Name , 0 , 1);
        grid.add(name ,1 , 1);
        grid.add(UserName , 0 , 2);
        grid.add(username ,1 , 2);
        grid.add(Password , 0 , 3);
        grid.add(password ,1 , 3);
        grid.add(Age , 0 , 4);
        grid.add(age ,1 , 4);
        grid.add(Salary , 0 , 5);
        grid.add(salary ,1 , 5);

          addcoach = new Button("Add Coach");
         grid.add(addcoach,1,6);
       
          addcoach.setOnAction(event -> {


try{
                  Coach a=new Coach();
                 a.setId(Integer.parseInt(id.getText()));
                 a.setName(name.getText());
                 a.setEmail(username.getText());
                 a.setSalary(Double.parseDouble(salary.getText()));
                 a.setGender('m');
                 a.setPassword(password.getText());
                 a.addCoach();
                 restdata();
}catch(Exception e){
                 System.out.println("NOT Found");}

         });  
        
        primaryStage.setTitle("Add coach");
        primaryStage.setScene(scene);
        primaryStage.show();
        s1=primaryStage;
    }
      protected void restdata(){
   id.setText("");
   name.setText("");
   username.setText("");
   password.setText("");
   age.setText("");
   salary.setText("");
   }
}


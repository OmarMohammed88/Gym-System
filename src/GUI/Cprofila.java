/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author abdo
 */
public class Cprofila extends Application {
    PasswordField newpass;
    TextField id;
    @Override
    public void start(Stage primaryStage) {
              GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER_LEFT);
        grid.setPadding(new Insets(20,20,20,20));
         Label ID =  new Label("Id");
         id = new TextField("");
         Label Newpass =  new Label("New password");
         newpass = new PasswordField();
        
       
         Button Update = new Button();
        Update.setText("Update");
         Button Show = new Button();
        Show.setText("Show Salary");
        Update.setOnAction(event -> {
         try{
              Coach a =new Coach();
            a.updateCoach(Integer.parseInt(id.getText()), a);
              restdata();
           }catch(Exception e){
                 System.out.println(e);}
         });  
        
        Show.setOnAction(event ->{
        
        Coach a=new Coach();
        a.setId(Integer.parseInt(id.getText()));
          JOptionPane.showMessageDialog(null,"Salary is " + a.getSalary());
        
        });
        
        grid.add(ID , 0 , 0);
        grid.add(id ,1 , 0);
        grid.add(Newpass,0,1);
        grid.add(newpass,1,1);
        grid.add(Update,1,4);
        grid.add(Show,1,2);
      
        StackPane root = new StackPane();
        
        Scene scene = new Scene(grid,300, 300);
        
        primaryStage.setTitle("My Profile");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void restdata()
    {
    id.setText("");
    newpass.setText("");
    }
    
}

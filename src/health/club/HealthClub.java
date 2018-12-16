/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package health.club;

import GUI.ad;
import GUI.cfx;
import GUI.memberfx;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo 2017
 */
public class HealthClub extends Application {
    Stage s1;
    TextField textfield;
    PasswordField passwordfield;
    Button signin;
    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
       grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(20,20,20,20));
        
        Scene scene = new Scene(grid,500,500);
      
        Label username =  new Label("User Name");
         textfield = new TextField("");
        Label password = new Label("Password");
         passwordfield= new PasswordField();
        
        grid.add(username , 1 , 0);
        grid.add(textfield , 1 , 1);
        grid.add(password , 1 , 2);
        grid.add(passwordfield , 1 , 3);
       

          signin = new Button("Log In");
         grid.add(signin,1,4);
         
        signin.setOnAction((ActionEvent e)->
        {

              String pass=new String(passwordfield.getText());
             String name= new String(textfield.getText());
              if(name.equals("Admin")&&pass.equals("123")){
                ad admin=new ad();

                s1.close();
            try {
                admin.start(new Stage());
            } catch (Exception ex) {
               System.out.println(ex);
            }
              }
            Coach coach =new Coach();
            if(coach.login(textfield.getText(), passwordfield.getText()))
            {
             cfx c;
             c= new cfx();
             s1.close();
            try {
                c.start(new Stage());
            } catch (Exception ex) {
                System.out.println(ex);
            }
            }
            Member member =new Member();
             if(member.login(textfield.getText(), passwordfield.getText()))
            {
            memberfx m =new memberfx();
            s1.close();
            try {
               m.start(new Stage());
            } catch (Exception ex) {
                System.out.println(ex);
            }
            }
            
            

        });
        primaryStage.setTitle("Log In");
        primaryStage.setScene(scene);
        primaryStage.show();
        s1=primaryStage;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
     launch(args);
     
        
        
        
    }   }

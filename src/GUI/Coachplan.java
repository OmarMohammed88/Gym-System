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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author abdo
 */
public class Coachplan extends Application {
    
     public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(20,20,20,20));
        StackPane root = new StackPane();
        TextArea plan = new TextArea();
        grid.add(plan,1,0);
        Button send = new Button("Send");
        TextField IdCoach=new TextField();
        grid.add(send,1,2);
        grid.add(IdCoach,1,1);
        
   
        
        send.setOnAction(event -> {


try{
                  Coach a=new Coach();
                  a.setId(Integer.parseInt(IdCoach.getText()));
                  a.makeplan(plan.getText());
}catch(Exception e){
                 System.out.println(e);}

         });  
        
        Scene scene = new Scene(grid, 300, 300);
        
        primaryStage.setTitle("Plan");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}

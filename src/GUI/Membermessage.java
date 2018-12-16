/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import health.club.Coach;
import health.club.Member;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
public class Membermessage extends Application {

 
 Member x=new Member();    
 TextField Id;    


 
@Override
    public void start(Stage primaryStage) {
       
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER_LEFT);
        grid.setPadding(new Insets(20,20,20,20));
        StackPane root = new StackPane();
      
        Id=new TextField();
        grid.add(Id,0,1);
        Scene scene = new Scene(grid, 300, 250);
        Button b=new Button("id");
        grid.add(b,0,2);
b.setOnAction(event ->{
  try{
          x.setId(Integer.parseInt(Id.getText()));
                  JOptionPane.showMessageDialog(null,"The Massage  is : "+ x.GetMassages());
                }catch(Exception e){
                 System.out.println(e);}



  
    });


        
        

        primaryStage.setTitle("Message");
        primaryStage.setScene(scene);
        primaryStage.show();
    }}   



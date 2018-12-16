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
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Updatecoach extends Application {
    
    Button updatecoach ;
    @Override
    public void start(Stage primaryStage) {
       
        
        
        
       GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(20,20,20,20));
         Label ID =  new Label("id");
        TextField id = new TextField("");
         Label Salary =  new Label("Salary ");
        TextField salary = new TextField("");
        grid.add(ID , 0 , 0);
        grid.add(id ,1 , 0);
        grid.add(Salary , 0 , 1);
        grid.add(salary ,1 , 1);
           updatecoach = new Button("Set Salary");
           updatecoach.setOnAction(event -> {
             

               try{
                  Coach a =new Coach();
           a.setSalary(Integer.parseInt(id.getText()),Double.parseDouble(salary.getText()));
               
               }catch(Exception e){
                 System.out.println(e);}
         });  
         grid.add(updatecoach,1,2);
        Scene scene = new Scene(grid,500,500);
        
        primaryStage.setTitle("update coach");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

 
    
}

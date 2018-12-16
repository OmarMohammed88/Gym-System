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

/**
 *
 * @author abdo
 */
public class Deletecoach extends Application  {
    Stage s1;
    Button deletecoach;
    @Override
    public void start(Stage primaryStage) {
          
       GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(20,20,20,20));
          Label ID =  new Label("id");
        TextField id = new TextField("");
         deletecoach = new Button("Delete Coach");
         deletecoach.setOnAction(event -> {
             

               try{
                  Coach a=new Coach();
                  a.deleteCoach(Integer.parseInt(id.getText()));
                }catch(Exception e){
                 System.out.println("NOT Found");}

         });
         grid.add(ID , 0 , 0);
          grid.add(id ,1 , 0);
         grid.add(deletecoach,1,2);
        Scene scene = new Scene(grid,500,500);
        primaryStage.setTitle("delete coach");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import health.club.Member;
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
public class DeleteMember extends Application  {
    Stage s1;
    Button deletmember;
    TextField id;
    @Override
    public void start(Stage primaryStage) {
            
       GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(20,20,20,20));
          Label ID =  new Label("id");
         id = new TextField("");
         deletmember = new Button("Delete member");
         deletmember.setOnAction(event -> {
             

               try{
                  Member a=new Member();
                  a.deletemember(Integer.parseInt(id.getText()));
                  restdata();
                }catch(Exception e){
                 System.out.println("NOT Found");}

         });
         grid.add(ID , 0 , 0);
          grid.add(id ,1 , 0);
         grid.add(deletmember,1,2);
        Scene scene = new Scene(grid,500,500);
        primaryStage.setTitle("delete member");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    protected void restdata(){
   id.setText("");
   
   }
    
}

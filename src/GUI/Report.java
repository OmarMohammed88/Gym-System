/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import health.club.Admin;
import health.club.Member;
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

/**
 *
 * @author abdo
 */
public class Report extends Application {
    TextArea Report;
    TextField id;
    @Override
    public void start(Stage primaryStage) {
         GridPane grid = new GridPane();
       grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(20,20,20,20));
        
        Scene scene = new Scene(grid,300,300);
      
        Label Id =  new Label("ID");
       
         id = new TextField("");
        
         Report = new TextArea();
        
        Label report = new Label("Report");
        
        Button send = new Button("Send");
         send.setOnAction(event -> {


try{
                 
                 Admin c =new Admin();
             if(!id.getText().equals(""))
             {
                 c.setreport(Integer.parseInt(id.getText()),Report.getText());
             }
            
             }catch(Exception e){
                 System.out.println(e);
                  }
         });
    
    
        grid.add(Id , 0 , 0);
        grid.add(id , 0 , 1);
        grid.add(report,0,2);
        
        grid.add(Report,0,3);
        grid.add(send, 0, 4);
       
        primaryStage.setTitle("report");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 protected void restdata(){
   id.setText("");
   Report.setText("");
   }
    
}

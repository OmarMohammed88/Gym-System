/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprofile;

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
public class Myprofile extends Application {
    
    @Override
    public void start(Stage primaryStage) {
             GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER_LEFT);
        grid.setPadding(new Insets(20,20,20,20));
         Label ID =  new Label("Id");
        TextField id = new TextField("");
         Label Newpass =  new Label("New password");
        TextField newpass = new TextField("");
        
         Button btn1 = new Button();
        btn1.setText("Coach name");
         Button btn2 = new Button();
        btn2.setText("Update");
         Button btn3 = new Button();
        btn3.setText("Billing");
        
        
        grid.add(ID , 0 , 0);
        grid.add(id ,1 , 0);
        grid.add(Newpass,0,1);
        grid.add(newpass,1,1);
        grid.add(btn1,1,4);
        grid.add(btn2,1,2);
        grid.add(btn3,1,3);

        
        StackPane root = new StackPane();
        
        Scene scene = new Scene(grid,300, 300);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

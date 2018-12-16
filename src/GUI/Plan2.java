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
public class Plan2 extends Application {
        TextArea Plan;    
        @Override
    public void start(Stage primaryStage) {
Member a=new Member();
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(20,20,20,20));
        StackPane root = new StackPane();
       
        TextField Id=new TextField();
        grid.add(Id,0,1);
        Button n=new Button("IDMember");
        grid.add(n,0,3);
n.setOnAction(event ->{
        
        try{
        a.setId(Integer.parseInt(Id.getText()));
                    JOptionPane.showMessageDialog(null,"The Plan  is : "+ a.getplan());

        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
});
       
        Scene scene = new Scene(grid, 300, 300);
        primaryStage.setTitle("Plan");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}

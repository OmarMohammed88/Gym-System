/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import health.club.Admin;
import health.club.Member;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author abdo
 */
public class Listmember extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        ListView<String>listnames;
        
       Text  title = new Text("members");
        FlowPane root = new FlowPane(10,10);
        root.setAlignment(Pos.CENTER);
        
        
        ObservableList<String>myteam= FXCollections.observableArrayList();
        Admin m=new Admin();
        myteam.add(m.Displayallmembers());
        listnames = new ListView<String>(myteam);
        listnames.setPrefSize(300, 150);
        
        root.getChildren().addAll(title,listnames);     
       
        
        Scene scene = new Scene(root,500,500);
        primaryStage.setTitle("members");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    
}

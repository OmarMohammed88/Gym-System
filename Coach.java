/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coach;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author abdo
 */
public class Coach extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        MenuBar menubar= new MenuBar();
        menubar.prefWidthProperty().bind(primaryStage.widthProperty());
        root.setTop(menubar);
        
        Menu myprofile = new Menu("My Profile");
        Menu plan = new Menu("Plan");
        Menu message = new Menu("message");
        Menu logout = new Menu("log out"); 
        Menu list = new Menu("List");
       
      
        
        
      
        
        menubar.getMenus().addAll(myprofile,plan,message,list,logout);
      
     

        
        
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("Coach");
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

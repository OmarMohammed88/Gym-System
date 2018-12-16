/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plan2;

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
public class Plan2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
          GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER_LEFT);
        grid.setPadding(new Insets(20,20,20,20));
        
        Scene scene = new Scene(grid,300,250);
      
        Label saturday =  new Label("Saturday");
        TextField Saturday = new TextField("");
        Label sunday =  new Label("Sunday");
        TextField Sunday = new TextField("");
        Label monday =  new Label("Monday");
        TextField Monday = new TextField("");
        Label tuesday =  new Label("Tuesday");
        TextField Tuesday = new TextField("");
        Label wednesday =  new Label("Wednesday");
        TextField Wednesday = new TextField("");
        Label thursday =  new Label("Thursday");
        TextField Thursday = new TextField("");
        Label friday =  new Label("Friday");
        TextField Friday = new TextField("");
   
       
        
        
        
        
        grid.add(saturday ,0 , 0);
                grid.add(Saturday , 1 , 0);
        grid.add(sunday ,0 , 1);
                grid.add(Sunday , 1 , 1);
        grid.add(monday ,0 , 2);
                grid.add(Monday , 1 , 2);
        grid.add(tuesday ,0 , 3);
                grid.add(Tuesday , 1 , 3);
        grid.add(wednesday,0 , 4);
                grid.add(Wednesday , 1 , 4);
        grid.add(thursday ,0 , 5);
                grid.add(Thursday , 1 , 5);
        grid.add(friday ,0 , 6);
                grid.add(Friday , 1 , 6);


       
         Button back = new Button("back ");
         grid.add(back,0,7);
         
         
        
        primaryStage.setTitle("My Plan");
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

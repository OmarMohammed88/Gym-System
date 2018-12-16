
package GUI;

import health.club.HealthClub;
import javafx.application.Application;
import javafx.application.Platform;
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
public class memberfx {
    Menu profile;
      MenuItem plan,myprofile,message,logout;
    public void start(Stage primaryStage) {
       BorderPane root = new BorderPane();
        MenuBar menubar= new MenuBar();
        menubar.prefWidthProperty().bind(primaryStage.widthProperty());
        root.setTop(menubar);
         profile = new Menu("My Profile");
         myprofile = new MenuItem("My Profile");
         plan = new MenuItem("Plan");
         message = new MenuItem("message");
         logout = new MenuItem("log out"); 
        menubar.getMenus().addAll(profile);
        profile.getItems().addAll(myprofile,plan,message,logout);
        myprofile.setOnAction((ActionEvent e)->
        {
        Myprofile my = new Myprofile();
     
     try
     {
     my.start(new Stage());
     }catch(Exception ex){
    }
        
        });
        message.setOnAction((ActionEvent e)->
        {
        Membermessage mm = new Membermessage();
     
     try
     {
     mm.start(new Stage());
     }catch(Exception ex){
    }
        
        });
        plan.setOnAction((ActionEvent e)->
        {
        Plan2 p = new Plan2();
     
     try
     {
     p.start(new Stage());
     }catch(Exception ex){
    }
        
        });
        logout.setOnAction((ActionEvent e)->
        {
        HealthClub admin=new HealthClub();

                primaryStage.close();
            try {
                admin.start(new Stage());
            } catch (Exception ex) {
               System.out.println(ex);
            }
        });
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("member");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

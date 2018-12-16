
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

/**
 *
 * @author abdo
 */
public class cfx extends Application  {
    
     
    MenuItem plan,message,logout,list,myprofile;
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        MenuBar menubar= new MenuBar();
        menubar.prefWidthProperty().bind(primaryStage.widthProperty());
        root.setTop(menubar);
        Menu File = new Menu("My Profile");
         myprofile = new MenuItem("My Profile");
        plan = new MenuItem("Plan");
         message = new MenuItem("message");
         list = new MenuItem("List");
         logout = new MenuItem("log out");
          
        myprofile.setOnAction((ActionEvent e)->
        {
       
        Cprofila lf= new Cprofila ();
     
     try
     {
     lf.start(new Stage());
     }catch(Exception ex){
    }  
        });
        list.setOnAction((ActionEvent e)->
        {
       
        Clist cl= new Clist();
     
     try
     {
     cl.start(new Stage());
     }catch(Exception ex){
    }  
        });
      plan.setOnAction((ActionEvent e)->
        {
       
        Coachplan cp= new Coachplan ();
     
     try
     {
     cp.start(new Stage());
     }catch(Exception ex){
    }  
        });
        message.setOnAction((ActionEvent e)->
        {
       
        Coachmessage cm= new Coachmessage();
     
     try
     {
     cm.start(new Stage());
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
        menubar.getMenus().addAll(File);
      File.getItems().addAll(myprofile,list,message,plan,logout);
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Coach");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    


}



package GUI;

import health.club.HealthClub;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ad extends Application {

    Stage s1;
    MenuItem logout,report,search,addcoach,addmember,updatecoach,updatemember,deletecoach,deletemember,Listcoach,ListMember;
    public void start(Stage primaryStage) throws Exception {
      BorderPane root = new BorderPane();
        MenuBar menubar= new MenuBar();
        menubar.prefWidthProperty().bind(primaryStage.widthProperty());
        root.setTop(menubar);
        Menu profile = new Menu("profile");
        report = new MenuItem("report");
         logout = new MenuItem("log out"); 
         search = new MenuItem("search");
        Menu add = new Menu("add");
         addcoach = new MenuItem("addCoach");
         addmember = new MenuItem("addMember");
        Menu update = new Menu("update");
        updatecoach = new MenuItem("updateCoach");
         updatemember = new MenuItem("updateMember");
        Menu delete = new Menu("delete");
        deletecoach = new MenuItem("deleteCoach");
         deletemember = new MenuItem("deleteMember");
        Menu List = new Menu("List");
        Listcoach = new MenuItem("list coachs");
        ListMember = new MenuItem("list members");
       
        addcoach.setOnAction((ActionEvent e)->
        {
        AddCoach addcoach= new AddCoach();
     
     try
     {
     addcoach.start(new Stage());
     }catch(Exception ex){
     System.out.println(ex);
     }
        
        });
        addmember.setOnAction((ActionEvent e)->
        {
        Addmember addmember= new Addmember();
     
     try
     {
     addmember.start(new Stage());
     }catch(Exception ex){
         System.out.println(ex);
    }
        
        });
       updatecoach.setOnAction((ActionEvent e)->
        {
        Updatecoach updata= new Updatecoach();
     
     try
     {
     updata.start(new Stage());
     }catch(Exception ex){
      System.out.println(ex);
     }
        
        });
        updatemember.setOnAction((ActionEvent e)->
        {
        Updatemember upd= new Updatemember();
     
     try
     {
     upd.start(new Stage());
     }catch(Exception ex){
      System.out.println(ex);
     }
        
        });
       deletecoach.setOnAction((ActionEvent e)->
        {
        Deletecoach dc =new Deletecoach();
     
     try
     {
     dc.start(new Stage());
     }catch(Exception ex){
      System.out.println(ex);
     }
        
        });
       deletemember.setOnAction((ActionEvent e)->
        {
        DeleteMember dm =new DeleteMember();
     
     try
     {
     dm.start(new Stage());
     }catch(Exception ex){
      System.out.println(ex);
     }
        
        });
        search.setOnAction((ActionEvent e)->
        {
        Search s =new Search();
     
     try
     {
     s.start(new Stage());
     }catch(Exception ex){
      System.out.println(ex);
     }
        
        });
       report.setOnAction((ActionEvent e)->
        {
        Report r =new Report();
     
     try
     {
     r.start(new Stage());
     }catch(Exception ex){
      System.out.println(ex);
     }
        
        });
        Listcoach.setOnAction((ActionEvent e)->
        {
        Listcoaches lc =new Listcoaches();
     
     try
     {
     lc.start(new Stage());
     }catch(Exception ex){
      System.out.println(ex);
     }
        
        });
        ListMember.setOnAction((ActionEvent e)->
        {
        Listmember lm = new Listmember();
     
     try
     {
     lm.start(new Stage());
     }catch(Exception ex){
      System.out.println(ex);
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
        menubar.getMenus().addAll(profile,add,update,delete,List);
        profile.getItems().addAll(search,report,logout);
        add.getItems().addAll(addcoach,addmember);
        update.getItems().addAll(updatecoach,updatemember);
        delete.getItems().addAll(deletecoach,deletemember);
        List.getItems().addAll(Listcoach,ListMember);
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Admin");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }    }


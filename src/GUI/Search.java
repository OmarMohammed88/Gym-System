/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import health.club.Coach;
import health.club.Member;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author abdo
 */
public class Search extends Application {
    TextField id,name,SerachID;
    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(20,20,20,20));
        
        Scene scene = new Scene(grid,500,500);
      
        Label ID =  new Label("Id");
         id = new TextField("");
        Label Name =  new Label("Full name");
         name = new TextField("");
        grid.add(ID , 0 , 3);
        grid.add(id ,1 , 3);
        grid.add(Name , 0 , 4);
        grid.add(name ,1 , 4);
       
       
        

        Label Id =  new Label("ID");
        Id.setAlignment(Pos.CENTER);
        
         SerachID = new TextField("");
         grid.add(Id , 0 , 0);
        grid.add(SerachID , 1 , 1);
         Button search = new Button("Search");
         grid.add(search,0,2);
        search.setOnAction(event -> {
            Coach a=new Coach();
Member m=new Member();            

           
         if(!SerachID.getText().equals(""))
         {
         try
         {
             Coach c= a.searchCoach(Integer.parseInt(SerachID.getText()));
            if(c.getId()>0)
            {setcoach(c);
            }

          Member z=m.searchMember(Integer.parseInt(SerachID.getText()));
          if(z.getId()>0)
          {  
              setmember(z);
          }

         }catch(Exception e){
         System.out.println(e);}

         }else {JOptionPane.showMessageDialog(null,"InCorrect!");}

         });   
        
        primaryStage.setTitle("Search");
        primaryStage.setScene(scene);
        primaryStage.show();
    }  
    public void setcoach(Coach x)
    {
      id.setText("" + x.getId());
    name.setText("" + x.getName());
   
    }
    public void setmember(Member x)
    {
      id.setText("" + x.getId());
      name.setText("" + x.getName());
   
    }
    
 protected void restdata(){
   id.setText("");
   name.setText("");
  
   }
}


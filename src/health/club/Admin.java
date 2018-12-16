package health.club;

import java.awt.image.BufferStrategy;
import java.io.Serializable;
import java.util.ArrayList;

public class Admin extends Parent implements Serializable{


   protected final String adminfilename="Admin.bin";
  public static Admin admin=new Admin();
        ArrayList<Admin> admins=new ArrayList<Admin>();


    public Admin(String Name,int age,char Gender,String Email,String nameAdress,int id,String password)
    {
        super(Name,age,Gender,Email,nameAdress,id,password);
    }

    public Admin() {

    }

    @Override
 public void setPassword(String password)
 {
        this.password="123";
 }
    
    @Override
    public void setName(String name) {
        super.setName("Admin");
    }

    
     public void setreport(int id , String report)
    {Member x=new Member();
    x.setreport(id, report);    
    }

    
     public void loadfromfile(){
        admin = (Admin) FM.read(adminfilename);
    }
    public void Committofile()
    {
        FM.write(adminfilename,admin);
    }

    public void alterusername(String newusername)
    {
        loadfromfile();
       admin.Name=newusername;
  
       Committofile();
    }

    public void alterpassword(String newpassord)
    {
        loadfromfile();
        admin.password=newpassord;
        Committofile();
    }



    public void addmember(String name, int age, char Gender, String email, String adress, int ID, String date,String password,String coachname,double getBilling)
    {
        Member x=new Member(name,age,Gender,email,adress,ID,date,password,coachname,getBilling);
        if(x.addmember())
            System.out.println("Member added successfully!");
        else
            System.out.println("Failed to insert!");
    }

    public String Displayallmembers()
    {
    
        Member x=new Member();
        return (x.displayallMembers());
    
    }




    public void searchForMember(int id) {
        Member x = new Member();
        System.out.println(x.searchMember(id));
    }

    public void updateMember(Member newMemberValues,int id) {
        Member x = new Member();
      x.updatemember(newMemberValues,id);


    }

    public void setbill(int id ,double bill)
    {
        Member x=new Member();
        if(x.setbills(id,bill))
            System.out.println("bill is set successfully .....!  ");
        else
            System.out.println("Failed to set.....!");
    }
    
    public void deleteMember(int Id) {
        Member x = new Member();
        if (x.deletemember(Id)) {
            System.out.println("Member: "+ Id + " Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }




    public void addcoach(String name, int age, char Gender, String email, String adress, int ID,String password)
    {
        Coach x=new Coach(name,age,Gender,email,adress,ID,password);
        if(x.addCoach())
            System.out.println("coach added successfully!");
        else
            System.out.println("Failed to add coach ");
    }


    public void displayCoachs() {
        Coach x = new Coach();
        System.out.println(x.displayallcoaches());
    }

    public void searchForCoach(int id) {
        Coach x = new Coach();
        System.out.println(x.searchCoach(id));
    }

    public void updateCoach(int oldID, Coach newCoachValues) {
        Coach x = new Coach();
        if (x.updateCoach(oldID, newCoachValues)) {
            System.out.println(newCoachValues.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }
    }

    public void deleteCoach(int Id) {
        Coach x = new Coach();
        if (x.deleteCoach(Id)) {
            System.out.println("Coach: "+ Id + " Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }


    public String ToString() {
        return "Fisrt :" + this.getName() + "\nAge:" + this.getAge() + "\nGander: " + this.getGender() + "\nCoach_id: " + this.getId() + "\nEmail-Member: " + this.getEmail()  ;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public boolean login(String username,String password)
    {
        loadfromfile();
        for(Admin x:admins)
        {
            if (x.Name.equals(username))
            {
                if(x.password.equals(password))
                    return true;
            }
        }
        return false;
    }

}

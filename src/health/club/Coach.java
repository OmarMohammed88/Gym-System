package health.club;

import java.util.ArrayList;
import java.io.Serializable;

public class Coach extends Parent implements Serializable{

  
    ArrayList<Member> trainers=new ArrayList<Member>();

    public Coach(String name, int age, char Gender, String email, String adress, int ID,String password) {
        super(name, age, Gender, email, adress, ID,password);
    }

    public Coach() {

    }

private String SendMassage;
private double salary;

    public double getSalary() {
       loadfromfile();
       int index=getCoachindex(this.Id);
        return coaches.get(index).salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    private final String Coachfilename="Coach.bin" ;

    public  static  ArrayList<Coach> coaches=new ArrayList<Coach>();

    public boolean addCoach(){
        loadfromfile();
        coaches.add(this);
        return Committofile();
    }
    public void loadfromfile(){

Object obj =FM.read(Coachfilename);
if(obj==null)
    coaches=new ArrayList();
else
    coaches=(ArrayList<Coach>)obj ;        
//coaches = (ArrayList<Coach>) FM.read(Coachfilename);
    }

    public boolean Committofile(){
        return FM.write(Coachfilename,coaches);
    }

    private int getCoachindex(int id){
        loadfromfile();
        for(int i=0;i<coaches.size();i++)
        {
            if(coaches.get(i).getId() == id)
                return i;
        }
        return -1;
    }
    public Coach searchCoach(int id) {
        loadfromfile();
        int index = getCoachindex(id);
        if (index != -1) {
            return coaches.get(index);
        } else {
            return new Coach();
        }
    }

    public String displayallcoaches()
    {
        loadfromfile();
        String s ="\nAll Coaches\n";
        for (Coach x:coaches)
            s=s+x.toString();
        return s;

    }

// id
    public boolean updateCoach(int oldid,Coach x)
    {
        loadfromfile();
        int index = getCoachindex(oldid);
        if(index!=+1) {
            coaches.set(index,x);
            return Committofile();
        }
        return false;
    }

    public boolean deleteCoach(int id)
    {
        loadfromfile();
        int index =getCoachindex(id);
        if(index!=-1) {
            coaches.remove(index);
            return Committofile();
        }
        return false;
    }

    public boolean setSalary(int id ,double salary)
    {
        loadfromfile();
        int index =getCoachindex(id);
        coaches.get(index).salary=salary;
        return Committofile();
    }
    
    
    public boolean settrainers(int id,Member trainer)
    {
        loadfromfile();
        int index= getCoachindex(id);
        coaches.get(index).trainers.add(trainer);
       trainer.coachname= coaches.get(index).Name;
       return Committofile();
    }

    public String trainersname()
    {
        loadfromfile();
        String s="\nAll Trainers\n";
        for(Member x:trainers)
        {
            s=s+" : "+x.Name;
        }
        return s;
    }

    public void getreport()
    {
        Member x=new Member();
        System.out.println(x.getReport());
    }
   public void setMassage(String massage){
       this.SendMassage=massage;
   } 
   
public void SendMassageForSpecificM(int id,String massage){
   Member x=new Member();
   x.SendMassageforSpecificID(id, massage);
}
public void SendMassageForAll(String massage){
    loadfromfile();
    for(Member x :trainers){
        x.GetMassage=massage;
    }
   Committofile();
}
    
    public boolean makeplan(String plan) {
        loadfromfile();
        int index = getCoachindex(this.Id);
        for (Member x : coaches.get(index).trainers)
            x.setplan(plan);
        
     return Committofile();
    }


    public boolean login(String username,String password)
    {
        loadfromfile();
        for(Coach x:coaches)
        {
            if (x.Name.equals(username))
            {
                if(x.password.equals(password))
                    return true;
            }
        }
        return false;
    }
// password 
    public boolean alterDATA(int ID,String password)
    {
        loadfromfile();
        int index = getCoachindex(this.Id);
       if(index!=+1) {
        coaches.get(index).setId(ID);
        coaches.get(index).setPassword(password);
        return  Committofile();
       }
          return false;   
    }
    
    public String toString() {
        return "Name :" + this.getName()+"\nSalary:"+this.getSalary() +"\nID: " + this.getId() + "\nEmail: " + this.getEmail() +"\nTrainers\n"+this.trainersname();
    }
}

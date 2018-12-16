package health.club;

import static health.club.Coach.coaches;
import java.io.Serializable;

import java.util.ArrayList;

public class Member extends Parent implements Serializable {
   
    private double biiling;
    protected  String report ;
    protected String GetMassage;
    protected String coachname; /*admin assign coach*/
    protected double getBilling; /*admin set bills*/
    protected String Plan;/*coach sets plan*/
   
    ArrayList<Coach> coaches=new ArrayList<Coach>();

    public Member(String name, int age, char Gender, String email, String adress, int ID,String password,String coachname) {
        super(name, age, Gender, email, adress, ID,password);

        this.coachname=coachname;

    }

    private final String memberfilename ="Member.bin";

    public static ArrayList<Member> members=new ArrayList<Member>();

    
    
    public double getBiiling() {
        loadfromfile();
        int index=getMemberindex(this.Id);
        return members.get(index).getBilling;
    }

    public void setBiiling(double biiling) {
        this.biiling = biiling;
    }



    public Member() {

    }

    Member(String name, int age, char Gender, String email, String adress, int ID, String date, String password, String coachname, double billing) {

    }


    public String  getEmail(){
     loadfromfile();
     int index=getMemberindex(this.Id);
     return members.get(index).Email;
    }
    public String getCoachName() {
        loadfromfile();
       int index=getMemberindex(this.Id);
       
        return members.get(index).coachname;
    }


    public String GetMassages(){
        loadfromfile();
        int index=getMemberindex(this.Id);
        
        return members.get(index).GetMassage;
   }


public boolean setCoachesname(int id,Coach x)
    {
    
     loadfromfile();
    int index= getMemberindex(id);
   coachname= members.get(index).coaches.get(index).getName();
       
       return Committofile();
    }
    

    
    public boolean addmember(){
     // loadfromfile();
        members.add(this);
        return Committofile();
    }
    
    public void loadfromfile(){
Object obj =FM.read(memberfilename);
if(obj==null)
    members=new ArrayList();
else
    members=(ArrayList<Member>)obj ;  
    }
    
    public boolean Committofile(){
        return FM.write(memberfilename,members);
    }

    private int getMemberindex(int id){
        loadfromfile();
        for(int i=0;i<members.size();i++)
        {
            if(members.get(i).getId() == id)
                return i;
        }
        return -1;
    }

    public Member searchMember(int id) {
        loadfromfile();
        int index = getMemberindex(id);
        if (index != -1) {
            return members.get(index);
        } else {
            return new Member();
        }
    }

    public String displayallMembers()
    {
        loadfromfile();
        String s ="\nAllMemebers\n";
        for (Member x:members) {
            s = s + x.toString();
        }
        return s;

    }

    public boolean setbills(int id ,double bill)
    {
        loadfromfile();
        int index =getMemberindex(id);
        members.get(index).getBilling=bill;
        return Committofile();
    }


    public boolean updatemember(int oldid,Member x)
    {
        loadfromfile();
        int index = getMemberindex(oldid);
        if(index!=+1) {
            members.set(index,x);
            return Committofile();
        }
        return false;
    }

    public boolean deletemember(int id)
    {
        loadfromfile();
        int index =getMemberindex(id);
        if(index!=-1) {
            members.remove(index);
            return Committofile();
        }
        return false;
    }

    public boolean setreport(int id , String report)
    {
        loadfromfile();
        int index= getMemberindex(id);
        members.get(index).report=report;
       return Committofile();
    }

    public boolean SendMassageforSpecificID(int id,String massage){
        loadfromfile();
        int index = getMemberindex(id);
        members.get(index).GetMassage=massage;
        
     return Committofile();
}
   
    
    public String getReport()
    {
//        loadfromfile();
//        int index=getMemberindex(id);
//        return members.get(index).report;
        return this.report;
    }

    public boolean setplan(String plan)
    {
        loadfromfile();
        int index = getMemberindex(this.Id);
        members.get(index).Plan=plan;
        return Committofile();
    }

    public String getplan()
    {
        loadfromfile();
        int index=getMemberindex(this.Id);
      return members.get(index).Plan;
    }

    public boolean login(String username,String password)
    {
        loadfromfile();
        for(Member x:members)
        {
            if (x.Name.equals(username))
            {
                if(x.password.equals(password))
                    return true;
            }
        }
        return false;
    }
    
    public boolean alterpassword(int id ,String pass)
    {
        loadfromfile();
        int index =getMemberindex(id);
        members.get(index).password=pass;
        return Committofile();
    }
    
    
    public boolean updatemember(Member newmember,int id)
    {
        loadfromfile();
        int index = getMemberindex(id);

        if (index != -1) {
          members.get(index).setbills(id, newmember.getBiiling());

            return Committofile();
        }

        return false;
    }

    public boolean alterDATA(String name, int age, char Gender, String email, String adress,String password)
    {
        loadfromfile();
        int index = getMemberindex(this.Id);
        members.get(index).setName(name);
        members.get(index).setAge(age);
        members.get(index).setGender(Gender);
        members.get(index).setEmail(email);

        members.get(index).setPassword(password);
        return  Committofile();
    }
    
    
    public String toString() {
        return "Fisrt :" + this.getName()+"\n"+ "id: " + this.getId() + "\nEndOfDate: " + this.getEmail() + "\nbelong to Coach: " + this.getCoachName() +"\nplan : " + this.Plan+"\nbill: "+this.getBiiling()+"\n"+"Report: "+this.getReport()+"\nCoach-massage: "+this.GetMassages()+"\n-------\n";
    }

}

package health.club;
import java.io.Serializable;
public abstract class Parent implements Serializable{
    protected String Name;
    protected char Gender;
    protected int age;
    protected String Email;
    protected String nameAdress;
    protected int Id;
    protected String password;

    FileManger FM=new FileManger();
    public Parent() {
        this.setName("unknown");
        this.setAge(0);
        this.setGender('U');
        this.setEmail("UNK");
        this.setId(0);
        this.setPassword("unknown");
    }

    public Parent(String nm, int age, char gender, String email, String adress, int id,String password) {
        this.setName(nm);
        this.setAge(age);
        this.setGender(gender);
        this.setEmail(email);
        this.setId(id);
        this.setPassword(password);
    }

    public void setPassword(String password)
    {
        this.password=password;
    }
    public String getPassword()
    {
        return this.password;
    }
    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return this.Name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setGender(char T) {
        this.Gender = T;
    }

    public char getGender() {
        return this.Gender;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getEmail() {
        return this.Email;
    }

   

    public void setId(int id) {
        this.Id = id;
    }

    public int getId() {
        return this.Id;
    }

    public abstract String toString();
}

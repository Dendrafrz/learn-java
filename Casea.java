
public class Casea {

    private String username;
    private String email;
    private String password;
    private int age;
    private int phone;
    private int dateofbirth;

    public int getAge(){
        return age;
    }
    public int getPhone(){
        return phone;
    }
    public int getDOB(){
        return dateofbirth;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }

    public void setAge ( int newAge){
        age = newAge;
    }
    public void setPhone (int newPhone){
        phone = newPhone;
    }
    public void setDOB (int newDOB){
        dateofbirth = newDOB;
    }
    public void setUsername (String newUsername){
        username = newUsername;
    }
    public void setEmail (String newEmail){
        email = newEmail;
    }
    public void setPassword(String newPassword){
        password = newPassword;
    }
}

public class  LatihanCase {
    public static void main (String[] args){
        Casea encap = new Casea ();
        encap.setUsername("Rezky Yoga");
        encap.setAge(23);
        encap.setDOB(06/12/1998);
        encap.setPhone(081343245625);
        encap.setEmail(rezkyyoga@binus.ac.id);
        System.out.println("username : " + encap.getUsername()+ ", Tanggal Lahir " + encap.getDOB());
    }
}



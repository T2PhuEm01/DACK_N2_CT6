import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Pattern;

class Test {
    public String ten ="", ho ="", email="",pass="",npass="";
    public Test(String ten,String ho,String email,String pass,String npass){
        this.ten =ten;
        this.ho =ho;
        this.email =email;
        this.pass =pass;
        this.npass =npass;
    }
    public  static boolean  ktraten()  {
        String ten="";
        while (ten!="")
        {
            Pattern pUpper=Pattern.compile("^.*[A-Z]+.*$");
            Pattern pLength=Pattern.compile("^.{1,}$");
            if(pUpper.matcher(ten).find() && pLength.matcher(ten).find()){
                break;
            }
            else
            {
                System.out.println("again");
            }
        }
        return true;
    }
    public  static boolean  ktraho()  {
        String ho="";
        while (ho!="")
        {
            Pattern pUpper=Pattern.compile("^.*[A-Z]+.*$");
            Pattern pLength=Pattern.compile("^.{1,}$");
            if(pUpper.matcher(ho).find() && pLength.matcher(ho).find()){
                break;
            }
            else
            {
                System.out.println("again");
            }
        }
        return true;
    }
    public  static boolean  ktraemail() {
        String email="";
        while (email!="")
        {
            Pattern pLower=Pattern.compile("^.*[a-z]+.*$");
            Pattern pSpecial=Pattern.compile("^.*[#?!@$%^&*-]+.*$");
            Pattern pLength=Pattern.compile("^.{10,}$");
            if(pLower.matcher(email).find() && pLower.matcher(email).find()
                    && pSpecial.matcher(email).find() && pLength.matcher(email).find()){
                break;
            }
            else
            {
                System.out.println("again");
            }
        }
        return true;
    }
    public static boolean ktrapass(){
        String pass="";
        while (pass !="")
        {
            Pattern pUpper=Pattern.compile("^.*[A-Z]+.*$");
            Pattern pLower=Pattern.compile("^.*[a-z]+.*$");
            Pattern pDigit=Pattern.compile("^.*[0-9]+.*$");
            Pattern pSpecial=Pattern.compile("^.*[./#?!@$%^&*-]+.*$");
            Pattern pLength=Pattern.compile("^.{8,}$");
            if(pUpper.matcher(pass).find() && pLower.matcher(pass).find() && pDigit.matcher(pass).find() && pLower.matcher(pass).find()
                    && pSpecial.matcher(pass).find() && pLength.matcher(pass).find()){
                break;
            }
            else
            {
                System.out.println("false");
            }
        }
        return true;
    }
    public static boolean ktranpass(){

        String npass="";
        while (npass!="")
        {
            Pattern pUpper=Pattern.compile("^.*[A-Z]+.*$");
            Pattern pLower=Pattern.compile("^.*[a-z]+.*$");
            Pattern pDigit=Pattern.compile("^.*[0-9]+.*$");
            Pattern pSpecial=Pattern.compile("^.*[./#?!@$%^&*-]+.*$");
            Pattern pLength=Pattern.compile("^.{8,}$");
            if(pUpper.matcher(npass).find() && pLower.matcher(npass).find() && pDigit.matcher(npass).find() && pLower.matcher(npass).find()
                    && pSpecial.matcher(npass).find() && pLength.matcher(npass).find()){
                break;
            }
            else
            {
                System.out.println("again");
            }
        }
        return true;
    }
}
public class dangky {
    public  boolean dangky(String ho,String ten, String email,String pass,String npass) {
        Test a = new Test(ho, ten, email, pass, npass);
        if (a.ktraemail() != true && a.ktrapass() != true && a.ktraho() != true
                && a.ktraten() != true && a.ktranpass() != true) {
            System.out.println("NO");
        } else {
            a.ktraho();
            System.out.println("ho:" + ho);
            a.ktraten();
            System.out.println("ten:" + ten);
            a.ktraemail();
            System.out.println("email:" + email);
            a.ktrapass();
            System.out.println("pass:" + pass);
            a.ktranpass();
            System.out.println("nhap lai pass:" + npass);
        }
        return true;
    }

}





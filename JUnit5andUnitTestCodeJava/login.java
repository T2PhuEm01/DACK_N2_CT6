import java.util.regex.Pattern;

class test2 {
    public String email = "", pass = "";

    public test2(String email, String pass) {
        this.email = email;
        this.pass = pass;

    }
    static String[][] arr = {{"Abc@gmail.com", "abc123@A"},{"ABc@gmail.com", "123@Av"},{"ABC@gmail.com", "hoang123@A"},{"BCA@gmail.com", "hoand123@A"},
            {"TTT@gmail.com", "abc123@A"}};


    public static boolean ktraemail() {
        String email = "";
        while (email != "") {
            Pattern pLower = Pattern.compile("^.*[a-z]+.*$");
            Pattern pSpecial = Pattern.compile("^.*[#?!@$%^&*-]+.*$");
            Pattern pLength = Pattern.compile("^.{10,}$");
            if (pLower.matcher(email).find() && pLower.matcher(email).find()
                    && pSpecial.matcher(email).find() && pLength.matcher(email).find()) {
                break;
            } else {
                System.out.println("again");
            }
        }
        return true;
    }

    public static boolean ktrapass() {
        String pass = "";
        while (pass != "") {
            Pattern pUpper = Pattern.compile("^.*[A-Z]+.*$");
            Pattern pLower = Pattern.compile("^.*[a-z]+.*$");
            Pattern pDigit = Pattern.compile("^.*[0-9]+.*$");
            Pattern pSpecial = Pattern.compile("^.*[./#?!@$%^&*-]+.*$");
            Pattern pLength = Pattern.compile("^.{8,}$");
            if (pUpper.matcher(pass).find() && pLower.matcher(pass).find() && pDigit.matcher(pass).find() && pLower.matcher(pass).find()
                    && pSpecial.matcher(pass).find() && pLength.matcher(pass).find()) {
                break;
            } else {
                System.out.println("false");
            }
        }
        return true;
    }
    public static boolean ktratk(String email,String pass){
        int a = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i][0]==email && arr[i][1]==pass ){
                System.out.println("dang nhap thanh cong");
                a=1;
            }
        }
        if(a!=1)
        {
            System.out.println("dang nhap ko thanh cong");
        }
    return false;
    }
}
    public class login {
        public boolean login( String email, String pass) {
            test2 a = new test2(email, pass);
            if(a.ktraemail() != true && a.ktrapass() != true)
            {
                System.out.println("NO");
            }
            else {
                a.ktratk(email,pass);
            a.ktraemail();
                System.out.println("email:" +email);
            a.ktrapass();
                System.out.println("pass:" +pass);
            }
            return true;
        }
    }

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpApp {
    private Pattern pattern1, pattern2, pattern3;
    private Matcher matcher;

    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
    private  static  final  String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,15})";
    private  static  final  String IP_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                                 "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                                 "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                                 "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";


    public  RegExpApp(){
        pattern1 = Pattern.compile(EMAIL_PATTERN);
        pattern2 = Pattern.compile(PASSWORD_PATTERN);
        pattern3 = Pattern.compile(IP_PATTERN);
    }

    boolean checkEmail(String  email){
        matcher = pattern1.matcher(email);
        return matcher.matches();
    }
    boolean checkPass(String  pass){
        matcher = pattern2.matcher(pass);
        return matcher.matches();
    }
    boolean checkIP(String  ip){
        matcher = pattern3.matcher(ip);
        return matcher.matches();
    }

    public static void main(String[] args) {
        RegExpApp d = new RegExpApp();
        System.out.println(d.checkEmail("test@eesti.ee"));
        System.out.println(d.checkPass("password1"));
        System.out.println(d.checkIP("168.168.255.1"));

    }


}

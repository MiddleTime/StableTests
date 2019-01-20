package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpClasses0 {

    public static boolean checkText (String str){
        Pattern parrern = Pattern.compile("^Java$");   //создали шаблон
        Matcher matcher = parrern.matcher(str);    // применили шаблон к полученной строке
        return  matcher.matches();     // вернули результат соответствия строки к правилу

    }

    static  boolean checkTest2(String str){
        Pattern pattern = Pattern.compile(".\\.+(com|ru|org)");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(checkText("Java"));
        System.out.println(checkText("java"));
        System.out.println(checkText("Jaja"));

        String a = "Выхожу адин я на дорогу";
        System.out.println(a.replaceAll("[ао]дин", "вдоем"));

        System.out.println(checkTest2("www.eesti.ee"));



    }
}

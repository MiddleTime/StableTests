package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpReplace {
    public static void main(String[] args) {
        String a = "hello big world";
        System.out.println(a.replace(" ", "/"));

        String b = "hello2352352big2352352world";
        System.out.println(b.replaceAll("\\d+", "-"));

        String c = "hello2352352big2352352world";
        System.out.println(c.replaceFirst("\\d+", "-"));





    }
}

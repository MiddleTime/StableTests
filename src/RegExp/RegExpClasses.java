import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpClasses {
    public static void main(String[] args) throws IOException {
        //"\\b[A-Za-z0-9._%+-]+[@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b"

//        Pattern regex = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
//        Matcher m = regex.matcher("ggrgwergweg erew@google.com wgwergregre4345");
//        if (m.find()){
//            System.out.println(m.start() + " " + m.group() + " ");
//
//        }



//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        str.replaceAll("\\s", " ");
//     //   str.replaceAll("\\+", "");
//        Pattern a = Pattern.compile("которой");
//        Matcher m = a.matcher(str);
//        while (m.find()){
//            System.out.println(m.start() + " " + m.group() + " ");
//        }

//        Pattern regex = Pattern.compile("[0-3a-c%]");   //шаблон того что ищем
//        Matcher m = regex.matcher("ggrgwergw3534 eg erew@%go34ogl3e.co345 m wgwerg5345345regre4345");
//        while (m.find()){
//            System.out.println(m.start() + " " + m.group() + " ");
//        }


//        Pattern regex = Pattern.compile("с[ао]бака");   //шаблон того что ищем
//        Matcher m = regex.matcher("сабака");
//        while (m.find()){
//            System.out.println(m.start() + " " + m.group() + " ");
//        }

//        Pattern regex = Pattern.compile("q[^w]");  // найти q после которого любой символ кроме  w
//        Matcher m = regex.matcher("qwer");
//        while (m.find()){
//            System.out.println(m.start() + " " + m.group() + " ");
//        }

//        Pattern regex = Pattern.compile("q[+]");  // не нужно экранировать в таком случае
//        Matcher m = regex.matcher("q+wer");
//        while (m.find()){
//            System.out.println(m.start() + " " + m.group() + " ");
//        }

//        Pattern regex = Pattern.compile("[\\\\]");  // для того чтобы найти слеш
//        Matcher m = regex.matcher("\\");
//        while (m.find()){
//            System.out.println(m.start() + " " + m.group() + " ");
//        }
//        Pattern regex = Pattern.compile("[\\Q[-]\\E]");  // уже ищет буквально что есть внутри Q и E
//        Matcher m = regex.matcher(" wwt4-w4[ 334]34t3-");
//        while (m.find()){
//            System.out.println(m.start() + " " + m.group() + " ");
//        }

//        Pattern regex = Pattern.compile("\\s");  // идем все возможные пробелы
//        Matcher m = regex.matcher(" wwt4-w4[ 3  34]34t3-");
//        while (m.find()){
//            System.out.println(m.start() + " " + m.group() + " ");
//        }
//                Pattern regex = Pattern.compile("\\D\\S");  // бессмысленно так как найдет все без какого либо отбора
//        Matcher m = regex.matcher(" wwt4-w4[ 3  34]34t3-");
//        while (m.find()){
//            System.out.println(m.start() + " " + m.group() + " ");
//        }



    }
}

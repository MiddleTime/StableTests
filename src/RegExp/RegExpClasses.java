package RegExp;

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


//        Pattern regex = Pattern.compile("[А-ЯA-Z].{15,}?(\\.|\\!|\\?)(?=\\ |\\r|\\n|$)");  //разбить текст на отдельне предложения, с новвой строк каждое
//        Matcher m = regex.matcher("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce dapibus tellus nec nulla gravida, sed congue nunc hendrerit. Integer interdum elementum lorem id rutrum. Ut sit amet interdum mauris. Phasellus mollis ex eleifend lacus molestie dictum. Fusce blandit, ligula non condimentum maximus, massa nisi ullamcorper odio, et vehicula nisl nunc nec orci. Sed neque diam, gravida eu blandit ullamcorper, porttitor non lorem. Etiam sagittis diam a dolor feugiat placerat. Suspendisse enim turpis, imperdiet in tellus sit amet, consectetur porta magna. Suspendisse odio nulla, imperdiet eget augue in, pulvinar hendrerit nunc. Aenean ut cursus tellus, nec vehicula ante. Vestibulum ornare erat non ante tempus, eu aliquet felis dapibus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris eget arcu imperdiet, laoreet erat non, imperdiet leo. Sed arcu mi, ornare non leo sed, faucibus semper nunc.");
//        while (m.find()) {
//            System.out.println(m.group() + " ");
//
//        }
       //  ^([4-6][0-9][0-9])$    - для поиска числа от 400 до 699

//        Pattern regex = Pattern.compile("(?<=(^|;)).*?(?=(;|$|\\r\\n))");
//        Matcher m = regex.matcher("ljewef;fwefwefwefwe;llkjljklwe;ljljl;jwwefwefw;");
//        while (m.find()) {
//            System.out.println(m.group() + " ");
//
//        }  

//        Pattern regex = Pattern.compile("([^\\\\]+$)");
//        Matcher m = regex.matcher("D:\\downloads chrome\\новая каркасная.dt");
//        while (m.find()) {
//            System.out.println(m.group() + " ");
//
//        }


//        Pattern regex = Pattern.compile("<.*?>");
//        Matcher m = regex.matcher("<!DOCTYPE html>\n" +
//                "<html>\n" +
//                "<head>\n" +
//                "\t<meta charset=\"utf-8\" />\n" +
//                "\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
//                "\t<title>Povara</title>\n" +
//                "\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
//                "\t<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"main.css\" />\n" +
//                "\t<script src=\"main.js\"></script>\n" + "ауфуафцафцафуфцфафцаф" +
//                "</head>\n" +
//                "<body>");
//        while (m.find()) {
//            System.out.println(m.group() + " ");
//
//        }
    }
}

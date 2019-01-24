package RegExp;

public class RegExpMatches {
    public static void main(String[] args) {
        //matches - для сравнения текста
        //String a = "Программирование";
        //System.out.println(a.matches("программирование"));


        // http://regexlib.com/CheatSheet.aspx
        /*
        \\ - два обратных слешей означает, что будет спец символ
        \\d - означает одна цифра
        \\w - одна буква  = [a-zA-Z]  - одна англ буква
        +  означает 1 или более
        * означает 0 или более
        ? - 0 или 1 символов ДО

        ( | | ) - одна строка из множества строк. мы может перечислять через или различные варианты
        [a-zA-Z]  - большое множество (не один символ) - в данном примере все англ буквы
                    например [abc] = (a|b|c)
        [0-9] - все возможные цифры   - то же самое \\d
        ^ - отрицание  например [^abc]  - все символы кроме этих
        . - любой символ
        {2}  {2, }  {2, 4}  какое-то конкретное число
              {2} - означает - два символа   например  (\\d{2})  - хотим видеть только две цифры
              {2,}  - два или более символа   (\\d{}2,})   - от двух и более цифр
              {2, 4}  - от двух до 4 символов  (\\d{2,4})  - от двух до 4 цифр
          \\Q.....\\E   - все что внутри можно писать буквально, не экранирую даже например +
         */
       // String b = "3";
       // System.out.println(b.matches("\\d"));
//        String a = "-356546564";
//        System.out.println(a.matches("\\d+"));   //проблема с отриц числами
//        System.out.println(a.matches("-\\d+"));  //решение
//        System.out.println(a.matches("-?\\d+"));  //решение
//
//        String c = "+356546564";
//        System.out.println(c.matches("\\d+"));

        String a =  "4538764";
        String b =  "-4577834";
        String c =  "+45668734";
        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));
//
//        String v = "h9293492";
//        System.out.println(v.matches("[a-zA-Z]\\d+"));
//
//        String vd = "wefwefwh9293492";
//        System.out.println(vd.matches("[a-zA-Z]*\\d+"));  //когда много букв вначале
//
//        String vd2 = "we37fwefwh9293492";
//        System.out.println(vd2.matches("[a-zA-Z37]*\\d+"));  //когда много букв вначале и в середине букв цифры
//
//        //например выдает истину если там нет определенных символов
//        String vd3 = "hello";
//        String vd4 = "ahello";
//        System.out.println(vd3.matches("[^abc]*"));
//        System.out.println(vd4.matches("[^abc]*"));

        //например определить с помощью "." является ли сайт валидным или нет
//        String url = "http://www.google.com";
//        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));

//        String a = "123223";
//        System.out.println(a.matches("\\d{2}"));
//        System.out.println(a.matches("\\d{2,}"));


//        System.out.println("myemail@mail.ru".matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b"));


    }
}

package RegExp;

import java.util.Arrays;

public class RegExpSplit {
    public static void main(String[] args) {
        //split формирует массив
        String a  = "Hello big world";
        String[] worlds = a.split(" ");
        System.out.println(Arrays.toString(worlds));

        String a2  = "Hello,big,world";
        String[] worlds2 = a2.split(",");
        System.out.println(Arrays.toString(worlds2));

        String a3  = "Hello.big.world";
        String[] worlds3 = a3.split("\\.");
        System.out.println(Arrays.toString(worlds3));

        String a4  = "Hello23r2332qbigq3rq2r3r32world";  //выделили строки в положили в массив
        String[] worlds4 = a4.split("\\d+");
        System.out.println(Arrays.toString(worlds4));

    }

}

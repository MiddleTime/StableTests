/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringBufferTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author inbox_bv8awe9
 */
public class Main {
    public static void main(String[] args) throws IOException {
        //System.in - читаем поток байтов
        //InputStreamReader обертка - преобразует поток байтов в поток символов
        //bufferedReader - считывает строки
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str.isEmpty());
        System.out.println(str.length());
        StringBuilder str2 = new StringBuilder(str); 
        System.out.println("You enter: " + str);
        System.out.println("But reverse form will be: " + str2.reverse());
        
        //а теперь посмотрим как работает System.in
//        while(true){
//            int byteValue = System.in.read();
//            System.out.println(byteValue);  //некоторые полученные символы можно получить по компб Alt  +  номер))
//            
//        }
        
//        InputStreamReader isr = new InputStreamReader(System.in);
//        for(;;){
//        int isrValue = isr.read();
//          System.out.println(isrValue); //считывается в один прием. произошло преобразование в UTF-16.  
//          System.out.println((char)isrValue);            
//        }
        
    }
}

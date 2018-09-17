/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startme;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author inbox_bv8awe9
 */
public class StartMe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        int a = 5;
//        Integer b = 10;
//        System.out.println("From " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
//        System.out.println("Value is " + Integer.SIZE);
//        String d = b.toString();
//        //d.getClass()
//    
//        System.out.println(d.getClass().getName());
//        byte[] c = d.getBytes();
//        System.out.println(Arrays.toString(c));
//        char bb = 49;
//        System.out.println(bb);
//       // System.out.println();

    //Scanner input = new Scanner(System.in);
//        System.out.println("Add number");
//        int num = input.nextInt();
//        System.out.println("you have add number " + num);
        
//        LangList lst = new LangList();
//        lst.GetList();
//        
//        GuessWold guess = new GuessWold();
//        guess.GetAnswer();
    
//        Integer aa = 5;
//        System.out.println(Integer.toString(30000, 2));
//        int a =6;
//        int b = 7;
//        int c = a+b;
//        System.out.println(c);
//        String str = "hello friends";
//        System.out.println(str);
        
           // System.out.println(255&1);
           
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Введите что-нибудь на клавиатуре");
           //пример бесконечного цикла и вариант выхода по определенному слову.
//           while (true){
               String str = br.readLine();
//               
//               if (str.equalsIgnoreCase("stop")) {
//                   System.out.println("Stoped...");
//                   break;
//               }
//               System.out.println("you have enter text: " + str);
//           }
//           
//       
int ccc = (int) System.in.read();
        //ВЫЧИСЛИТЬ ФАКТОРИАЛ ЗАДАННОГО ПОЛЬЗОВАТЕЛЕМ ЧИСЛА
        
        Integer counter = Integer.parseInt(str);
        int factorial = 1;
        
        
        if (counter instanceof Integer){
            System.out.println("Вычисляем факториал числа: " + counter);
            do {
            factorial = factorial*counter;
            counter = counter - 1;
                
            }
            while (counter>0);
            System.out.println(factorial);
        
        }
            else {
            System.out.println("Введенное значение не является числом, введите число");
              
        }
           
        
    }
    
    
}

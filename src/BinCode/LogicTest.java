/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinCode;

/**
 *
 * @author inbox_bv8awe9
 */
public class LogicTest {
    public static void main(String[] args) {
        int a = 15;   // 1111
        int b = 10;   // 1010
        System.out.println(a& b);
        
        //перевести число в двоичный тип через обертку
        System.out.println(Integer.toBinaryString(b));
        //еще один способ через обертку
        System.out.println(Integer.toString(b, 2));
        System.out.println(Integer.toString(b, 16));  //в 16-ричной системе

        
        System.out.println(Integer.MAX_VALUE);
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author inbox_bv8awe9
 */
public class Ex1 {
    public static void main(String[] args) {
        int a = 1, n = 2;
        
        // без исключений
       // a = a/(2-n);
       // System.out.println("Result is " + a);
       
       
        
        try {
            a = a/(2-n);
            System.out.println("Result is " + a);
        } catch (Exception e) {
//            System.out.println("Обрабатываем исключения");  //пример индийского кода
//            System.out.println(e);
//            System.out.println(e.getMessage());
        }
    }
}

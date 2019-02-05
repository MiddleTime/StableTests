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
public class StackTr {
    //для просмотра стека вызова  (трассировка стека)
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        method2();
    }
    public static void method2(){
        method3();
    }
    public static void method3(){
        StackTraceElement[] st = Thread.currentThread().getStackTrace();
        for (StackTraceElement temp : st) {
            System.out.println(temp.getMethodName());
        }
    }
    
}

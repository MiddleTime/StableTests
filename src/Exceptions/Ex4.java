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

class MyClass {
    public void myMethod() throws Exception {     // для того, чтобы выбрасывать исключения. не обрабатывать. Иключения можно выбрасывать и можно обрабатывать
        Exception exception = new Exception("Мое исключение");  //
        throw exception;
    }
}

public class Ex4 {
    public static void main(String[] args) {
        try {
            MyClass instance = new MyClass();
            instance.myMethod();
        } catch (Exception e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("Stack trace:");
            e.printStackTrace();
        }
    }
}

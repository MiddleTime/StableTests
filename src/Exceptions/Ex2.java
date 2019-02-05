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
public class Ex2 {
    public static void main(String[] args) {
        Exception ex = new Exception("Мое исключение");  //вариант с созданием ссылки

        try {
            throw ex;  //можем генерировать собственное исключение
        } catch (Exception e) {
            System.out.println("Обработка исключения.");
            System.out.println(e.getMessage());
        }
    }
}

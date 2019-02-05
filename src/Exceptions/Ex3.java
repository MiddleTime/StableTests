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
public class Ex3 {
  public static void main(String[] args) {
        try {
            throw new Exception("Мое исключение"); //сразу создаем исключение без помещения ссылки в переменную как в вар 2
        } catch (Exception e) {
            System.out.println("Обработка исключения.");
            System.out.println(e.getMessage());
        }
    }  
}

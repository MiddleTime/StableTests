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
public class Ex7 {
    public static void main(String[] args) {
        int a = 1, n = 2;

        try {
            System.out.println("Попытка деления на ноль.");  //если поменять местами со след. строка видно как переход сразу к обработке исключения
            System.out.println("a / (2 - n) = " + (a / (2 - n)));
        } catch (Exception e) {
            System.out.println("Обработка исключения.");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Блок finally.");
        }

        System.out.println("Конец кода.");
    }
}

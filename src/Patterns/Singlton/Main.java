/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns.Singlton;

/**
 *
 * @author inbox_bv8awe9
 */
public class Main {
    public static void main(String[] args) {
        DBHelper dbhelper = DBHelper.getInstance();
        DBHelper dbhelper2 = DBHelper.getInstance(); //будет таже самая ссылка что и на 14 строке
//        new DBHelper(); //уже нельзя создать, так как конструктор класса приватный
    }
}

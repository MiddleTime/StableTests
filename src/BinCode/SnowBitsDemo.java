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
public class SnowBitsDemo {
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);
        
        System.out.println("123 в двоичном представлении: ");
        b.show(123);
        
        System.out.println("\n87987  в двоичном представлении: ");
        i.show(87987);
        System.out.println("\n237658768 в двоичном представлении: ");
        b.show(237658768);
        
        //можно также отобразить младшие разряды любого целого числа
        System.out.println("\nМладшие 8 бит числа 87987 в двоичном представлении: ");
        b.show(87987);
    }
}

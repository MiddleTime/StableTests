/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadTests;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author inbox_bv8awe9
 */
public class Bankomat1 {
    
    static int money  = 100;                  //volatile - не поможет и никакая проверка не поможет...
    
    static void getMoney(int amount){
        if(amount<=money){
            try {
                Thread.sleep(100);  //эмулируем задержку транзакции (пересчет денег...)  Пример с щенками...
            } catch (InterruptedException ex) {
                Logger.getLogger(Bankomat1.class.getName()).log(Level.SEVERE, null, ex);
            }
            money -= amount;
            System.out.println("Congrat! new amount: " + money);
        }else {
            System.err.println("Not enough money!");
        }
    }
public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Vasya: ");
            Bankomat1.getMoney(50);
        }).start();
        new Thread(() -> {
            System.out.println("Petya: ");
            Bankomat1.getMoney(50);
        }).start();
        new Thread(() -> {
            System.out.println("Gavrilla: ");
            Bankomat1.getMoney(50);
        }).start();
        new Thread(() -> {
            System.out.println("Lola: ");
            Bankomat1.getMoney(50);
        }).start();
    }
    
}

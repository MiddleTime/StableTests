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
public class Bankomat2 {
    
    static int money  = 100;                  
    
    //делаем блокировку, чтобы когда один поток зашел в этот метод, то другой уже не может зайти 
    //метод-туалет)))   выстраиваем потоки в очередь  (первый зашедший закрывает ключом кричит "Занято!"
    //минус - производительность. Ресурсы тратяться на работу с ключами
    //фоном создает ключ - this если не статический и если статический то сам класс
    synchronized static void getMoney(int amount){
        if(amount<=money){
            try {
                Thread.sleep(1000);  
            } catch (InterruptedException ex) {
                Logger.getLogger(Bankomat2.class.getName()).log(Level.SEVERE, null, ex);
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
            Bankomat2.getMoney(50);
        }).start();
        new Thread(() -> {
            System.out.println("Petya: ");
            Bankomat2.getMoney(50);
        }).start();
        new Thread(() -> {
            System.out.println("Gavrilla: ");
            Bankomat2.getMoney(50);
        }).start();
        new Thread(() -> {
            System.out.println("Lola: ");
            Bankomat2.getMoney(50);
        }).start();
    }
    
}

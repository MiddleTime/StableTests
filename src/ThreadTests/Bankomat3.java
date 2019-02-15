/*
 *делаем только внутри метода блокировки
 */
package ThreadTests;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author inbox_bv8awe9
 */
public class Bankomat3 {

    static int money = 100;
    static Object key = new Object(); //делаем простой ключ. нужен како-то ссылочный тип
    
    
    //блокируем не все... используем ключ явно. 
    static void getMoney(int amount) {
        synchronized(key) {
            if (amount <= money) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Bankomat3.class.getName()).log(Level.SEVERE, null, ex);
                }
                money -= amount;
                System.out.println("Congrat! new amount: " + money);
            } else {
                System.err.println("Not enough money!");
            }
        }
        System.out.println("...done...");
    }

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Vasya: ");
            Bankomat3.getMoney(50);
        }).start();
        new Thread(() -> {
            System.out.println("Petya: ");
            Bankomat3.getMoney(50);
        }).start();
        new Thread(() -> {
            System.out.println("Gavrilla: ");
            Bankomat3.getMoney(50);
        }).start();
        new Thread(() -> {
            System.out.println("Lola: ");
            Bankomat3.getMoney(50);
        }).start();
    }

}

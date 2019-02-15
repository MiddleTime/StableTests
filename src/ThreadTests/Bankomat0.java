/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadTests;


/**
 *
 * @author inbox_bv8awe9
 */
public class Bankomat0 {
    static int money  = 100;
    
    static void getMoney(int amount){
        if(amount<=money){
            money -= amount;
            System.out.println("Congrat! new amount: " + money);
        }else {
            System.err.println("Not enough money!");
        }
    }
public static void main(String[] args) {
        new Thread(() -> {
            System.out.print("Vasya: ");
            Bankomat0.getMoney(50);
        }).start();
        new Thread(() -> {
            System.out.print("Petya: ");
            Bankomat0.getMoney(50);
        }).start();
        new Thread(() -> {
            System.out.print("Gavrilla: ");
            Bankomat0.getMoney(50);
        }).start();
    }
    
}

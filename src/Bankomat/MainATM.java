/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bankomat;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author inbox_bv8awe9
 */
public class MainATM {
    static int amount = 100;
    
     static void getMoney(int a){  //это не синхронизированный метод, поэтому потоки спишут больше денег
    //synchronized static void getMoney(int a){
        if (amount >= a) {
            try {
                Thread.sleep(10); //эмулируем чтобы потоки могли списать больше денег чем есть
                
            } catch (InterruptedException ex) {
                Logger.getLogger(MainATM.class.getName()).log(Level.SEVERE, null, ex);
            }
        amount -=a;
        System.err.println("ok: " + amount);    
        }
    }
    public static void main(String[] args) throws InterruptedException {
       
        //без лямбда
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                getMoney(80);
//            }
//        };
        
        // а это уже с лямбда
        Runnable runnable = () -> {
             getMoney(80);
         };
        
        Thread thread1 = new Thread(runnable);
        thread1.start();
        
        Thread thread2 = new Thread(runnable);
        thread2.start();
        
// еще вариант но не совсем правильный
        Thread thread3 = new Thread(() -> {
            new MainATM().getMoney(80);
        });
        //без лямбды
//        Thread thread3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                 new MainATM().getMoney(80);
//            }
//        });
        thread3.start();
        
        //необходимо объединить наш главный поток с другими, иначе сумма остатка так и останется 100
        //из-за того, что все эти созданные потоки "засыпают" на 10 милисек. А главный поток - нет.
        thread1.join();
        thread2.join();
        thread3.join();
        
        
        System.err.println(" result amount: " + amount);
        
    }
    
}

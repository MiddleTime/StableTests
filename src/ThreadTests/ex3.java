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
public class ex3 {
    static class Recipe implements Runnable{
        
        
        @Override
        public void run() {
            //пример приостановки потока
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ex3.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.err.println("... готовим по рецепту...");
        }
    }
    
    public static void main(String[] args) {
        Thread thread = new Thread(new Recipe());            
        thread.start();  //стартует новый поток и выполняется все из его метода run (написан на С)
        
        thread.setName("Cook");
        System.err.println(thread.getName());
        System.err.println(Thread.currentThread().getName());
        //какой-то поток может раньше вызвать свой метод (если несколько раз запустить)... так как два "Повара"
    }
    
}

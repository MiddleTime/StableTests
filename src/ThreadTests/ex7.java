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
public class ex7 {
    public volatile static boolean flag = true;   //просим НЕ кешировать совместно используемые ресурсы. но доп блокировки
    //НЕзакэшированные переменные работают значительно медленнее
    
    static class ThreadFlagReader extends Thread{

        @Override
        public void run() {
            while(flag){
            }
            System.err.println("ThreadFlagReader completed " + flag);
        }
        
    }
    
    //создадим класс, который будет менять флаг
    static class ThreadFlagSetter extends Thread{

        @Override
        public void run() {
            try {
                sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ex7.class.getName()).log(Level.SEVERE, null, ex);
            }
            flag = false;
            System.err.println("Flag set to " + flag);
            
                
        }
        
    }
    
    public static void main(String[] args) {
        new ThreadFlagReader().start();
        new ThreadFlagSetter().start();   
    }
}

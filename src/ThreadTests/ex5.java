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
public class ex5 {
    static class Recipe implements Runnable{
        
        @Override
         public void run() { 
           
            for (int i = 0; i < 100; i++) {
               System.err.println(Thread.currentThread().getName() + "... готовит... " + i);
            }
        }
    }
    
    public static void main(String[] args) {
        Thread thread = new Thread(new Recipe());            
        thread.start();  
        System.err.println(Thread.currentThread().getName());
        new Thread(new Recipe()).start();
        new Thread(new Recipe()).start();
        new Thread(new Recipe()).start();
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("java 8");
            }
        }); 
        new Thread(() -> {
            System.err.println("java 8");
        });
    }
}

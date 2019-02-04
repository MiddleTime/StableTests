/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisTest;

import java.util.Scanner;

/**
 *
 * @author inbox_bv8awe9
 */
public class Exeption1 {
    public static void main(String[] args) {
        int a = 4;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        try {
           a = a / 0; 
            System.out.println("Result is: " + a);
        } catch (Exception e) {
            //System.out.println(e.getMessage());
        }
        
    }
   
    
    
    
}

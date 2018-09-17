/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestOther;

/**
 *
 * @author inbox_bv8awe9
 */
public class TestMe {
    public static void main(String[] args) {
        String str1 = new String("Katal");
        String str2 = new String("Katal");
        
        if(str1 == str2){
            System.out.println("equal");
        }else {
            System.out.println("not equals");
            
        }
        
        if(str1.equals(str2)){ 
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrivateButAccess;

/**
 *
 * @author inbox_bv8awe9
 */
public class Main {
    public static void main(String[] args) {
        Test test1 = new Test(1);
        Test test2 = new Test(2);
        test1.testing(test2);
        
    }
}

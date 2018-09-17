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
public class Test {
    private int i; //запрещен доступ из других классов, но не из других экземпляров данного класса

    public Test(int i) {
        this.i = i; 
    }
    public void testing(Test test){
        System.out.println(i + test.i);
    }
    
}

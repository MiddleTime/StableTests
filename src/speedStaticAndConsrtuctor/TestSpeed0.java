/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedStaticAndConsrtuctor;

/**
 *
 * @author inbox_bv8awe9
 */
public class TestSpeed0 {
        
    //динамические блок
    {
        System.out.println("We are in block 1");  
    }
    static {   // статический блок, выводится единожды! на уровне класса
        System.out.println("We are in static block 1");
    }

    public TestSpeed0() {
        System.out.println("Constructor has worked ");
    }
    {
        System.out.println("We are in last block 2");
    }
    public static void main(String[] args) {
        TestSpeed0 test = new TestSpeed0();
        TestSpeed0 test2 = new TestSpeed0();  //для демонстации того, что статический блок только один раз отрабатывает
    }
    
}

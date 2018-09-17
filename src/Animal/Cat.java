/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author inbox_bv8awe9
 */
public class Cat extends Animal{
   String nails;
    void killDivan(){
        System.out.println("я уничтожаю диван!!!");
    }

    @Override
    void voice() {
        System.out.println("мяу!!");
        System.out.print("обращаемся к методу предка - ");
        super.voice();
    }
    
}

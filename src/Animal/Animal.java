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
public abstract class Animal {  //абстрактный класс запрещает создавать потомков от этого класса
    String name;
    int age;
    int wight;
    
    void voice(){
        System.out.println("голос предка");
    }
    final void sleep(){    //запретим переопределять этот метод потомкам.
        System.out.println("Сплю...");
    }
    
}

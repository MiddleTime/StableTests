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
public class Bat extends Animal implements Flyable{  //то есть потомок от животного и реализует интерфейс "Летать"

    //раз мы реализуем интерфейс - то ОБЯЗАТЕЛЬНО нужно реализовать методы интерфейса "КРОВАВЫЙ КОНТРАКТ"
    
    @Override
    public void fly() {
        
    }

    @Override
    public void stop(String uha) {
    }
    
    
    
    
}

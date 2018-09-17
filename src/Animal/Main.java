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
public class Main {
    public static void main(String[] args) {
        //пример полиморфизма
        Animal[] animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Fox();
        animals[2] = new Dog();
        animals[3] = new Cat();
        
        for (Animal animal : animals) {
            animal.voice();
            
            if (animal instanceof Cat) {
                ((Cat) animal).killDivan(); //нисходящее преобразование
            }
        
        
      
            
        }
        
        
        
        
    }
}

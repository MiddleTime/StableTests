/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisTest;

/**
 *
 * @author inbox_bv8awe9
 */
public class Person {
    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastName=" + lastName + '}';
    }
    
    
    
    void seyHello(){
        System.out.println("Hello!");
    }
    void sayBye(){
        System.out.println("Bye!");
    }
}

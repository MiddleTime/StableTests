/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisTest;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author inbox_bv8awe9
 */
public class StartTest1 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Sergei", "Petrov"));
        persons.add(new Person("Alexei", "Smirnov"));
        persons.add(new Person("Petr", "Green"));
        
        for (Person person : persons) {
            person.seyHello();
            person.sayBye();
        }
        
        
    }
}

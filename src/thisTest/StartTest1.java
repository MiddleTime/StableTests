/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
        System.out.println("------------------------------");
        Map<Integer, Person> persons2 = new HashMap<>();
        persons2.put(1, new Person("Sergei", "Petrov"));
        persons2.put(2, new Person("Alexei", "Smirnov"));
        persons2.put(3, new Person("Petr", "Green"));
        
         for (Map.Entry<Integer, Person> entry: persons2.entrySet()) {
            //System.out.println(entry.getKey() + ": " + entry.getValue());
            entry.getValue().seyHello();
            entry.getValue().sayBye();
        }
        
    }
}

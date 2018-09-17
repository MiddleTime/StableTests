/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComparatorTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author inbox_bv8awe9
 */
public class Main {
    public static void main(String[] args) {
        List<Persons> persons = new ArrayList<Persons>();
        persons.add(new Persons("Anna", 18));
        persons.add(new Persons("Tin", 22));
        persons.add(new Persons("likaka", 29));
        persons.add(new Persons("Atani", 99));
        
        //делаем при помощи анонимного внутреннем классе - для произвольной сортировки
        Collections.sort(persons, new Comparator<Persons>() {
            @Override
            public int compare(Persons o1, Persons o2) {
                 return o1.name.length() - o2.name.length();
            }
        });
        // и то же самое что выше, только через лямбда
        Collections.sort(persons, (Persons o1, Persons o2) -> o1.name.length() - o2.name.length());
        
         
        for (Persons person : persons) {
            System.out.println(person.name + " "+ person.age);
        }
        
        
    }
}

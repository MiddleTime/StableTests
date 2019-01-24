/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author inbox_bv8awe9
 */
public class StartTest {
    public static void main(String[] args) {
     //просто тест(    //если нужно переименовать везде... 
        System.out.println("Sergei");
        
        
        System.out.println("Sergei");
        
        
        System.out.println("Sergei");
        System.out.println("----------");
    //просто текст)

    // переменная(   но результат одинаков. Нужно добавить фамилию...
    String name = "Sergei";
    
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
     System.out.println("----------");
    //переменная)
    
    //массив(
    //до массива
    
    String myName = "Sergei";
    String myLastname = "Petrov";
    
        System.out.print(myName + " ");
        System.out.println(myLastname);
    System.out.println("----------");
    //массив
    String[] persons = new String[1];
    
    persons[0] = "Sergei Petrov";
    
        System.out.println(Arrays.toString(persons));
    
    System.out.println("----------");
    
    Map<String, String> map = new HashMap<>();
    map.put("Sergei", "Petrov");
        System.out.println(map);
    
    //массивы коллекции)
    
    
    // добавить метод(
    System.out.println("----------");
        
    
    //добавить метод)
    Map<String, String> map2 = new HashMap<>();
    map2.put("Sergei", "Petrov");
    System.out.println(map);
    
    
    System.out.println("Hello!!");
     System.out.println("Bye!!");    
     
     System.out.println("----------");
     
     
     Person myPersons = new Person("Sergei", "Petrov");
        System.out.println(myPersons.toString());
     myPersons.seyHello();
     myPersons.sayBye();
      
     
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCloseMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author inbox_bv8awe9
 */
//пример того как делалось до 8-й Java (без лямбда)
public class Main {


    
    interface Pridicate<T>{
        boolean test(T t);
    }
    
    interface BiOperator<T> {
        T apply(T init, T t);
    }
    
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4);
        List<String> strings = Arrays.asList("bb", "a", "ccc");
        
        System.out.println(filter(integers, new Predicate<Integer>(){
            @Override
            public boolean test(Integer i) {
                return i%2 == 0;
            }
        }));
        
        System.out.println("Reduce (+): " + integers + " -> " + reduce(integers, 0, new BiOperator<Integer>(){
            @Override
            public Integer apply(Integer init, Integer i) {
                return init +i;
            }
        }));
        //Integer[] a = {1,2,3};
      //  ArrayList<Integer> integers2 = new ArrayList<>(a);// нельзя , такак есть второй класс ArrayList в Java
        
    }
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)){
                result.add(t);
            }
        }
        return result;
    }
    private static <T> T reduce(List<T> list, T init, BiOperator<T> biOperetor) {
        for (T t : list) {
            init = biOperetor.apply(init, t);
        }
        return init;
    }
}

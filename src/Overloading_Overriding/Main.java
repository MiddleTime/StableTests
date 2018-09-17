/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading_Overriding;

/**
 *
 * @author inbox_bv8awe9
 */
public class Main {
    public static class Parent {
        public void test(){
            System.out.println("parent.test()");
        }
    }
    public static class Child extends Parent{
        public void test(){
            System.out.println("child.test()");
        }
    }
    public static class Tester {
        public void test(Parent parent){ //Ранее связывание. На этапе компиляцции. OverLoading. Перегрузка
            System.out.println("test parent");
            parent.test(); //Позднее связывание. На этапе исполнения. Override. Полиморфизм. переопределение
        }
        public void test(Child child){
            System.out.println("test child");
            child.test();
        }
    }
    
    public static void main(String[] args) {
        Parent child = new Child();
        child.test();
        
        Tester tester = new Tester();
        tester.test(new Parent());
        tester.test(new Child());
        System.out.println("___________");
        
       //заранее известно, что нужно вызвать метод по строке 24
        tester.test(child); //Ранее связывание. На этапе компиляции. overLoading

    }
    
}

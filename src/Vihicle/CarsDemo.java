/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vihicle;

/**
 *
 * @author inbox_bv8awe9
 */
 class CarsDemo {
     public static void main(String[] args) {
         //конструируем объекты транспортных средств
         Vehicle minivan = new Vehicle(7, 16, 21);
         Vehicle sportCar = new Vehicle(2, 14, 12);
         double gallons;
         int dist = 252;
         
         gallons = minivan.fuelneeded(dist);
         System.out.println("Для преодаления " + dist + " миль мини-фургону требуется "
         + gallons + " of gasoline");
         
         gallons = sportCar.fuelneeded(dist);
         System.out.println("Для преодаления " + dist + " миль sportCar требуется "
         + gallons + " of gasoline");
         //это будет красным цветом и жирным
         //более полно можно найти - Гугл по запросу - ANSI escape codes
         System.out.println((char)27 + "[01;31m" + "Для преодаления " + dist + " миль sportCar требуется "
         + gallons + " of gasoline");
         
         //нарисовать прямоугольник
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 5; j++) {
                 System.out.print("* ");;
                 
             }
             System.out.println("");
                     
         }
         //нарисовать треугольник
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < i; j++) {
                 System.out.print("* ");
                 
             }
             System.out.println("");
             
         }
         
     }
    
}

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
//public abstract class Flyable {  //очень похожи между собой абстрактные классы и интерфейсы
public interface Flyable{   //как КОНТРАКТ
                         //хорошо понимать эту сущность как способность класса (объекта) что-то делать 
                                // или кем-то быть 
                        //интерфейс - по сути это абстрактный класс у корого все методы абстрактны
                      //но еще еще нек отличия. Например, в интерфейсе нельзя создавать переменные
                       // можно делать только константы
    int MAX_COUNT = 100; //даже не надо писать final, так как это интерфейс. 
    void fly();   //обязательно без тела 
    void stop(String uha); //можно с параметрами, но опять же - без тела
} 
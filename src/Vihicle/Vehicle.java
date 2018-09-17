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
public class Vehicle {

    int passenges; //количество пассажиров
    int fuelcap;  // емкость топливного бака
    int spendFuel; //потребление топлива в милях на километр

    //это конструктор
    Vehicle(int p, int f, int m) {
        passenges = p;
        fuelcap = f;
        spendFuel = m;
    }

    //определить дальность поездки транспортного средства
    int range() {
        return spendFuel * fuelcap;
    }

    //рассчитать объем топлива, необходимого транспортному средству для  преодаления заданного расстояния
    double fuelneeded(int miles) {
        return (double) miles / spendFuel;
    }
}

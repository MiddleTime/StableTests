/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns.Singlton;

/**
 *
 * @author inbox_bv8awe9
 */
public class DBHelper {
    private static DBHelper instanse;

    private DBHelper() {
    }
    
    
    public static DBHelper getInstance(){
        if (instanse == null) {
            instanse = new DBHelper();
        }
        return instanse;
    }
}

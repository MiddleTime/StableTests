/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DepandencyInvertion;

/**
 *
 * @author inbox_bv8awe9
 */
public class OrderManager {
    MailSender mailSender;
    
//    public OrderManager(){   //вот так неравильно внедрять зависимости через контруктор. 
//        mailSender = new MailSender();  
//    }

    public OrderManager(MailSender mailSender) {  //так правильно внеднять зависимости
        this.mailSender = mailSender;
    }
    
    
}

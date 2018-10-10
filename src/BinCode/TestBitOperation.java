/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinCode;

/**
 *
 * @author inbox_bv8awe9
 */
public class TestBitOperation {
    public static void main(String[] args) {
        
    byte p1;
    byte p2;
    int result;
    
    //коньюнкция  И
    p1 = 127;      // 0111 1111
    p2 = 1;        // 0000 0001 
    result = p1&p2;// 0000 0001
    System.out.println("коньюнкция: " + result);
    
    //дизьюнкция ИЛИ 
    p1 = 2;         // 0000 0010
    p2 = 1;         // 0000 0001 
    result = p1|p2; // 0000 0011
    System.out.println("дизьюнкция " + result); 
    
    //исключающее ИЛИ  XOR
    p1 = 3;         // 0000 0011
    p2 = 1;         // 0000 0001 
    result = p1^p2; // 0000 0010
    System.out.println("исключающее или " + result); 
    
    //отрицание NOT
    p1 = 1;         // 0000 0001
    result = ~p1; //   1111 1110
    System.out.println("отрицание  " + result); 
    
    //инвертировать знак  - выполнить отрицание, а результат увеличить на 1
    p1 = 5;         
    result = ~p1;
    result++;
    System.out.println("инверсия знака  " + result); 
    
    
    }
}

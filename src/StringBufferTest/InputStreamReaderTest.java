/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringBufferTest;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author inbox_bv8awe9
 */
public class InputStreamReaderTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        for(;;){
        int isrValue = isr.read();
          System.out.println(isrValue); //считывается в один прием. произошло преобразование в UTF-16.  
          System.out.println((char)isrValue);            
        } 
    }
}

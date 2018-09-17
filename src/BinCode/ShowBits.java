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
class ShowBits {
    int numbits;

    ShowBits(int n) {
        numbits = n;
    }
    void show (long val){
        long mask = 1;
        //сдвинуть значения 1 влево на нужную позицию
        mask <<= numbits -1;
        int spacer = 0;
        for (; mask != 0; mask >>>=1) {
            if((val&mask)!=0) System.out.print("1");
            else {
                System.out.print("0");
            }
            spacer++;
            if((spacer%8)== 0){
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
        
    }
    
    
    
}

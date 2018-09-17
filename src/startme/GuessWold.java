/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startme;

import java.io.IOException;

/**
 *
 * @author inbox_bv8awe9
 */
public class GuessWold {

    char ch, ignore, answer = 'S';

    public void GetAnswer() throws IOException {
        do {
            System.out.println("I mean one wold from a-z");
            System.out.println("Try to get");

            //get from user
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) {
                System.out.println("** you are right!!! **");
            } else {
                System.out.println("... sorry, the wold is at the ");
                if (ch < answer) {
                    System.out.println(" closer to the end");
                } else {
                    System.out.println(" closer to the begin");
                }
                System.out.println("try again!\n");
            }
        } while (answer != ch);
    }

}

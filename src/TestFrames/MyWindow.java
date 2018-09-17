/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFrames;

import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

/**
 *
 * @author inbox_bv8awe9
 */
public class MyWindow extends JFrame{
    static JTextArea textArea;
    
    public MyWindow() throws HeadlessException{
        setTitle("hello");
        setSize(300,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        textArea = new JTextArea();
        add(textArea);
        textArea.setText("hello programmer!\n");
        for (int i = 0; i < 20; i++) {
            textArea.setText(textArea.getText() + " you are Super\n");
            
            
        }
        setVisible(true);
        
    }
}   

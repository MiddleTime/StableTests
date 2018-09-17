/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author inbox_bv8awe9
 */
public class Queue {
    char q[]; //array for saving element from queue
    int putloc, getloc; // indexes for inserting and rejecte elements from queue
    
    Queue(int size){
        q= new char[size+1]; //giving  memory for the queue
        putloc = getloc = 0;
             
    }
    //put simbol into queue
    void put(char ch){
       if(putloc == q.length-1){
           System.out.println(" - Queue is full!");
           return;
           }
       putloc++;
       q[putloc] = ch;
    }   
       //get symbol from queue
       char get(){
        if (getloc == putloc){
            System.out.println("Queue is empty");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}

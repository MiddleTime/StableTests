/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueuePriority;

/**
 *
 * @author inbox_bv8awe9
 */
public interface PriorityQueue <K extends Comparable<K>, T>{
    T getMax();
    void insert(K k, T t);
}

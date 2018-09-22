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
public class PriorityQueueImpl<K extends Comparable<K>, T> implements PriorityQueue<K,T>{
    public static final int INITIAL_SIZE = 10;
    private final int MAX_SIZE;
    private MyPair[] queue;
    private int maxCurrentIndex;

    private void popDown(int currIndex) {
        int leftChildIndex = 2*currIndex+1;
        int rightChildIndex = 2*currIndex+2;
        
        if(leftChildIndex > maxCurrentIndex-1){
            return;
        }
        int maxChild = queue[leftChildIndex].getKey().compareTo(queue[rightChildIndex].getKey()) >0 ?
                leftChildIndex:rightChildIndex;
         
        if(queue[currIndex].getKey().compareTo(queue[maxChild].getKey()) <0){
            MyPair temp = queue[maxChild];
            queue[maxChild] = queue[currIndex];
            queue[currIndex] = temp;
            popDown(maxChild);
        }
    }


    
    
    private static class MyPair<K extends Comparable<K>, T>{
        private K key;
        private T object;
        

        public MyPair(K key, T object) {
            this.key = key;
            this.object = object;
        }

        public K getKey() {
            return key;
        }

        public T getObject() {
            return object;
        }
        
        
    }

    public PriorityQueueImpl(int maxSize) {
        this.MAX_SIZE = maxSize;
    }
    public PriorityQueueImpl() {
        this(INITIAL_SIZE);
    }
    
    
    
    @Override
    public T getMax() {
        //принцип топора
        //берем корневой элемент == искомое
        MyPair result = queue[0];
        //2. в корень поместили последний эелемент
        queue[0] = queue[maxCurrentIndex -1];
        queue[maxCurrentIndex - 1] = null;
        maxCurrentIndex--;
        popDown(0);
        return (T) result.getObject();
        
    }
    
    @Override
    public void insert(K k, T t) {
        if(maxCurrentIndex == MAX_SIZE){
            throw new ArrayIndexOutOfBoundsException();
        }
        //принцип поплавка
        //1. поместить в первый свободный элемент
        queue[maxCurrentIndex] = new MyPair(k, t);
        maxCurrentIndex++;
        popUp(maxCurrentIndex -1);
    }
    private void popUp(int currIndex) {
        if(currIndex <= 0){
            return;
        }
        int parentIndex = (currIndex - 1)/2; //получаем индекс родителя по формуле
        //2. проверяем что Родитель > ребенок
        if (queue[parentIndex].getKey().compareTo(queue[currIndex].getKey())<0){
            //если не так то меняем местами
            MyPair temp = queue[parentIndex];
            queue[parentIndex] = queue[currIndex];
            queue[currIndex] = temp;
            //повторить с п. 2
            popUp(parentIndex); 
            
        }
    }

}

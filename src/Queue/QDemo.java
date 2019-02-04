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
public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;
        
        System.out.println("Использование очереди bigQ для сохранения алфавита");
        //Поместить буквенные символы в очеред bifQ
        for ( i = 0; i < 26; i++) 
            bigQ.put((char) ('A'+i));
            
            //извлечь буквенные символы из очереди bigQ и отобразить
            System.out.println("Содержимое очереди bigQ: ");
            for ( i = 0; i < 26; i++) {
                ch = bigQ.get();
                if (ch != (char ) 0) System.out.print(ch);
                
            }
           // System.out.println("\n");
            System.out.println("\nИспользование очереди smallQ для генерации ошибок");
            for (i = 0;  i< 5; i++) {
                System.out.print("Попытка сохранения " + (char) ('Z'-i));
                smallQ.put((char) ('Z'-i));
                System.out.println();
                
            }
            
            
            
            
            
            
            
            
            //дополнительные ошибки при обращении к очереди smallQ
            System.out.println("Содержимое smallQ: ");
            for ( i = 0; i < 5; i++) {
                ch = smallQ.get();
                if (ch != (char) 0) System.out.print(ch);
            } 
            System.out.println(Thread.currentThread().getName());
        
            System.out.println((char)('d'-1));
    } 
        
    }


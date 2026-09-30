/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

import java.util.Scanner;

/**
 *
 * @author jaccc
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Queue queue = new Queue(5);
        int choice = 0;
        boolean isRunning = true;
        
        //RUN CODE WHILE ISRUNNIS IS TRUE -> WHEN FALSE IS CASE 6
        while(isRunning == true){
        System.out.println("\nQueue menu");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Front");
        System.out.println("4. Rear");
        System.out.println("5. Display Queue");
        System.out.println("6. exit");
        
        System.out.print("\nEnter your choice:");
        choice =scanner.nextInt();
        scanner.nextLine();
        
        switch(choice){
        
            //enqueue
            case 1: 
                    queue.enqueue();
                break;
                
            //dequeue   
            case 2: 
                    queue.dequeue();
                break;
                
            //display front    
            case 3: 
                    System.out.println(queue.getFront());
                break;
                
            //display rear         
            case 4: 
                    System.out.println(queue.getRear());
                break;
            
            //display
            case 5: 
                    queue.display();
                break;
            case 6:
                    isRunning = false;
                break;
                
            default:
                    System.out.println("not valid choice");
           
            }
        }
        
        scanner.close();
    }
}

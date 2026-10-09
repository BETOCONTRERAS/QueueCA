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
        
        
        Queue queue = new Queue(8);
        int choice = 0;
        boolean isRunning = true;
        
        try{
        //RUN CODE WHILE ISRUNNIS IS TRUE -> WHEN FALSE IS CASE 6
        while(isRunning == true){
        System.out.println("\nQueue menu");
        System.out.println("1. Enqueue from Rear");
        System.out.println("2. Enqueue from Front");
        System.out.println("3. Dequeue from Rear");
        System.out.println("4. Dequeue from Front");
        System.out.println("5. Front");
        System.out.println("6. Rear");
        System.out.println("7. Display Queue");
        System.out.println("8. exit");
        
        System.out.print("\nEnter your choice: ");
        choice =scanner.nextInt(); //HOW TO SOLVE WRONG INPUT -> LETTERS??!!
        scanner.nextLine();

        switch(choice){
        
            //enqueue
            case 1: 
                    queue.enqueueRear();
                break;
            
            //dequeue   
           case 2: 
                    queue.enqueueFront();
                break;     
            //dequeue   
            case 3: 
                    queue.dequeueRear();
                break;
            
            case 4: 
                    queue.dequeueFront();
                break;   
                
            //display front    
            case 5: 
                    System.out.println("Front value: " + queue.getFront());
                break;
                
            //display rear         
            case 6: 
                    System.out.println("Rear value: " + queue.getRear());
                break;
            
            //display
            case 7: 
                    queue.display();
                break;
            case 8:
                   isRunning = false;
                break;
                
            default:
                    System.out.println("not valid choice");
           
                }
        }  
        }//try finish
        catch (Exception e){
            System.out.println("ERROR");
                 
        }
        
        
        
        scanner.close();
    }
}

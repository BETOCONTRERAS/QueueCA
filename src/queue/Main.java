/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

import java.util.Scanner;
import inpututils.InputUtils;


/**
 *
 * @author jaccc
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        InputUtils in = new InputUtils();
        
        
        Queue queue = new Queue(5);
        int choice = 0;
        boolean isRunning = true;
        
        try{
        //RUN CODE WHILE ISRUNNIS IS TRUE -> WHEN FALSE IS CASE 6
        while(isRunning == true){
        System.out.println("===============================");
        System.out.println("    Food Storage System");
        System.out.println("===============================");
        
        System.out.println("Storage capacityt : 8");
        System.out.println("Food types : Burger, Pizza, Fries, Sandwich, Hotdog\n");
        
        System.out.println("1. Add food from the BACK");
        System.out.println("2. Add food from the FRONT");
        System.out.println("3. Remove food from the BACK");
        System.out.println("4. Remove food from the FRONT");
        System.out.println("5. First Food at the FRONT");
        System.out.println("6. First Food at the BACK");
        System.out.println("7. Display Queue");
        System.out.println("8. Remove ALL");
        System.out.println("9. Exit\n");
        
        choice = in.askUserForInt("\nEnter your choice:");

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
                    System.out.println("\nFront value: " + queue.getFront());
                break;
                
            //display rear         
            case 6: 
                    System.out.println("\nRear value: " + queue.getRear());
                break;
            
            //display
            case 7: 
                    queue.display();
                break;
                
           // case 8: 
                //    queue.removeAll();
              //  break;    
                
            case 9:
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
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue;

import food.Burger;
import food.*;
import inpututils.InputUtils;
import java.time.DateTimeException;
import java.util.Scanner;
import java.time.LocalDate;


/**
 *
 * @author jaccc
 */
public class Queue {
    InputUtils in = new InputUtils();
   
    //CIRCULAR QUEUE
    
    //properties
    private Food[] arr;
    private int front ;
    private int rear ;
    private final int capacity;
    private int size;
    
    //constructor
    public Queue(int capacity){
        
        arr = new Food[capacity];
        this.capacity = capacity;
        front = 0;
        rear = -1;
        size = 0;
        
    }
    
    //if front is equal to 0 is true
    public boolean isEmpty(){
       return size == 0;
    }
    
    //if front is equal to the capacity is true
    public boolean isFull(){
        return size == capacity;
        
    }
    
    //check if array is full, if not value goes to the front and rear increases
    public void enqueueRear(){
        
        if(isFull()){
            System.out.println("\n QUEUE IS FULL \n");
            return;
        }
        
        Food food = askForFood(); // creates one Food object
        rear = (rear + 1) % arr.length;
        arr[rear] = food;
        size++;

        System.out.println("Added " + food.getType() + " to the queue.");
        
        
    }
    
     //enqueue from the front
    public void enqueueFront(){
        if(isFull()){
            System.out.println("\n QUEUE IS FULL \n");
            return;
        }
        
        Food food = askForFood(); // creates one Food object
        
        if(isEmpty()){
            front = 0;
            rear = 0;
        }
        else{
        front = ((front-1)+capacity)%capacity;
        }
        arr[front] = food;
        size++;
        
        System.out.println( "You have enqueued " + food.getType() + " to the index " + front);
        System.out.println("Your top is: " + arr[front].getType() + " and your rear is: " + arr[rear].getType());
    }
    
    
    public void dequeueFront(){
    
        
        
        if(isEmpty()){ //check if empty
            System.out.println("\n QUEUE IS EMPTY \n");
            return;
        }
        
        String deValue = arr[front].getType(); //storing value dequeued
        
        
        //assign front the result of front+1 modulus capacity
        /*
        ***EXAMPLE***
        front=1
        new front = (1+1)%capacity->5= 2
        new front = 2
        
        */
        front = (front + 1) % capacity; 
        size--;     //decrease the counter by 1
        
        if(isEmpty()){
            front = 0;
            rear = -1;
            //output message with the dequeued value
            System.out.println("You have dequeued " + deValue);
            System.out.println("\nQUEUE IS NOW EMPTY\n");
        }
        else{
            System.out.println("You have dequeued " + deValue);
            System.out.println("Your top is: " + arr[front].getType() + " and your rear is: " + arr[rear].getType());
        }
        

    
    }
    
   
    
    //dequeue from the rear
     public void dequeueRear(){
         if(isEmpty()){ //check if empty
            System.out.println("\n QUEUE IS EMPTY \n");
            return;
        }
        
        String deValue = arr[front].getType(); //storing value dequeued
        
        rear = ((rear-1)+capacity)%capacity;
        size--;
        
        
        if(isEmpty()){
            front = 0;
            rear = -1;
            //output message with the dequeued value
            System.out.println("\nYou have dequeued: " + deValue);
            System.out.println("\nQUEUE IS NOW EMPTY\n");
        }
        else{
            System.out.println("You have dequeued: " + deValue);
            System.out.println("Your top is: " + arr[front].getType() + " and your rear is: " + arr[rear].getType());
        }
     }
    
     
    
    public String getFront(){
    
        if(isEmpty()){
            
            return " FOOD TRAY IS EMPTY \n";
        }
       return arr[front].getType();
    }
    
    public String getRear(){
        if(isEmpty()){
            
            return " FOOD TRAY IS EMPTY \n";
        }   
        
        
        return arr[rear].getType();
        }
    
    public void display(){
    
        if(isEmpty()){
         System.out.println("\n QUEUE IS EMPTY \n");
            return;
        }
        
        System.out.println("\n DISPLAYING QUEUE \n");
        
        // for loop to go through array/queue
        for (int i = 0; i < size; i++){
            
            //start loop count at 0, and declare an index which will start at the addition of the front value
            //plus the 0(this will increase by 1) modulus capacity
                    /*
                    ***EXAMPLE***
                    front = 0, i=0, index = (0+0)%capacity->5
                    index= 0
                    display arr at index 0
                    --------------------------
                    front = 0, i =1, index = /(0+1)%capacity->5
                    index= 1
                    display arr at index 1
                    */
            
            int index = (front + i)%capacity;
            System.out.print(arr[index] + " ");
            
        }
        
        System.out.println("\n\n QUEUE FINISHED \n");
        
    }
    
    public void removeAll(){
    
        size = 0;
        front = 0;
        rear= -1;
        
        
    }
 
    //*********************DOUBLE ENDED QUEUE METHODS FINISH HERE *******
    
    
    //**********************METHOD USING FOOD CLASS**********************
    //method
    private Food askForFood() {
        while (true) {
            String type = in.askUserForText(
                "Enter food: Burger, Pizza, Fries, Sandwich, or Hotdog\n\n "
            ).trim();

            switch (type.toLowerCase()) {
                case "burger":
                    return new Burger(askWeight(), askBBD());
                    
                case "pizza":
                    return new Pizza(askWeight(), askBBD());
              
                case "fries":
                    return new Fries(askWeight(), askBBD());
               
                case "sandwich":
                    return new Sandwich(askWeight(), askBBD());
                     
                case "hotdog":
                    return new Hotdog(askWeight(), askBBD());
                 
                    
                
                default:
                    System.out.println("Please enter one of the five listed foods.");
            }
        }
    }

     
     
     public double askWeight(){
        double weight = in.askUserForDouble("Enter the weight of your food (in grams)", 0.01, 2000);
        return weight;
    }
    
    public LocalDate askBBD(){
        LocalDate today = LocalDate.now();
        LocalDate latestAllowed = today.plusDays(14);
        int year, month, day;
        
        while (true) {
            try {
                System.out.print("Year: ");
                year = in.askUserForInt("Please enter a year", 2026, 5000);

                System.out.print("Month (1-12): ");
                month = in.askUserForInt("Please enter the month (1-12):", 1, 12);

                System.out.print("Day: ");
                day = in.askUserForInt("Please enter the day: ", 1, 31);

                LocalDate bbd = LocalDate.of(year, month, day);

                if (bbd.isBefore(today)) {
                    
                    System.out.println("Date cannot be in the past. Try again.");
                    
                } else if (bbd.isAfter(latestAllowed)) {
                    
                    System.out.println("Date must be within the next 14 days. Try again.");
                    
                } else {
                    
                    return bbd;
                }
                
            } catch (NumberFormatException | DateTimeException e) {
                
                System.out.println("Invalid date or number. Please try again.");
                
            }     
             
            
        }
    }
    
    
    
}
   

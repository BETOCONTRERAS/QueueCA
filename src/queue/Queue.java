/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue;

import java.util.Scanner;

/**
 *
 * @author jaccc
 */
public class Queue {
    
    //CIRCULAR QUEUE
    
    //properties
    private int[] arr;
    private int front ;
    private int rear ;
    private int capacity;
    private int size;
    
    //constructor
    public Queue(int capacity){
        
        arr = new int[capacity];
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
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter value to queue: ");
        int value = scanner.nextInt();
        scanner.nextLine();

//assign to rear the result of rear+1 modulus capacity, and then assign the value given to 
        /*
        ***EXAMPLE***
        rear = 2
        new rear = (2+1)% capacity-> 5 = 3
        new rear = 3    
        */
        //the index to the index value of rear
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;                 //increment count

        System.out.println( "You have enqueued " + value + " to the index " + rear);
        
    }
    
     //enqueue from the front
    public void enqueueFront(){
        if(isFull()){
            System.out.println("\n QUEUE IS FULL \n");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter value to queue: ");
        int value = scanner.nextInt();
        scanner.nextLine();
        
        /*
        
        
        */
        if(isEmpty()){
            front = 0;
            rear = 0;
        }
        else{
        front = ((front-1)+capacity)%capacity;
        }
        arr[front] = value;
        size++;
        
        System.out.println( "You have enqueued " + value + " to the index " + front);
        System.out.println("Your top is: " + arr[front] + " and your rear is: " + arr[rear]);
    }
    
    
    public void dequeueFront(){
    
        
        
        if(isEmpty()){ //check if empty
            System.out.println("\n QUEUE IS EMPTY \n");
            return;
        }
        
        int deValue = arr[front]; //storing value dequeued
        
        
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
            System.out.println("Your top is: " + arr[front] + " and your rear is: " + arr[rear]);
        }
        

    
    }
    
   
    
    //dequeue from the rear
     public void dequeueRear(){
         if(isEmpty()){ //check if empty
            System.out.println("\n QUEUE IS EMPTY \n");
            return;
        }
        
        int deValue = arr[front]; //storing value dequeued
        
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
            System.out.println("Your top is: " + arr[front] + " and your rear is: " + arr[rear]);
        }
     }
    
     
    
    public int getFront(){
    
        if(isEmpty()){
            System.out.println("\n QUEUE IS EMPTY \n");
            return -1;
        }
       return arr[front];
    }
    
    public int getRear(){
        if(isEmpty()){
            System.out.println("\n QUEUE IS EMPTY \n");
            return -1;
        }   
        
        
        return arr[rear];
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
    
}
    


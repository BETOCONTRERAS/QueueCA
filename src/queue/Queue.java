/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue;

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
    public void enqueue(int value){
        
        if(isFull()){
            System.out.println("\n QUEUE IS FULL \n");
            return;
        }
        else if(rear == -1){ //if empty set front and top to 0
            System.out.println("elseif");
            front++;
            rear++;
            arr[front] = value;
            System.out.println("You have enqueued " + value + " to the index " + rear);
            
        
        }
        else{
            rear = (rear + 1) % capacity;
            arr[rear] = value;
            System.out.println("You have enqueued " + value + " to the index " + rear);
        }
        
    }
    
    public void dequeue(){
    
        
        
        if(isEmpty()){ //check if empty
            System.out.println("\n QUEUE IS EMPTY \n");
            return;
        }
        
         int deValue = arr[front]; //storing value dequeued
        // if the front and rear are equal, only one item to dequeue, reset values to empty
        if (front == rear){
            
            front = rear = -1;
            System.out.println("You have dequeued "  + deValue);
        }
        else{
            front = (front +1)%capacity;
            System.out.println("You have dequeued "  + deValue);
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
        for (int i = front; i< rear; i++){
            
            System.out.print(arr[i] + " ");
            
        }
        
        System.out.println("\n QUEUE FINISHED \n");
        
    }
    
}
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author jaccc
 */
public class Food {
    
    /*
    this class will create an object a class that holds the basic of any food
    it will be an instance
    */
    
    //properties of a food
    private String type ;
    private int weight;
    private String cuTimeStamp;
    private String BestBefore;
    
    //CONSTRUCTOR
    
    
    //methods NA

    public Food(String type, int weight, String BestBefore) {
     
        this.type = type;
        this.weight = weight;
        //add curent time and date in the format (DD-MM-YYYY)
        cuTimeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.BestBefore = BestBefore;
    }
    
        
    
    
    
    
}

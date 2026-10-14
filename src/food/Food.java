/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package food;
import java.time.LocalDate;

/**
 *
 * @author jaccc
 */
public class Food {
    
    //properties;
    private String type;
    private double weight;
    private LocalDate timeStamp;
    private LocalDate bbd;
    
    //constructor
    
    public Food(String type, double weight, LocalDate bbd) {
        this.type = type;
        this.weight = weight;
        this.timeStamp = LocalDate.now();
        this.bbd = bbd;
    }
    
    
    //getters and setters
    //only have setter is you have to change the value
    //only have get if something else is allowed to see the value

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDate timeStamp) {
        this.timeStamp = timeStamp;
    }

    public LocalDate getBbd() {
        return bbd;
    }

    public void setBbd(LocalDate bbd) {
        this.bbd = bbd;
    }
    

    
    
    
}

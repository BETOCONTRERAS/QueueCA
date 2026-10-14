/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package food;

import java.time.LocalDate;

/**
 * Burger is a subclass of Food
 * 
 * Food is a superclass of Burger
 * @author jaccc
 */
public class Burger extends Food{

    public Burger( double weight, LocalDate bbd) {
        super("BURGER", weight,  bbd);
    }
    
    
    
}

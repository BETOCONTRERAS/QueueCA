/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inpututils;

import java.util.Scanner;

/**
 *
 * @author kheal
 */
public class InputUtils {

    
   /**
    * simple code to ask user to enter text
    * do not allow numbers at all
    * if any numbers entered - display an error and ask again
    * 
    * @param prompt the prompt or question to be asked
    * @return the valid text entered by the user
    */
    public String askUserForText(String prompt) {
        
        Scanner myKB = new Scanner(System.in);
        
        String userInput;
        
        do {
            //this gets repeated
            System.out.print(prompt);
            
            userInput = myKB.nextLine(); //read in 1 line from keyboard
            
        }while (!userInput.matches("[a-zA-Z .,?!\"]+"));
        // at this point the loop guard is FALSE
        
        return userInput;
        
    }
    
    /**
     * Ask the user to enter an integer value
     * if not an integer - display error and ask again
     * @param prompt the prompt or question to ask
     * @return a valid integer entered by user
     */
    public int askUserForInt(String prompt){
        
        Scanner myKB = new Scanner(System.in);
        int userInput=0;
        boolean valid = false;
        
        do{
            //this gets repeated
            try{
                System.out.print(prompt);
                
                userInput = myKB.nextInt(); //this might go wrong
                valid = true;
            }
            catch(Exception e){
                System.out.println("That was not an integer. Please try again.");
                myKB.nextLine(); //prevents infinite loop
            }
            
        }while (!valid);
        //input must be valid
        return userInput;
        
    }
    
    /**
     * Ask user for an integer in a range
     * @param prompt the prompt or question
     * @param minValue the lowest value allowed as an int
     * @param maxValue the highest value allowed as an int
     * @return a valid int within the range specified
     */
    public int askUserForInt(String prompt, int minValue, int maxValue){
        
        Scanner myKB = new Scanner(System.in);
        int userInput=0;
        boolean valid = false;
        
        do{
            //this gets repeated
            try{
                System.out.println(prompt);
                System.out.print("Please enter an number between " + minValue + " and " + maxValue + ": ");
                userInput = myKB.nextInt(); //this might go wrong
                valid = true;
            }
            catch(Exception e){
                System.out.println("That was not an number between " + minValue + " and " + maxValue + ". Please try again.");
                myKB.nextLine(); //prevents infinite loop
            }
            
        }while ( (!valid) || ( (userInput<minValue) || (userInput > maxValue)));
        //input must be valid
        return userInput;
    }
    
    
    /**
     * Ask user for an double in a range
     * @param prompt the prompt or question
     * @param minValue the lowest value allowed as an int
     * @param maxValue the highest value allowed as an int
     * @return a valid int within the range specified
     */
    public double askUserForDouble(String prompt, double minValue, double maxValue){
        
        Scanner myKB = new Scanner(System.in);
        double userInput=0;
        boolean valid = false;
        
        do{
            //this gets repeated
            try{
                System.out.println(prompt);
                System.out.print("Please enter an number between " + minValue + " and " + maxValue + ": ");
                userInput = myKB.nextInt(); //this might go wrong
                valid = true;
            }
            catch(Exception e){
                System.out.println("That was not an number between " + minValue + " and " + maxValue + ". Please try again.");
                myKB.nextLine(); //prevents infinite loop
            }
            
        }while ( (!valid) || ( (userInput<minValue) || (userInput > maxValue)));
        //input must be valid
        return userInput;
    }
    
    /**
     * Ask the user to enter an double value
     * if not an double - display error and ask again
     * @param prompt the prompt or question to ask
     * @return a valid integer entered by user
     */
    public double askUserForDouble(String prompt){
        
        Scanner myKB = new Scanner(System.in);
        double userInput=0;
        boolean valid = false;
        
        do{
            //this gets repeated
            try{
                System.out.print(prompt);
                
                userInput = myKB.nextInt(); //this might go wrong
                valid = true;
            }
            catch(Exception e){
                System.out.println("That was not an doble. Please try again.");
                myKB.nextLine(); //prevents infinite loop
            }
            
        }while (!valid);
        //input must be valid
        return userInput;
        
    }
    
}

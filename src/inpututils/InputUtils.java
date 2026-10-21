/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inpututils;

import java.time.LocalDate;
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
    
    /**
     * Asks user for a year, with an extra years from now that user should not consider
     * if used, is not valid
     *
     * @param extraYearsFromNow is used as an addition to the currentYear that the user input must not pass
     * @return userInput returns an integer value which is a year, that does not exceeds the addition of the current year and 
     * extra years from  now. This integer is not possible to be in pass
     */
   
    public int askYear(int extraYearsFromNow){
        
        Scanner myKB = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        String cuYearString = date.toString().substring(0, 4);  //taking this years to string -> substring and making it an int
        int cuYear = Integer.parseInt(cuYearString); //current Year

        int userInput=0;
        boolean valid = false;
        
        do{
            //this gets repeated
            try{
                boolean correct = false;
                
                System.out.print("Please enter a year: ");
                
                userInput = myKB.nextInt(); //this might go wrong
                if((userInput<cuYear) || (userInput > (cuYear + extraYearsFromNow))){
                    System.out.println("Keep in mind years cannot be in the past and cannot exceed " + extraYearsFromNow + " from this year");
                }
                valid = true;
            }
            catch(Exception e){
                System.out.println("Numbers can only be entered." );
                myKB.nextLine(); //prevents infinite loop
            }
            
        }while ( (!valid) || ( (userInput<cuYear) || (userInput > (cuYear + extraYearsFromNow))));
            //do loop while OR input is not valid OR (input less than current year) or input more than current year plus years extra from now)
            
        //input must be valid
        return userInput;
        
    } 
    
    
    public int askDay(){
      
        Scanner myKB = new Scanner(System.in);
        int userInput=0;
        boolean valid = false;
        int minDay =1;
        int maxDay =31;
        
        do{
            //this gets repeated
            try{
                
                System.out.print("Please enter a day number between " + minDay + " and " + maxDay + " (if applicable for the month chosen): ");
                userInput = myKB.nextInt(); //this might go wrong
                valid = true;
            }
            catch(Exception e){
                System.out.println("That was not an number between " + minDay + " and " + maxDay + ". Please try again.");
                myKB.nextLine(); //prevents infinite loop
            }
            
        }while ( (!valid) || ( (userInput<minDay) || (userInput > maxDay)));
        //input must be valid
        return userInput;
    }
    
}

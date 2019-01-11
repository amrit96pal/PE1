package com.stackroute.pe1;

import java.util.*;

/**
 *This program is to write a program that reads an unspecified number of integer
 * arguments using Scanner Class and adds them together. The program should display
 * total of the given input number and should only consider integer value.The program
 * should display an error message if there are any non integer values
 *
 * @version 1.3
 *
 * @author Amrit Pal Singh
 */
public class AddTillNonInt {
    /*This is class that implements the seventh requirement and has 2 methods, one main and one exitOnNotInt*/
    public int exitOnNotInt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        /**Initialising sum as 0 and also taking input from user until a non-digit input is given by the user*/
        int sum = 0;
        int input=0;
        try {
            input = sc.nextInt();
        }catch (Exception e){
            System.out.println("You entered a non integer input");
            return 0;
        }
        while(true) {
            if(sc.hasNextInt()){
                input = sc.nextInt();
                sum = sum + input;
            }
            else {
                System.out.println("Error");
                break;
            }
        }
        System.out.format("Sum is %d",sum);
        return sum;
    }
    /**
     *This is the main method that calls the method above
     */
}



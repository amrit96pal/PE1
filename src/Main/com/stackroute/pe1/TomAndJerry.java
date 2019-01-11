package com.stackroute.pe1;

import java.util.*;

/**
 *This program is to accepts an integer number as input from the user and perform the following conditional checks:
 *      a. Print Tom if number is odd and exists between 20 to 30
 *          b. Print Jerry, if number is even and exists between 20 and 30
 *
 * @version 1.3
 *
 * @author Amrit Pal Singh
 */
public class TomAndJerry {
    /*This is class that implements the seventh requirement and has 2 methods, one main and one printOnRangeAndEven*/
    public String printOnRangeAndEven(int inpint){
        String result="";

        /**Checking if the number is even and is in range of 20 to 30*/
        if(inpint%2==0 && inpint>=20 && inpint<=30){
            result="Tom";
            System.out.println("Tom");
        }
        /**Checking if the odd is even and is in range of 20 to 30*/
        else if (inpint%2!=0 && inpint>=20 && inpint<=30){
            result="Jerry";
            System.out.println("Jerry");
        }
        else {
            System.out.println("Input not in range of 20 to 30");
        }
        return result;
    }

    /**
     *This is the main method that calls the method above
     */
    public static void main(String args[]) {
        TomAndJerry second=new TomAndJerry();

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number");

            /**Taking the number input*/
            int inputInt = sc.nextInt();

            /**This is part where the method above is called that implements the 2nd requirement*/
            String result= second.printOnRangeAndEven(inputInt);
        }catch (Exception e){
            System.out.println("Invalid input");
        }


    }
}

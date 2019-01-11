package com.stackroute.pe1;

import java.util.*;

/**
 *This program is to write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6
 *  6 6 . . . nth iteration.
 *
 * @version 1.3
 *
 * @author Amrit Pal Singh
 */
public class IterationPrint {
    /*This is class that implements the seventh requirement and has 2 methods, one main and one loopNumbersAndPrint*/
    public ArrayList loopNumbersAndPrint(int inpint){
        int counter=0;
        ArrayList<Integer> list= new ArrayList<Integer>();

        /**looping and printing the desired output depending on the input*/
        for(int i=1; i<=inpint; i++){
            for(int j=1; j<=i; j++){
                list.add(i);
                System.out.print(i);
                ++counter;
            }
        }
        return list;
    }

    /**
     *This is the main method that calls the method above
     */
    public static void main(String args[]){
        IterationPrint f4=new IterationPrint();
        System.out.println("Enter a number");
        try {
            Scanner sc = new Scanner(System.in);

            /**Taking the integer input*/
            int inpint = sc.nextInt();
            /**This is part where the method above is called that implements the 4th requirement*/
            ArrayList<Integer> result=f4.loopNumbersAndPrint(inpint);
        }catch (Exception e){
            System.out.println("Invalid input");
        }

    }
}

package com.stackroute.pe1;

import java.util.*;

/**
 *This program is to write a program to reverse any string without using String Buffer.
 *
 * @version 1.3
 *
 * @author Amrit Pal Singh
 */
public class ReverseString {
    /*This is class that implements the seventh requirement and has 2 methods, one main and one reverseWithoutStringBuffer*/
    public String reverseWithoutStringBuffer(String strinp){


        /**Here the string inputed is converted to a character array*/
        char chararray[] = strinp.toCharArray();
        int len = chararray.length;/**This is lenght of character array*/

        /**Making a new character array with same size as sting taken as input*/
        char reversedArray[] = new char[strinp.length()];

        /**Intering through the character array from the rear and putting in new character array from front
         * making a new charcter array of reverse kind as original
         */
        for(int i=0; i< len; i++){
            reversedArray[i] = chararray[len-i-1];
        }

        /**Converting the new reverse character array to a string*/
        String reverse = new String(reversedArray);
        System.out.println(reverse);//printing the string
        return reverse;
    }
    /**
     *This is the main method that calls the method above
     */
    public static void main(String args[]){
        ReverseString reverse=new ReverseString();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to reverse");
        try {
            /**Take the string input from the user*/
            String strinp = sc.nextLine();

            /**This is part where the method above is called that implements the 9th requirement*/
            String result=reverse.reverseWithoutStringBuffer(strinp);
        }catch (Exception e){
            System.out.println("Invalid input");
        }

    }
}

package com.stackroute.pe1;

import java.util.*;

import static java.lang.System.exit;

/**
 *This is to given 2 inputs , where input1 is string and input 2 is integer value,
 * the last n characters should repeat n number of times in the output String.
 *
 * @version 1.3
 *
 * @author Amrit Pal Singh
 */

public class IntegerNRepeat {
    /*This is class that implements the tenth requirement and has 2 methods, one main and one stringRepeat*/

    /**
     * This method takes in input from the user as a string and also an integer-numinp
     * and then repeats the last numinp characters numinp number of times
     */
    public String stringRepeat(String strinp,int numinp) {
        String finalString="";

        /**Convert the String input taken into a character array*/
        char charArray[] = strinp.toCharArray();

        int len = charArray.length;/**This is the length of the character array*/
        char charrArray2[] = new char[numinp];/**Initialising a new character array of same size as number input taken*/

        /**Iterating through the character array and storing the last numinp number
         * of characters from the rear end into a new char array*/
        for(int i=0; i<numinp; i++){
            charrArray2[i] = charArray[len-numinp+i];
        }

        /**Converting the newly made character array into a string*/
        String newstring = new String(charrArray2);


        /**Printing the newly formed string numinp number times after strinp is printed*/
        for(int j=0; j<numinp; j++){
            strinp=strinp.concat(newstring);
        }
        System.out.println(strinp);
        return strinp;
    }

    /**
     *This is the main method that calls the method above
     */
    public static void main(String args[]){
        IntegerNRepeat ten=new IntegerNRepeat();
        String strinp="";
        int numinp=0;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the string");

            /**Taking in input from user as String*/
            strinp = sc.nextLine();
        }catch (Exception e){
            System.out.println("Invalid input");
            exit(0);
        }

        try {
            System.out.println("Enter a number");

            /**Takes in the number input from the user*/
            numinp = sc.nextInt();
        }catch (Exception e){
            System.out.println("Invalid input");
            exit(0);
        }
        try {
            if(strinp.length()<numinp){throw new Exception("Size of integer greater than size of string-Invalid");}
        }catch (Exception e){
            System.out.println(e.getMessage());
            exit(0);
        }



        /**This is part where the method above is called that implements the 3rd requirement*/
        ten.stringRepeat(strinp,numinp);
    }
}

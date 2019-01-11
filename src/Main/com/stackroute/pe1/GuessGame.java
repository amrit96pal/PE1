package com.stackroute.pe1;

import java.util.*;

/**
 *This program is to write a program which accepts a number from user as input
 * (set the limit say 1 - 50 or 1 - 100) User should guess until the the target
 * number is guessed correctly.
 * Print separate messages for the following:
 *      a. Number guessed is more than original number
 *             b. Number guessed is less than original number
 *                  c. Number guessed matches the original number
 *
 * @version 1.3
 *
 * @author Amrit Pal Singh
 */
public class GuessGame {
    /*This is class that implements the seventh requirement and has 2 methods, one main and one guessNum*/
    public int guessNum(int correctnum) {
        int correctnumber=correctnum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number between 1 and 50");
        int input=0;

        /**This part repeats the cycle until the guessed number by the user
         * is same as the predefined answere
         */

        while (1 < 2) {
            try {
                input = sc.nextInt();/**The input taken from user*/
                if(input>50 || input <0){throw new Exception("Out of range input");}
            }catch (Exception e){
                System.out.println(e.getMessage());
                break;
            }

            /**Check for equality of the guessed number to answere and gove output*/
            if (input < 51 && input > 0) {
                if (input > correctnumber) {
                    System.out.println("Guessed number is greater than the expected person");
                }
                if (input < correctnumber) {
                    System.out.println("Guessed number is lesser than the expected person");
                } else if (input == correctnumber) {
                    System.out.println("Guessed number matches with the expected number");
                    break;
                }
            }
        }
        return input;
    }

    /**
     *This is the main method that calls the method above
     */
    public static void main(String args[]){
        GuessGame e=new GuessGame();
        /**Using random number to generate a correct answer in range of 1 to 50*/
        double randomDouble = Math.random();
        randomDouble = randomDouble * 50 + 1;
        int correctnumber = (int) randomDouble;

        /**This is part where the method above is called that implements the 8th requirement*/
        int guess=e.guessNum(correctnumber);
    }
}

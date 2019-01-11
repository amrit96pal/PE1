package com.stackroute.pe1;

import java.util.*;

/**
 *This program is to write a program which accepts a number as input and check whether the given number is
 * palindrome or not If it is a palindrome then
 *      a. Add all the even numbers and check whether the sum is more than 25.
 *          b. Print success and failure messages for all 3 conditions
 *
 * @version 1.3
 *
 * @author Amrit Pal Singh
 */
public class PalindromeAndEvenSum {
    /*This is class that implements the seventh requirement and has 2 methods, one main and one revAndAddEvenPlaces*/
    public int revAndAddEvenPlaces(int inpint){

        int inpint2 = inpint;/**Inpint2 same as inpint*/


        /**initialising rev, counter and sum as 0*/
        int reversed = 0;
        int sum = 0;
        int counter = 0;

        /**Code to reverse the number given as input and adding every even place digit to sum*/
        while(inpint >= 10){
            int a = inpint;
            int b = inpint/10;
            int c = a%10;
            ++counter;
            if(counter%2 == 0){
                sum+=c;
            }
            if(b > 9){
                reversed = (reversed*10) + c;
            }
            else{
/*                if(counter%2 == 0){
                    sum += c;
                }*/
                reversed = (reversed*10) + c;
                reversed = (reversed*10) + b;
            }
            inpint = b;
        }
        System.out.println(inpint2);
        System.out.println(reversed);//Printing the original input

        /**Checking the reversed number to input if its a palindrome*/
        if(inpint2 == reversed){
            System.out.println("success palindrome");
            System.out.format("sum is %d",sum);

        }
        else{
            System.out.println("failure palindrome");
        }
        return reversed;
    }


    /**
     *This is the main method that calls the method above
     */
    public static void main(String args[]){
        PalindromeAndEvenSum first=new PalindromeAndEvenSum();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int inpint=0;
        try {
            /**Taking the input from user*/
            inpint = sc.nextInt();
            sc.close();

            /**This is part where the method above is called that implements the 1st requirement*/
            int sum=first.revAndAddEvenPlaces(inpint);

        }catch (Exception e){
            System.out.println("Non integer input");
        }


    }
}

package com.stackroute.pe1;

import java.util.*;

import static java.lang.System.exit;

/**
 *This is Write a program which accepts a number as input from user and perform the following:
 *      a. sort the number in non-increasing order
 *          b. after sorting sum all the even numbers, the sum should be greater than 15 .
 *              c. if sum is more than 15,then print output as true or false.
 *
 * @version 1.3
 *
 * @author Amrit Pal Singh
 */

public class SortAndEvenSum {
    /*This is class that implements the seventh requirement and has 2 methods, one main and one sortAndAddEven*/
    public ArrayList sortAndAddEven(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int inpint=0;

        try {

            /**Taking the input as number*/
            inpint = sc.nextInt();
        }catch (Exception e){
            System.out.println("Invalid input");
            exit(0);
        }

        /**Initialising an Arraylist*/
        ArrayList<Integer> intlist = new ArrayList<Integer>();

        /**Putting all the digits in a list and for every number in even place add it to sum variable*/
        while(inpint >= 10){
            int remainder = 0;
            int quotient = 0;
            if(inpint/10 > 9){
                remainder = inpint%10;
                intlist.add(remainder);

            }
            else{
                intlist.add(inpint/10);
                intlist.add(inpint%10);
            }
            quotient = inpint/10;
            inpint = quotient;
        }

        /**Sorting the list*/
        intlist.sort(Comparator.reverseOrder());
        System.out.print("Sorted number in non-increasing order :");

        return intlist;

    }

    public int findSum(ArrayList<Integer> intlist){
        /**Initiliasing sum as 0*/
        int sum = 0;

        /**Print the sorted list by iterating through list*/
        for(int i=0; i<intlist.size(); i++){
            if(i%2!=0){
                sum += intlist.get(i);
            }
            System.out.print(intlist.get(i));

        }
        System.out.println();

        /**Printing the sum of all th even numbers*/
        System.out.format("Sum of even numbers :%d%n",sum);

        /**Checking of sum is above or below 15*/
        if(sum > 15){
            System.out.print("true");
        }
        else{
            System.out.print("False");
        }
        return sum;
    }

    /**
     *This is the main method that calls the method above
     */
    public static void main(String args[]){
        SortAndEvenSum s7=new SortAndEvenSum();

        /**This is part where the method above is called that implements the 7th requirement*/
        ArrayList<Integer> result=s7.sortAndAddEven();
        int sum=s7.findSum(result);
    }
}

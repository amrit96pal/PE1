package com.stackroute.pe1;

import java.util.*;

/**
 *This is to create a program that accepts a word as input and checks for each
 * single character letter in the word whether it is a consonant or vowel.
 *
 * @version 2.3
 *
 * @author Amrit Pal Singh
 */

public class VowelOrConsonant {
    /*This is class that implements the third requirement and has 2 methods, one main and one charVowelOrConsonant*/

    /**
     * This method takes in input from the user as series of character and tells if they are
     * consonant or vowel
     */
    public String charVowelOrConsonant(char[] stringInp){


        /**Convert the string to a character array*/
        char charInp[] = stringInp;
        String answer="";

        /**This iterates through the character array and prints the consonant or vowel depending on that*/
        for(int i=0; i<charInp.length; i++){
            if(charInp[i]=='a' ||charInp[i]=='e' ||charInp[i]=='i' ||charInp[i]=='o' ||charInp[i]=='u'||
                    charInp[i]=='A' ||charInp[i]=='E' ||charInp[i]=='I' ||charInp[i]=='O' ||charInp[i]=='U' ){
               // System.out.print("Vowel");
                answer=answer.concat("Vowel");
            }
            else {
               // System.out.print("Consonant");
                answer=answer.concat("Consonant");
            }
        }
        System.out.println(answer);
        return  answer;
    }

    /**
     *This is the main method that calls the method above
     */
    public static void main(String args[]){
        VowelOrConsonant t3=new VowelOrConsonant();

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a string of characters");

            /**Take the input as String*/
            String strInp = sc.nextLine();
            char[] strInp1=strInp.toCharArray();

            for(int i=0;i<strInp1.length;i++){
                if(strInp1[i] >= 97 && strInp1[i] <= 123)
                {
                    continue;
                }
                else if(strInp1[i] >= 65 && strInp1[i] <= 96)
                {
                    continue;
                }
                else {
                    throw new Exception("Invalid input-not a character input");
                }
            }

            /**This is part where the method above is called that implements the 3rd requirement*/
            String ans=t3.charVowelOrConsonant(strInp1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    }

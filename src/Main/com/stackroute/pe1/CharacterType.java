package com.stackroute.pe1; /**
 *This is Write a program that takes a character from the user as input and determines
 * whether the character entered is a capital letter, a small case letter, a digit or a
 * special symbol and display appropriately.
 *
 * @version 1.3
 *
 * @author Amrit Pal Singh
 */
import java.util.Scanner;

public class CharacterType {
    /*This is class that implements the sixth requirement and has 2 methods, one main and one characterDependentOutput*/

    /**
     * This method takes in input from the user as a character as gives output
     * depending whether its in uppercase, lowercase, digit or special character
     */
    public String characterDependentOutput(char inputcharacter){
        String answer="";

        /**Checking whether its in uppercase, lowercase, digit or special character based on ASCII values*/
        if(inputcharacter >= 97 && inputcharacter <= 123)
        {
            System.out.println("Lower Case");
            answer="Lower Case";
        }
        else if(inputcharacter >= 65 && inputcharacter <= 96)
        {
            System.out.println("Upper Case");
            answer="Upper Case";
        }
        else if(inputcharacter >= 48 && inputcharacter <= 57)
        {
            System.out.println("Digit");
            answer="Digit";
        }
        else{
            System.out.println("Special character");
            answer="Special character";
        }
        return answer;
    }

    /**
     *This is the main method that calls the method above
     */
    public static void main(String args[]){
        CharacterType s6= new CharacterType();

        System.out.println("Enter a character");

        Scanner sc = new Scanner(System.in);

        try {
            /**Taking character input from the user*/
            String str=sc.next();
            if(str.length()>1){throw new Exception("Non character input");
            }
            char inputcharacter = str.charAt(0);
            /**This is part where the method above is called that implements the 6th requirement*/
            String answer= s6.characterDependentOutput(inputcharacter);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}

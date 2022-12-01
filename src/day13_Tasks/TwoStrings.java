package day13_Tasks;

import java.util.Scanner;

public class TwoStrings {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        int length1 = s1.length();
        int length2 = s2.length();
        if (length1>length2){
            System.out.println(s1);
        }else{
            System.out.println(s2);
            input.close();
        }
    }
}

/*

5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself


 */
package day15_ForLoop_Tasks;

import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {

        String str2="";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = input.nextLine();

        String str1= str.toLowerCase();


        for (int i = 0; i < str1.length() ; i++ ){

            str2 +=str1.charAt((str1.length()-1)-i);
        }

        if (str1.equals(str2)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        input.close();
    }

}


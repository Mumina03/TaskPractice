package day13_Tasks;

import java.util.Scanner;

public class ThreeLetterWord {

    public static void main(String[] args) {
        System.out.println("Enter a three letter word:");
        String word = new Scanner(System.in).next();
        String result = " ";

        if (word.length()==3){
            switch (word.charAt(1)) {
                case 'a':
                    result = "Cool word";
                    break;
                default:
                    result = "Okay word";
            }
        }else if (word.length()<3){
            result = "Word is too short";
        }else{
            result = "Word is too long";
        }
        System.out.println(result);
    }
}
/*
6. write a program that asks the user enter a three letter word. Check if the middle character of the given word is 'a'. In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"

 */
package day10_NestedIf_Tasks;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your grade");
        char grade=scanner.next().charAt(0);
        String text="";
        if (grade=='a'||grade=='A'||grade=='b'||grade=='B'||grade=='C'||grade=='c'||grade=='d'||grade=='D'||grade=='f'||grade=='F') {
            if (grade == 'a' || grade == 'A') text = "excellent job";
            else if (grade == 'b' || grade == 'B') text = "great job";
            else if (grade == 'c' || grade == 'C') text = "good";
            else if (grade == 'd' || grade == 'D') text = "passed";
            else text = "failed";
        }else text="invalid";
        System.out.println(text);
        scanner.close();


    }
}
/*
 Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */

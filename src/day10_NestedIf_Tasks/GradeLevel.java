package day10_NestedIf_Tasks;

import java.util.Scanner;

public class GradeLevel {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your grade;");
        int grade= scanner.nextInt();
        String text="";
        if (grade>0&&grade<19) {
            if (grade < 6 ) text = "Elementary School";
            else if (grade < 9) text = "Middle School";
            else if (grade < 13) text = "High School";
            else if (grade < 17) text = "College";
            else  text = "Grad School";
        }else text="invalid";
        System.out.println(text);
        scanner.close();
    }
}
/*
       grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */

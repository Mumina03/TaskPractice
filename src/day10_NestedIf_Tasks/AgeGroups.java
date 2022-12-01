package day10_NestedIf_Tasks;

import java.util.Scanner;

public class AgeGroups {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>>>>>>Please enter your age to see your age group<<<<<");
        String text = "";
        int age = scanner.nextInt();
        if (age > 0 && age < 150) {
            if (age < 21) text = "Teenager";
            else if (age < 55) text = "Adult";
            else text = "Senior";
        } else text = "invalid";
        System.out.println(text);
        scanner.close();
    }
}
/*4. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */

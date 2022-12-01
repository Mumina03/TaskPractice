package day16_FoorLoopString_Taskks;

import java.util.Scanner;

public class Multiply {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two positive numbers");
        System.out.println("Please enter the first number:");
        double num1 = scanner.nextInt();
        System.out.println("Please enter the second number:");
        double num2 = scanner.nextInt();
        double result = 0;
        if (num1 < 0 || num2 < 0) {
            System.out.println("Invalid");
        } else {
            for (int i = 1; i <= num2; i++) {
                result += num1;
            }System.out.println("The result is : " + result);

        }scanner.close();
    }
}
/*
3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200
 */

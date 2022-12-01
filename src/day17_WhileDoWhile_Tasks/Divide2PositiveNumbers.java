package day17_WhileDoWhile_Tasks;

import java.util.Scanner;

public class Divide2PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two positive numbers");
        System.out.println("Please enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Please enter the second number:");
        int num2 = scanner.nextInt();
        int result = 0;
        int count = 0;

        while (num1 >= num2) {
            num1 = num1 - num2;
            count++;
        }
        System.out.println("The result is " + count + " the remainder is " + num1);
        scanner.close();
    }
}
/*
1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.


 */

package day17_WhileDoWhile_Tasks;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int sum = 0;
        while (num1 >= 0) {
            System.out.println("Please enter a number:");
            num1 = scanner.nextInt();
            if (num1 < 0) break;
            sum += num1;
            System.out.println("Total is " + sum);
        }
        System.out.println("Total is " + sum+ " not including the last entry.");
        scanner.close();

    }
}
/*2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop

 */

package day17_WhileDoWhile_Tasks;

import java.util.Scanner;

public class PCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        char ch = ' ';
        double result=0;

        System.out.println("Please enter the first number:");
        num1 = scanner.nextInt();
        System.out.println("Please enter the second number:");
        num2 = scanner.nextInt();
        while (!((ch == '+') || (ch == '-') || (ch == '*') || (ch == '/'))) {
            System.out.println("Please enter a valid operator:");
            ch = scanner.next().charAt(0);
        }
        switch (ch) {
            case '+':
                result=num1 + num2;
                break;
            case '-':
                result=num1 - num2;
                break;
            case '/':
                result=(double) num1 / num2;
                break;
            case '*':
                result=num1 * num2;
                break;
        }
        System.out.println("The result is "+result);
        scanner.close();
    }
}
/*
  3. write a program to ask user to enter two number and math operator, and return the result.

        if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */

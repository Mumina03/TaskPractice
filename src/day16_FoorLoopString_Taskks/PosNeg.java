package day16_FoorLoopString_Taskks;

import java.util.Scanner;

public class PosNeg {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int countPos=0;
        int countNeg=0;
        int countZer=0;
        for (int i = 1; i < 6; i++) {
            System.out.println("Please enter number "+i+" :");
            int number=scanner.nextInt();
            if (number<0){
                countPos++;
            } else if (number>0) {
                countNeg++;

            }else countZer++;
        }

        System.out.println(countPos +" positive, "+ countNeg+" negative numbers entered.");
        scanner.close();
    }
}
/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
            Ex:
                Inputs:
                    10
                    20
                    -1
                    0
                    3

                Output:
                    3 positive and 1 negative
 */


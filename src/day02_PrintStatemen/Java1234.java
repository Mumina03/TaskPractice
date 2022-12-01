package day02_PrintStatemen;

import java.util.Scanner;

public class Java1234 {
    public static void main(String[] args) {


        System.out.println("Enter 3 numbers");
        Scanner scan = new Scanner(System.in);
        Integer x = scan.nextInt();
        Integer y = scan.nextInt();
        Integer z = scan.nextInt();
        if (x > y && y > z) {
            System.out.println("middle number is:" + y);
        } else if (x > z && z > y) {
            System.out.println("middle number is:" + z);
        } else if (y > z && z > x) {
            System.out.println("middle number is:" + z);
        } else if (y > x && x > z) {
            System.out.println("middle number is:" + x);
        } else if (z > x && x > y) {
            System.out.println("middle number is:" + x);
        } else {
            System.out.println("middle number is:" + y);
        }
    }
    }
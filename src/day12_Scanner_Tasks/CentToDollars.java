package day12_Scanner_Tasks;

import java.util.Scanner;

public class CentToDollars {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many cents do you have?");
        int cents= scanner.nextInt();
        scanner.close();
        int dollars= cents/100;
        int remcents= cents%100;
        System.out.println(cents +" cents equal to : "+dollars+" dollars  and "+remcents+" cents.");
        scanner.close();
    }
}
/*
3. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */

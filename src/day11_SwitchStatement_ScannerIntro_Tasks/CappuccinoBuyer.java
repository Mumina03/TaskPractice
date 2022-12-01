package day11_SwitchStatement_ScannerIntro_Tasks;

import java.util.Scanner;

public class CappuccinoBuyer {

    public static void main(String[] args) {


        String result ="";
        int price, calories;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please choose your size and enter (tall/grande/venti);");
        String size= scanner.nextLine();

        if ((size.equals("tall")) || (size.equals("grande")) || (size.equals("venti"))){
            switch (size){
                case "tall":
                    result="price is $3.69\n" +
                            "90 calories";
                    break;
                case "grande":
                    result="price is $3.99\n" +
                            "120 calories";
                    break;
                default : result="price is $4.29\n" +
                        "150 calories";
            }
/*
            if (size.equals("tall")){ result="price is $3.69\n" +
                    "90 calories";}
            else if (size.equals("grande")){ result="price is $3.99;\n" +
                    "t120 calories";}

            else {result="price is $4.29\n" +
                        "t150 calories";}
*/
        }else result="invalid";
        System.out.println(result);
        scanner.close();
    }
}
/*

    1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
            Valid sizes are tall, grande, venti and their price & calories are:

 */


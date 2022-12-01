package day11_SwitchStatement_ScannerIntro_Tasks;

import java.util.Scanner;

public class Elevator {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please select your floor an enter its number(1, 2, or 3)");
        int floor= scanner.nextInt();
        String result="";
        switch (floor){
            case (1): result="Floor 1 selected. Companies: Lobby, Verizon, Starbucks";break;
            case (2): result="Floor 2 selected. Companies: Cybertek, NASA, Intelsat";break;
            case (3): result="Floor 3 selected. Companies: Lyft, BofA, Stake house";break;
            default: result="Invalid floor - 6";break;
        }
        System.out.println(result);
        scanner.close();
    }
}
/*

    2. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
            when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
            when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
            when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
             anything else: print "Invalid floor - 6"

             Note:
                 Solution 1: use nested if statement
                Solution 2: use switch statement
                Solution 2: use if & switch statements mixed


 */

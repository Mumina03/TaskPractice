package day17_WhileDoWhile_Tasks;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to reserve a room?");
        String reserve = "";
        String bedSize = "";
        while (1 > 0) {
            reserve = scanner.next().toLowerCase();
            if (reserve.equals("yes") || reserve.equals("no"))
                break;
            System.out.println("Please re-enter your answer");
        }
        if (reserve.equals("no")) {
            System.out.println("Have a nice day!");
        } else System.out.println("Which bed size do you want to reserve?\n King ==> 120$\n" +
                "\t            Queen ==> 100$\n" +
                "\t            Single ==> 80$");

        while (1 > 0) {
            bedSize = scanner.next().toLowerCase();
            if (bedSize.equals("king") || bedSize.equals("queen") || bedSize.equals("single"))
                break;
            System.out.println("Please re-enter your answer");
        }
        if (bedSize.equals("king")) {
            System.out.println("King size bed selected. Total prize is $120.");
        } else if (bedSize.equals("queen")) {
            System.out.println("Queen size bed selected. Total prize is $100.");
        } else System.out.println("Single size bed selected. Total prize is $80.");
        scanner.close();
    }
}
/*
  5. Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
        if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
                (if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

                King Bed ==> 120$
                Queen Bed ==> 100$
                single Bed ==> 80$

 */

package day12_Scanner_Tasks;

import java.util.Scanner;

public class LiveWith {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int people= scanner.nextInt();
        String result="";
        switch (people){
            case (0):case (1):case (2):result="Live with less than 3 people"; break;
            case (3): case (4): case (5): case (6):result="Live with 3 - 6 people";break;
            default:result="Live with more than 6 people";break;
        }
        System.out.println(result);
        scanner.close();
    }

}
/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */

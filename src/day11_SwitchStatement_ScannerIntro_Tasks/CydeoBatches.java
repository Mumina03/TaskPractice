package day11_SwitchStatement_ScannerIntro_Tasks;

import java.util.Scanner;

public class CydeoBatches {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        System.out.println("Choose your batch and enter one of the following (US_morning, US_evening, EU)");
        String batch = scanner.nextLine();
        if (batch.equals("US_morning") || batch.equals("US_evening") || batch.equals("EU")) {
            switch (batch) {
                case "US_morning":
                    result = "Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "US_evening":
                    result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                default:
                    result = "Class times are  10-5 EST. M, T, W, Th, F.";
            }
        } else result = "invalid";
        System.out.println(result);
        scanner.close();
    }
}
/*

    4. Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

            If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
            If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
            If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
            If batch type is invalid, print "Invalid Btach"

            Note:
                 Solution 1: use if statement
                Solution 2: use switch statement
                Solution 2: use if & switch statements mixed


 */

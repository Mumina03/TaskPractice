package day16_FoorLoopString_Taskks;

import java.util.Scanner;

public class CatAndDog {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter a string");
        String str= scanner.nextLine().toLowerCase();
        int countCat=0;
        int countDog=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.contains("cat")) {
                str = str.replaceFirst("cat", "");
                countCat++;
            }
            if (str.contains("dog")) {
                str = str.replaceFirst("dog", "");
                countDog++;
            }
        }if (countCat==countDog) System.out.println("true");
        else System.out.println("false");
        scanner.close();
    }
}
/*

5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

            Ex:
                sentence = "caT dog dogG cAt"

                output:
                    true
 */


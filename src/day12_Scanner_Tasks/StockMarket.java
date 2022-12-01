package day12_Scanner_Tasks;

import java.util.Scanner;

public class StockMarket {

        public static void main(String[] args) {
            Scanner scanner =new Scanner(System.in);
            System.out.println("How many total shares do you have in possession already?");//int
            int totalShares=scanner.nextInt();
            if (totalShares>0) {
                System.out.println("How much is your total value in the stock market?");//double
                double totalValue = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Please enter the name of the company you have the most shares in;");//(String, multiple words)
                String mostShareCompany = scanner.nextLine();
                System.out.println("Your total stock market holding is $" + totalValue + " which is made up of " + totalShares + " shares. " + mostShareCompany + " is your company holdings.");
            }
            scanner.close();
        }
    }
/*
7. StockMarket task:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"
 */

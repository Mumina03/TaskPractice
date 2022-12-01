package day12_Scanner_Tasks;

import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the mile you want to convert to Km");
        double miles= scanner.nextDouble();
        System.out.println(miles+" miles equal to : "+(miles*1.609)+" kilometers.");
        scanner.close();
    }
}

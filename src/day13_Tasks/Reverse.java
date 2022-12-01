package day13_Tasks;

public class Reverse {

    public static void main(String[] args) {

        String word = "water";

        if (word.length()<5){
            System.out.println("Too short!");
        }else if (word.length()>5){
            System.out.println("Too long!");
        }else{
            char fifthChar = word.charAt(4);
            char fourthChar = word.charAt(3);
            char thirdChar = word.charAt(2);
            char secondChar = word.charAt(1);
            char firstChar = word.charAt(0);
            System.out.println(fifthChar + "" + fourthChar + "" + thirdChar + "" + secondChar + "" + firstChar);
        }
    }
}

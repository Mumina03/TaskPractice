package day05_Tasks;

public class PhoneNumber {

    public static void main(String[] args) {

        String countryCode = "+44",
                  areaCode = "(77)",
                localNumber= "56635330";

        String phoneNumber = countryCode + areaCode + localNumber;

        System.out.println(phoneNumber);


    }
}
/*

1. create a class named Phone Number and declare the following variables:
            countryCode, areaCode, localNumber

            use string concatenation to display the phone number

            ex:
                if  countryCode = 1
                    areaCode = 703
                    localNumber = 4512625

                output:
                    +1(703)-4512625
 */
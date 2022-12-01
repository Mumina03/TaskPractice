package day10_NestedIf_Tasks;

public class CrewAndPassengers {

    public static void main(String[] args) {
        int people = 100;
        String print = "";
        if (people == 50 || people == 75 || people == 100) {
            if (people == 50) {
                print = "20 crew and 30 passengers";
            } else if (people == 75) {
                print = "25 crew, 50 passengers";
            } else if (people == 100) {
                print = "30 crew, 70 passengers";
            }
        } else print = "invalid value";
        System.out.println(print);
    }
}

/*
2. Create a class called CrewAndPassangers, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT


 */

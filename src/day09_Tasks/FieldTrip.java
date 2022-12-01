package day09_Tasks;

public class FieldTrip {

    public static void main(String[] args) {

        int grade = 7; // 1 ~6

        if (grade == 1){
            System.out.println("grade - " + grade + "\n" + "location - Apple orchard\nnumber of groups - 3\n" +
                    "techer in charge - Ms. Smith");
        } else if (grade == 2) {
            System.out.println("grade - " + grade + "\n" + "location - Zoo\nnumber of groups - 7\n" +
                    "techer in charge - Mr. Lee");
        } else if (grade == 3) {
            System.out.println("grade - " + grade + "\n" + "location - Aquarium\nnumber of groups - 5\n" +
                    "techer in charge - Ms. Wilson");
        } else if (grade == 4) {
            System.out.println("grade - " + grade + "\n" + "location - Movie theater\nnumber of groups - 2\n" +
                    "techer in charge - Ms. Reyes");
        } else if (grade == 5) {
            System.out.println("grade - " + grade + "\n" + "location - Museum\nnumber of groups - 5\n" +
                    "techer in charge - Ms. Lela");
        } else if (grade == 6) {
            System.out.println("grade - " + grade + "\n" + "location - Six Flags\nnumber of groups - 8\n" +
                    "techer in charge - Mr. Watt");
        }else {
            System.out.println("Please enter correct grade number! you can only check the grade number between 1 ~ 6");
        }

    }
}

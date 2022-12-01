package day05_Tasks;

public class CarInfo {

    public static void main(String[] args) {

            //Year Make Model, Miles, Color, Price.
            int year = 2011;
            String makeModel = "Renault Clio",
                    miles = "65000 miles",
                    color = "Gray",
                    price = "$12000";
            String carInfo =  year + " " + makeModel +", " + miles + ", "  + color + ", " + price + "." ;

            System.out.println(carInfo);

        }
    }


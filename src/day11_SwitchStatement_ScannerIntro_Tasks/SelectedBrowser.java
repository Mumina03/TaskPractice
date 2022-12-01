package day11_SwitchStatement_ScannerIntro_Tasks;

import java.util.Scanner;

public class SelectedBrowser {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please select and enter one of the following browsers:(chrome, firefox, opera, safari, edge)");
        String browserName= scanner.nextLine();
        String result="";
        switch (browserName){
            case ("chrome"): result="Selected browser is chrome";break;
            case ("firefox"): result="Selected browser is firefox";break;
            case ("opera"): result="Selected browser is opera";break;
            case ("safari"): result="Selected browser is safari";break;
            case ("edge"): result="Selected browser is edge";break;
            default:result="invalid";
        }
        System.out.println(result);
        scanner.close();
    }
}
/*



    3.  write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

            Do Not use if statement or ternary

 */

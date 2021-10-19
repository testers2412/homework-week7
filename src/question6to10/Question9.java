package question6to10;

import java.util.Scanner;

/**
 *  Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any other alphabet should be invalid entry
 * 9. Same as above program-8 using switch statement.
 */
public class Question9 {


    public static void main(String[] args) {
        String city;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the Alphabet from 'A' to 'F' ");
        city= sc.nextLine();
        switch (city.toUpperCase()){ //Converts all of the characters in this String to upper case using the rules of the default locale
            case "A":
                System.out.println("Aberdeen");
                break; // if the expression is match then the m/c will stop the execution here.
            case "B":
                System.out.println("Bombay");
                break;
            case "C":
                System.out.println("Colombo");
                break;
            case "D":
                System.out.println("Dubai");
                break;
            case "E":
                System.out.println("Elato");
                break;
            case "F":
                System.out.println("Florida");
                break;
            default:
                System.out.println("Invalid input,please enter valid input");//if user enter other than A to F alphabet then it will give this error message
        }sc.close();

    }
}

package question6to10;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.String.CASE_INSENSITIVE_ORDER;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly
 * (use if else) if any other alphabet should be invalid entry
 */
public class Question8 {
    static String city;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Alphabet from 'A' to 'F' ");
        city = sc.nextLine();
        if (Objects.equals(city.toUpperCase(),"A")){
            System.out.println("Aberdeen");
        } else if (Objects.equals(city.toUpperCase(),"B")){
            System.out.println("Bombay");
        }else if (Objects.equals(city.toUpperCase(),"C")){
            System.out.println("Colombo");
        }else if (Objects.equals(city.toUpperCase(),"D")){
            System.out.println("Dubai");
        }else if (Objects.equals(city.toUpperCase(),"E")){
            System.out.println("Elato");
        }else if (Objects.equals(city.toUpperCase(),"F")){
            System.out.println("Florida");
        }else{
            System.out.println("Invalid input,please enter valid input");
        }sc.close();
    }
}

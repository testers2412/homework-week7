package question16to20;
//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        a = sc.nextInt(); //int type variable will take only numbers
        if (a < 0) {
            System.out.println(a + " is a negative number.");
        } else if (a > 0) {
            System.out.println(a + " is a positive number.");
        } else {
            System.out.println(a + " is a zero.");//if 0 is entered then result will show this message
        }
        sc.close();
    }
}

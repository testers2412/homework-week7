package question1to5;

import java.util.Scanner;

//Write a java program to input any year like (ex.2007) and find out if it is leap year or not?

public class Question2 {
    int y; //instance variable

    public static void main(String[] args) {
        Question2 year = new Question2();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year: ");
        year.y = input.nextInt();// using an object 'year' to access instance variable 'y'
        year.leapyear();
        input.close();
    }
     //in instance method, using nested ifelse statements
    public void leapyear() {
        if (y % 4 == 0 && y % 100 != 0 && y > 0 || y % 400 == 0) {
            System.out.println(y + " is a leap year. ");
            //if the year is a 0 or minus number than the message display like below
        } else if (y <= 0) {
            System.out.println(y + " - There is no year like this");

        } else {
            System.out.println(y + " is not a leap year.");
        }

    }
}

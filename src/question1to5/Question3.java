package question1to5;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format _______________________________ | | | Mark Sheet | |_______________________________| | Name : Jay | | Roll No : 08 | |_______________________________| | Subjects : Marks | |_______________________________| | Math : 98 | | Science : 90 | | English : 85 | |_______________________________| | Total : 273 | |_______________________________| | Percentage : 91.0 | | Result : Pass | | Grade : A+ | |_______________________________|
 */
public class Question3 {
    String name;
    int rollNo, math, science, english, total;// instance variable is declared.
    float percentage;

    public static void main(String[] args) {
        Question3 obj = new Question3();//object is created to bring instance variable into static area
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter student Name: ");
        obj.name = input.nextLine();
        System.out.println("Please enter roll number: ");
        obj.rollNo = input.nextInt();
        System.out.println("Please enter Math's marks: ");
        obj.math = input.nextInt();
        System.out.println("Please enter Science's marks: ");
        obj.science = input.nextInt();
        System.out.println("Please enter English's marks: ");
        obj.english = input.nextInt();
        obj.markSheet();
        input.close();// Scanner is closed

    }

    public void markSheet() {
        total = (math + science + english);
        percentage = total / 3;//marks is out of hundred and that is why to get percentage I just used 3 to divide the total of three subjects.

        if (math >= 0 && math <= 100 && science >= 0 && science <= 100 && english >= 0 && english <= 100) {

            System.out.println(" ___________________________________ ");
            System.out.println("|                                   |");
            System.out.println("|           Mark Sheet              |");
            System.out.println("|___________________________________|");
            System.out.println("|    Name        : " + name + "              |");
            System.out.println("|    Roll No     : " + rollNo + "               |");
            System.out.println("|___________________________________|");
            System.out.println("|    Subjects    :    Marks         |");
            System.out.println("|___________________________________|");
            System.out.println("|    Math        : " + math + "               |");
            System.out.println("|    Science     : " + science + "               |");
            System.out.println("|    English     : " + english + "               |");
            System.out.println("|___________________________________|");
            System.out.println("|    Total       : " + total + "              |");
            System.out.println("|___________________________________|");
            System.out.println("|    Percentage  : " + percentage + "             |");

            if (math >= 35 && science >= 35 && english >= 35) {
                System.out.println("|    Result      : Pass             |");
            } else {
                System.out.println("|    Result      : Fail             | ");
            }
            if (percentage >= 80) {
                System.out.println("|    Grade       : A+               |");

            } else if (percentage >= 60) {
                System.out.println("|    Grade       : B+               |");
            } else if (percentage >= 50) {
                System.out.println("|    Grade       : c+               |");
            } else if (percentage >= 35) {
                System.out.println("|    Grade       : D+               |");
            }
            System.out.println("|___________________________________|");
        } else {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
        }
    }
}









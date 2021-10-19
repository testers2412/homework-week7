package question1to5;
//Write a java program that tells us that Input number is odd or even?
//HINT: use ternary operator (? :)

import java.util.Scanner;

public class Question1 {
    int a; //instance variable

    public static void main(String[] args) {
        Question1 num = new Question1(); // object creation
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        num.a = input.nextInt();
        input.close();
        //if else statement by using ternary operators
        String b = (num.a % 2 == 0)? ("The number is even number. ") :("The number is odd number.");
        System.out.println(b);
        //System.out.println((num.a % 2 == 0)? "The number is even number. " :"The number is odd number."  );
    }

}





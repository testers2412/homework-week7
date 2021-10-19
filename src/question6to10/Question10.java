package question6to10;

import java.util.Scanner;

/**
 * 10. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
 * find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */
public class Question10 {
    static int a, b;
    static char c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number: ");
        a = sc.nextInt();
        System.out.println("Please enter another number: ");
        b = sc.nextInt();
        System.out.println("Please enter the symbol to perform calculation: ");
        c = sc.next().charAt(0); //Returns the char value at the specified index
        if(c== '+'){
            System.out.println("Addition of two numbers are "+(a+b));
        }else if(c=='-'){
            System.out.println("Subtraction of two numbers are "+(a-b));
        }else if(c=='*'){
            System.out.println("Multiplication of two numbers are "+(a*b));
        }else if (c=='/'){
            System.out.println("Division of two numbers are "+(a/b));

        }else{
            System.out.println("Please enter valid input");
            // if other than four calculation method symbol is entered then it will give this error message
        }
            sc.close();


        }

    }






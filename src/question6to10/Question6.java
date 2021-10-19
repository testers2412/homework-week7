package question6to10;
//Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// scanner is created
        System.out.println("Please enter the number: ");
        int nub= sc.nextInt();

        if (nub%2==0){ // condition is entered in if statement to find out odd and even number
            System.out.println(nub +" is an even number.");
        }else{
            System.out.println(nub + " is an odd number");

            }
        sc.close();// scanner is closed
    }




}

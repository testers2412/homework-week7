package question16to20;

import java.util.Scanner;

//Write a Java program to test if an array contains a specific value
public class Question20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to find: ");
        int t = sc.nextInt();
        int []num = {2001, 2003,2005,2007,2009,2010,2012,};
        boolean f= false;
        for (int n : num){

            if(n== t) {
                f = true;
                break;
            }
        }
        if (f){
            System.out.println(t + " is found");
        }else{
            System.out.println(t + " is not found");
        }
    }


    }




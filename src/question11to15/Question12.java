package question11to15;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = sc.next().charAt(0);
        //Using ASCII value range
        //if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
        if (Character.isAlphabetic(ch)){ //using character class
            System.out.println(ch + " is a Alphabet.");
        } //else if (ch >= 48 && ch <= 57) {
        else if(Character.isDigit(ch)){
            System.out.println(ch + " is a Number.");
        } else {
            System.out.println(ch + " is a Symbol.");
        }
        sc.close();
    }
}

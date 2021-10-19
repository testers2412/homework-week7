package question16to20;
//Write a Java program to sort a numeric array and a string array.
import java.util.Arrays;

public class Question17 {
    public static void main(String[] args) {
        int[] a = {2003,1987,1995,2009,2021,1980};// int array to store more than one numeric variable
        String[] b = {"Gujarat", "Maharastra", "Delhi", "Panjab", "Kashmir"};// String array to store more than one String type variable
        System.out.println( "The Original Numeric Array: "+ Arrays.toString(a));
        Arrays.sort(a);// to sort int array in to ascending order
        System.out.println("Numeric Array in ascending order: "+ Arrays.toString(a));
        System.out.println("The Original String Array: "+ Arrays.toString(a));
        Arrays.sort(b);// to sort String array in to alphabetical order
        System.out.println("String Array in Alphabetical order: "+ Arrays.toString(b));

    }
}

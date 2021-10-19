package question16to20;
//Write a Java program to sum values of an array.
public class Question18 {
    public static void main(String[] args) {
        int [] num = new int[]{12, 24, 36, 48, 60, 72};// int array to store multiple int variables
        int sum=0;
        for (int i:num) {// adding all the number in the array using for loop
            sum+=i;
        }
        System.out.println("The sum is: "+sum);//Prints a String and then terminate the line
    }

    }



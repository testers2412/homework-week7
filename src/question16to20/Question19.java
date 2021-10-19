package question16to20;

//Write a Java program to calculate the average value of array elements
public class Question19 {
    public static void main(String[] args) {


        int[] num = {32, 44, 52, 12, 50, 67};
        int sum = 0;

        for (int j : num) {
            sum += j;
        }

        double avg = sum / num.length;
        System.out.println("Average of the provided numbers: " + avg);
    }
}

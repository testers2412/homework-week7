package question11to15;
//Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately
public class Question11 {
    public static void main(String[] args) {
        System.out.println("Numbers divided by 3:");

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");//printed sout statement with print so all numbers can come in one line

        }
        System.out.println("");// had to print empty sout statement to get next statement in next line
        System.out.println("Number divided by 5:");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + ", ");
        }
    }
}



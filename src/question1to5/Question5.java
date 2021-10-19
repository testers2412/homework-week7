package question1to5;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format _______________________________ | Salary Slip | |______________________________| | Employee Id : 2564 | | Employee Name : Jay | |______________________________| | Basic Salary : 25000.0 | | HRA 10% : 2500.0 | | TA 8% : 2250.0 | | DA 9% : 2000.0 | | PF - 20& : 5000.0 | |______________________________| | Gross Salary : 26750.0 | |===========================|
 */
public class Question5 {
    static int eID;// static int variation
    static String eName;// static string variation
    static float bs, hra, ta, da, pf, gs;// static float variation

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter employee ID: ");
        eID = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter employee Name: ");
        eName = sc.nextLine();
        System.out.println("Please enter basic salary of the employee: ");
        bs = sc.nextFloat();
        hra = ((bs * 10) / 100);//HRA is 10% of basic
        ta = ((bs * 8) / 100);// TA is 8% of basic
        da = ((bs * 9) / 100);// DA is 9% of basic
        pf = ((bs * 20) / 100);// PF is 20% of basic
        gs = (bs + hra + ta + da - pf);// Gross salary is addition of Basic,HRA,TA and DA and deduction of PF
        System.out.println(" _______________________________ ");
        System.out.println("|         Salary Slip           |");
        System.out.println("|_______________________________|");
        System.out.println("|Employee ID      : " + eID + "        |");
        System.out.println("|Employee Name    : " + eName + "         |");
        System.out.println("|_______________________________|");
        System.out.println("|Basic Salary     : " + bs + "     |");
        System.out.println("|HRA 10%          : " + hra + "      |");
        System.out.println("|TA 8%            : " + ta + "      |");
        System.out.println("|DA 9%            : " + da + "      |");
        System.out.println("|PF -20%          : " + pf + "      |");
        System.out.println("|_______________________________|");
        System.out.println("|Gross Salary     : " + gs + "     |");
        System.out.println("|===============================|");
        sc.close();
    }


}

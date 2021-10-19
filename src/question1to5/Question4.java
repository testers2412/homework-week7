package question1to5;

/**
 * (-1600); should return false since the parameter is not in the range(1-9999)
 * ● isLeapYear(1600); should return true since 1600 is a leap year
 * ● isLeapYear(2017); should return false since 2017 is not a leap year
 * ● isLeapYear(2000);should return true because 2000 is a leap year
 * Write another method getDaysInMonth with two parameter month and year. Both of type int. If parameter month is < 1 or >12 return -1. If parameter year is <1 or >9999 than return -1. This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February). You should check if the year is a leap year using the method isLeapYear describe above.
 * Example of input/Output:
 * ● getDaysInMonth(1, 2020); should return 31 since January has 31 days.
 * ● getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap
 * year.
 * ● getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and
 * 2018 is not a leap year.
 * ● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
 * ● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to
 * 9999 HINT: Use the switch statement. NOTE: Methods isLeapYear and getDaysInMonth need to be public static
 * 5.
 */
public class Question4 {
    public static void isLeapYear(int year){
        if(year<=1 || year>=9999){  //nested if else statement
            System.out.println("parameter is not in a range (1-9999)");
        }else if (year%4==0 && year%100!=0 || year%400==0){ // formula to find out leap year
            System.out.println("is a leap year. ");
        }else {
            System.out.println("is not a leap year.");
        }
    }

    public static void getDaysInMonth(int month, int year){
        if(month<1 || month>12){
            System.out.println("-1 - Invalid Month");
        }else if(year<1 || year>9999){
            System.out.println("-1 - Invalid Year");
        }else{
            switch (month){ //nested switch statement under if else statement
                case 1:
                    System.out.print("Month is January with 31 days and ");
                    isLeapYear(year);
                    break; // break statement to end the loop if expression is matching the case
                case 2:
                    if(year%4==0 && year%100!=0 || year%400==0){// nested if else statement under switch statement
                        System.out.print("Month is February with 29 days and ");

                    }else{
                        System.out.print("Month is February with 28 days and ");

                    }
                    isLeapYear(year);
                    break;
                case 3:
                    System.out.print("Month is March with 31 days and ");
                    isLeapYear(year);
                    break;
                case 4:
                    System.out.print("Month is April with 30 days and ");
                    isLeapYear(year);
                    break;
                case 5:
                    System.out.print("Month is May with 31 days and ");
                    isLeapYear(year);
                    break;
                case 6:
                    System.out.print("Month is June with 30 days and ");
                    isLeapYear(year);
                    break;
                case 7:
                    System.out.print("Month is July with 31 days and ");
                    isLeapYear(year);
                    break;
                case 8:
                    System.out.print("Month is August with 31 days and ");
                    isLeapYear(year);
                    break;
                case 9:
                    System.out.print("Month is September with 30 days and ");
                    isLeapYear(year);
                    break;
                case 10:
                    System.out.print("Month is October with 31 days and ");
                    isLeapYear(year);
                    break;
                case 11:
                    System.out.print("Month is November with 30 days and ");
                    isLeapYear(year);
                    break;
                case 12:
                    System.out.print("Month is December with 31 days and ");
                    isLeapYear(year);
                    break;

            }
        }
    }

    public static void main(String[] args) {
        isLeapYear(400);
        getDaysInMonth(2,2020);
    }






}

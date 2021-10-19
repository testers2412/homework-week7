package question6to10;

import java.util.Scanner;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
 * Commission Sales amount >= 50,000 35% Sales amount >= 30,000 20% >= 20,000 10% >= 10,000 5% < 10,000 2%
 */
public class Question7 {
    int sID;// integer type instance variable
    float sAm, slB, com;// float type instance variable
    String sNm;// String type instance variable

    public static void main(String[] args) {
        Question7 obj= new Question7();
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter sales ID:");
        obj.sID = Integer.parseInt(sc.nextLine());// used Integer.parseint method to convert int in to string to go to next line
        System.out.println("Please enter seller's Name: ");
        obj.sNm = sc.nextLine();
        System.out.println("Please enter sales amount: ");
        obj.sAm=sc.nextFloat();
        System.out.println("Please enter salary basic: ");
        obj.slB=sc.nextFloat();
        if( obj.sAm>=50000){     //nested if else statement used.
            obj.com =(35*obj.sAm)/100;
        }else if(obj.sAm>=30000){
            obj.com=((20*obj.sAm)/100);
        }else if(obj.sAm>=20000){
            obj.com=((10*obj.sAm)/100);
        }else if(obj.sAm>=10000){
            obj.com=((5*obj.sAm)/100);
        }else
            obj.com=(2*obj.sAm)/100;
        System.out.println("This sales Commission is "+obj.com);
        sc.close();  //Scanner is closed.
        }







    }




package day13_Scanner;

import java.util.Scanner;

public class NextLine_VS_NextMethods {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// 120000Enter
        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();//120000

        input.nextLine();//Enter

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Salery: "+ salary);
        System.out.println("full name: "+ fullName);


    }


}

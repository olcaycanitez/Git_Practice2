package day15;
/*
2. write a program to ask user to enter first naame and last name
			then print the full name in all upper case
 */

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scan.next();

        System.out.println("Enter your last name: ");
        String lastName = scan.next();

        String fullName = firstName + " " + lastName;
                fullName = fullName.toUpperCase();

        System.out.println(fullName);





    }



}

package day15;
// write a program that asks the user enter first name then last name.
// print the initails of the person

import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();
        char ch1 = firstName.charAt(0);

        System.out.println("Enter your last name");

        String lastName = scan.next();
        char ch2 = lastName.charAt(0);

        System.out.println(ch1 + "." + ch2);






    }


}

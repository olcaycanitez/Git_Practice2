package day13_Scanner;

import java.util.Scanner;

public class Next_Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.next();

        //input.next();

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        String fullName = firstName+ " " + lastName;

        System.out.println("Full name is :"+ fullName);




    }


}

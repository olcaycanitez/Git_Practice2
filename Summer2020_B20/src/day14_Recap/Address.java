package day14_Recap;
/*
1. Write a program for the shipping info that, the program should ask:

           building number(nextInt())
            nextLine()
           Street address (Assume it has more than one word)(nextLine())
           city name (nextLine())
           state name (next())
           zip code(nextInt())
            nextLine()
           full name of the person:(nextLine())
    and prints the ship to info in the following format:

    ex output:
             ship To: Jimmy joe
                      7925 Jones Branch Dr
                      MCLean, VA 22102
 */

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your building number");
        int buildingNumber = input.nextInt();

        input.nextLine();
        System.out.println("Enter your street name");
        String streetName = input.nextLine();

        System.out.println("Enter your city Name");
        String cityName = input.nextLine();

        System.out.println("Enter your state Name");
        String stateName = input.next();

        System.out.println("Enter your zip code");
        int zipCode = input.nextInt();

        input.nextLine();
        System.out.println("Enter your full Name");
        String fullName = input.nextLine();

        input.close();

        System.out.println("ex output:"+"\n\t\t"+"ship To: "+ fullName+"\n\t\t"+ zipCode +" "+ streetName+"\n\t\t"+cityName+" "+stateName+ " "+zipCode);


    }

}

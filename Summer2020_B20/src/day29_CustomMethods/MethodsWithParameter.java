package day29_CustomMethods;

import java.util.Scanner;

public class MethodsWithParameter {

    public static void main(String[] args) {

     printHello(5);

        System.out.println("=============================================================");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter birth year and current year");

        /*
        int birhYear = scan.nextInt();
        int currentYear = scan.nextInt();
        */
     age( scan.nextInt() , scan.nextInt() );

    }


    public static void printHello(int numbeOfTimes){

        for(int i = 0; i < numbeOfTimes; i++){

            System.out.println("Hello World");
        }

    }

    public static void age(int birthYear, int currentYear){
        if(birthYear > currentYear){
            System.out.println("Invalid entry");
        }else{
            int age = currentYear - birthYear;
            System.out.println("You are "+age+" years old");
        }



    }


}

package OlcayAli;
/*
write a program that can calculate the sum of all numbers between 1 to any given number
 */

import java.util.Scanner;

public class SumOfGiven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int sum = 0;

        for( int i = 1; i <= number; i++  ){
            sum += i;
            System.out.print(i);
        }
        System.out.print("\n"+sum);

    }
}


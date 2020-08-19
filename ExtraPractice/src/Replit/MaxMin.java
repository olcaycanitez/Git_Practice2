package Replit;
/*
1. write a program that asks user to enter 10 numbers and returns the maximum number
2. write a program that asks user to enter 10 numbers and returns the minimum number
 */

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -999999999;
        int min =  999999999;

        int i = 1;
        while (i <=10){
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }

            i++;
        }

        System.out.println("Maximum Number: "+max);
        System.out.println("Minimum Number: "+min);


    }
}

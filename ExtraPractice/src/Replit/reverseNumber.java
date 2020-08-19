package Replit;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        int reverse= 0;

        while (num >0){
            reverse = (reverse * 10) + num % 10;

            num/=10;
        }

        System.out.println(reverse);


    }
}

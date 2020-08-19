package OlcayAli;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) { // positive, 1 and itself find prime number....
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(); // ==> num

        int i;

        if (num <= 1) {
            System.out.println("invalid");
        } else {
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println("invalid");
                }
            }
            if (i == num) {
                System.out.println("is prime");
            } else {
                System.out.println("it is not prime");
            }


        }
    }
}
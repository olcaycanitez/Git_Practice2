package OlcayAli;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");

        int num1 = input.nextInt();

        System.out.println("Enter your secend number");

        int num2 = input.nextInt();

        int larger = (num1 > num2) ? num1 : num2;

        System.out.println("Greater number is: " + larger);





    }
}

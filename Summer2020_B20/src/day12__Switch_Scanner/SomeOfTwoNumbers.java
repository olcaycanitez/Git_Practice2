package day12__Switch_Scanner;
import java.util.Scanner;
public class SomeOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = scan.nextInt();

        System.out.println("Some of those two numbers are: "+ (num1+num2));




    }



}

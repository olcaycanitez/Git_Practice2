package OlcayAli;

import java.nio.channels.AsynchronousByteChannel;
import java.util.Scanner;

public class practice4 {
    /*
    write a program that asks the user enter the:
                    1. company name
                    2. first name
                    3. last name
                    4. Job title
                    5. salary

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("company name");
        String comepanyName = input.next();

        System.out.println("firt name");
        String firstName = input.next();

        System.out.println("last name");
        String lastName = input.next();

        input.nextLine();
        System.out.println("Job title");
        String jobTitle = input.nextLine();// nextLine kullanmamin sebebi job title birden fazla cumle olabillir.

        System.out.println("salary");
        double salary = input.nextDouble();

        input.nextLong();







   }


    }




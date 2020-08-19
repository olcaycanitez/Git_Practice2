package Replit;

import java.util.Scanner;

public class SmsMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String verible = "";
        String sender = scan.nextLine();
        String phoneNumber = scan.nextLine();
        String messageBody = scan.nextLine();

        System.out.println("Message body: "+ messageBody+"\n"+"sender: "+sender + "\n"+"Phone Number: "+phoneNumber);


    }

}

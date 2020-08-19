package Replit;

import java.util.Scanner;

public class Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int underScore = email.indexOf("_");
        int atSign = email.indexOf("@");
        int dotSign = email.indexOf(".");

        String firstName = email.substring(0,1).toUpperCase() + email.substring(1, underScore);
        String lastName = email.substring(underScore+1, underScore+2).toUpperCase() + email.substring(underScore+2, atSign);
        String domain = email.substring(atSign+1,dotSign);
        String topLevelDomain = email.substring(dotSign+1);

        System.out.println("First name: "+ firstName );
        System.out.println("Last name: "+ lastName);
        System.out.println("Domain: "+ domain);
        System.out.println("Top-Level Domain: "+ topLevelDomain);



    }
}

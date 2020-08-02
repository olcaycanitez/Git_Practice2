package day13_Scanner;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fullName = input.nextLine();

        System.out.println("Enter your company name: ");
        String companyName = input.nextLine();

        System.out.println("Full Name: "+ fullName);
        System.out.println("Company Name: "+ companyName);


    }

}

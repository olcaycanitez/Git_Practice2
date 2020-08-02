package day18_ForLoop;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        String firstName = scan.next();
        String lastName = scan.next();

        String initial = firstName.substring(0,1)+lastName.substring(0,1); // "jp"
                initial = initial.toUpperCase(); // "JP"

        System.out.println(initial);




        char ch1 = firstName.charAt(0);
        char ch2 = lastName.charAt(0);

        String initial2 = ""+ch1+"."+ch2;
                initial2.toUpperCase();

        System.out.println(initial);



    }
}

package Replit;

import java.util.Scanner;

public class email {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
      //  String email = input.next(); // ali_asici@gmail.com
         String  email = "ali_asici@gmail.com";

         String result = "";

         int under = email.indexOf("_");
         int ad= email.indexOf("@");

         result = email.substring(under + 1, ad) + email.substring(under, under+1)+ email.substring(0, under) + email.substring(ad, email.length());

        System.out.println(under);
        System.out.println(ad);
        System.out.println(result);



    }
}

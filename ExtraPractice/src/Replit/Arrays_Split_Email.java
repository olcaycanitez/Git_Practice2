package Replit;
import java.util.Scanner;
public class Arrays_Split_Email {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       // String email = input.nextLine();

        //Write your code below
       // String name = email.substring(email.indexOf("@"));
        //String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        String email = "olcaycanitez@gmail.com";


        if (!email.contains("@")  || (email.indexOf("@") != email.lastIndexOf("@"))) {
            System.out.println("invalid email");
        }else{
            String[] str = email.split("@"); // {olcaycanitez, gmail.com}
            System.out.println(str[0]);
            System.out.println(str[1]);
//            String id = email.substring(email.indexOf("@"));
//            String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
//
        }



//        int a = email.indexOf("@");
//        int b = email.lastIndexOf("@");
//
//
//        System.out.println(a);
//        System.out.println(b);


    }
}




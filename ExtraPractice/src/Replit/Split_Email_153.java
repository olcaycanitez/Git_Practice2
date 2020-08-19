package Replit;

import java.util.Scanner;

public class Split_Email_153 {
    public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//        String s = inp.next();
//        String str1 = "ali, asici, 45";
//        String[] str2 = str1.split(",");
//        System.out.println(str2[0]);
        String s = "ali, asici, 45";
        person(s) ;


    }

    public static void person(String info) {

        String[] str3 = info.split(",");

        System.out.println("person name: "+ str3[0]+" last name: "+str3[1]+ " age: "+str3[2]);

    }


}
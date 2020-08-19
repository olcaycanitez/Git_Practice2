package AliOlcay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Method157 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine()); // 07:05:45PM, 07 ==>19
    }

    public static void timeConversion(String s) {

        String result = "";
        String[] arr = s.split(":"); // [07, 05, 45PM]
         int a = Integer.parseInt(arr[0]);
         if(arr[2].contains("p") || arr[2].contains("P")){
             result = "" +(a + 12);
         }
         if(arr[2].contains("a") || arr[2].contains("A")){
             result = "" + a;
         }

         
    }
}
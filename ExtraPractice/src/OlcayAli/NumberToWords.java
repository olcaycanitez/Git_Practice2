package OlcayAli;
/*
write a java program that can convert any given numbers between 0 ~ 9 to words, // zero, one, two, ... nine
if the number is greater than 9 or less than zero, out put should be "Invalid".

 */

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = input.nextInt();

        String result = "";

        switch (num){
            case 0:
                //System.out.println("zero");
                result = "zero";
                break;
            case 1:
               //System.out.println("one");
                result = "one";
                break;
            case 2:
                //System.out.println("one");
                result = "two";
                break;
            case 3:
                //System.out.println("three");
                result = "three";
                break;
            case 4:
                //System.out.println("four");
                result = "four";
                break;
            case 5:
                //System.out.println("five");
                result = "five";
                break;
            case 6:
                //System.out.println("six");
                result = "six";
                break;
            case 7:
                //System.out.println("seven");
                result = "seven";
                break;
            case 8:
                //System.out.println("eight");
                result = "eight";
                break;
            case 9:
                //System.out.println("nine");
                result = "nine";
                break;
            default:
                //System.out.println("invalid");
                result = "invalid";

        }
        System.out.println(result);

        String result2 = (num == 0) ? "Zero" : (num == 1) ? "One" : (num == 2) ? "Two" :(num == 3) ? "Three" :
                         (num == 4 ) ? "Four" :(num == 5) ? "Five": (num == 6) ? "Six" : (num == 7) ? "Seven" :
                                 (num == 8) ? "Eight" : (num == 9) ? "Nine" : "Invalid";
        System.out.println(result2);
    }
}

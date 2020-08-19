package OlcayAli;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = input.next(); // elle reverse ==> elle reverse equal word ise word is palindrome...
                                   //   word == reverse ve/veya    (reverse)
        int indexNumber = word.length(); // word.length() -1;

        String reverse = ""; // null

        for( int i = indexNumber -1 ;i >= 0; i--){ // charAt(5) ==> 'a'
            reverse += word.charAt(i);
        }
        boolean isPalindrome = word.equalsIgnoreCase(reverse);
        System.out.println(isPalindrome);



    }
}

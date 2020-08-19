package Replit;

import com.sun.javafx.collections.SetAdapterChange;

import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next(); // xapplex word.substring(4) == > lex

        int index = word.length();

        String result = "";

        if(word.substring(0, 1).equalsIgnoreCase("x")){
            if(word.substring(index-1).equalsIgnoreCase("x")){
                result =""+ word.substring(1, index -1); // apple
            }else{
                result ="" + word.substring(1);
            }
        }else if(word.substring(index-1).equalsIgnoreCase("x")){
            result = "" + word.substring(0,index-1); // appleX ==> apple
        }else{
            result = word;
        }
        System.out.println(result);





    }
}



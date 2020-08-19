package AliOlcay;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodWithString {
    public static void main(String[] args) {
        String str = "Java";

        String nonDup = "";
//
        for (int i = 0; i < str.length(); i++) { // iterate...
            String ch ="" + str.charAt(i);
            if (!nonDup.contains(ch)) {
                nonDup += ch;

            }
        }
        System.out.println(nonDup);


    }
}
package ArrayMethods;

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {

        String sentence = "I Love Programming Language";

        // Language Programming Love I

        String[] words = sentence.split(" ");  // {I, Love, Programming, Language}
        System.out.println(Arrays.toString(words));

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");


        }


    }
}

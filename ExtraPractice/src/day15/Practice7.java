package day15;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Practice7 {
    public static void main(String[] args) {

        String sentence = "Java is fun";
        //                 0123456789..

        // substring(beg index, end index)
        String word = sentence.substring(8 , 11);

        System.out.println(word);

        System.out.println("=======================================");

        String sentence2 = "I like Movies and Tv Series";
        //                  0123456789..

        //int total = sentence2.length();
        //System.out.println(total);

        String word2 = sentence2.substring(0,sentence2.length());

        System.out.println(word2);

        System.out.println("================================");

        String firstName = "OLCAY";
        String firstCharacter = firstName.substring(0,1);
        String rest = firstName.substring(1,firstName.length()); // firstName.length()==> last index + 1

        firstName = firstCharacter.toUpperCase() + rest.toLowerCase();

        System.out.println(firstName);

        System.out.println("================================================");

        String lastName = "AnKARa";
        String firstChar = lastName.substring(0,1); //
        String remaining = lastName.substring(1); // chool

        lastName = firstChar.toUpperCase() + remaining.toLowerCase(); // School


        System.out.println(lastName);

        System.out.println("======================================================");

        String s = "I like Game Of Thrones";
        //          0123456789...
        String series = s.substring(7);

        System.out.println(series);

        String s2 = "I like Java Programing Language";
        //           0123456789...

        String language = s2.substring(7);

        System.out.println(language);











    }

}

package day17_StringReveiw;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class String_Mehods {
    public static void main(String[] args) {

        String str = "Cybertek";
        //            01234567

        // charAt(index); ==> char

        char ch1 = str.charAt(7);

        System.out.println(ch1);

        // +:==> concatination
        String str2 = "Cybertek";
               str2 = str2 + " School";

        System.out.println(str2);

        // length()
        String str3 = "Cybertek School";
        //             01234567

        int l = str3.length(); // 15
        System.out.println("length: "+l);

        // lastindex: length - 1

        char ch2 = str3.charAt(l-1); // str3.length()-1
        System.out.println(ch2);

        System.out.println("last index: " + (l-1));

        // upperCase & lowerCase

        String str4 = "cybertek";
               str4 = str4.toUpperCase(); // "CYBERTEK"

        System.out.println(str4);

        String str5 = "JAVA";
               str5 = str5.toLowerCase(); // "java"

        System.out.println(str5);

        // trim()
        String str6 = "     Cybertek   School    ";

        System.out.println(str6);

        str6 = str6.trim(); // "Cybertek"

        System.out.println(str6);

        // substring:

        String str7 = "I Like Java Language";
        //             0123456789...

        String word = str7.substring(7,10+1); // "Java"

        System.out.println(str7);

        System.out.println(word);

        String word2 = str7.substring(12, str7.length());
        String word3 = str7.substring(12);

        System.out.println(word2);
        System.out.println(word3);

        String word4 = str7.substring(2);
        System.out.println(word4);


     // indexOf & lastIndexOf ==> int
        String str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you";
        int index1 = str8.indexOf("W");

        System.out.println(str8.charAt(index1));

        int index2 = str8.indexOf(", W") + 2;
        int index3 = str8.indexOf("We");

        System.out.println(index2);
        System.out.println(index3);

        String str9 = "Java Java Java";

        int index4 = str9.lastIndexOf("J");
        int index5 = str9.indexOf("J");

        int index6 = str9.indexOf(" Java ") + 1;
        int index7 = str9.lastIndexOf("Java");

        System.out.println(index4);
        System.out.println(index5);
        System.out.println(index6);
        System.out.println(index7);





    }

}

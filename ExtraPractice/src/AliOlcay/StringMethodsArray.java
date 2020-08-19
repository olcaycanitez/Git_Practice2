package AliOlcay;

import java.util.Arrays;

public class StringMethodsArray {
    public static void main(String[] args) {

        String sentence = "I do Love Programming Language I also like testing"; // use split method make array
        String[] str = sentence.split(" ");

        System.out.println(Arrays.toString(str));

        for(int i = 0 ; i < str.length; i++){
            System.out.print(str[i]+ " ");

        }
        System.out.println();
        System.out.println("======================");

        String str1 = "ALIASICI";
       char[] ch =  str1.toCharArray();

        System.out.println(Arrays.toString(ch));







    }

}

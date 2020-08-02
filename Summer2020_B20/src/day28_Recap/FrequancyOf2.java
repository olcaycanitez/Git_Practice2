package day28_Recap;

import java.util.Scanner;

public class FrequancyOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String word = scan.next();
        int l = word.length();
        //String str = "pythonpythoncatcatpythonpythonpython";
        //(0, 3)

        int count =0; // "cat"
        for(int i = 0; i <= str.length()-l; i++){
           // String a = str.substring(i, i+3);
            if(str.substring(i, i+l).equalsIgnoreCase(word)){
                count++;
            }
        }
        System.out.println(count);

    }

}

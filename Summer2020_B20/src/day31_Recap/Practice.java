package day31_Recap;
import Library.Util;
public class Practice {
    public static void main(String[] args) {
        String str = "AABCCCCCCCC";

        String expectedResult = "";
        String nonDup = Util.removeDup(str);

        System.out.println(nonDup);


        for(int i = 0; i<= nonDup.length()-1; i++){
            char ch1 = nonDup.charAt(i); // A
            int count1 = Util.frequency(str, ch1);
            expectedResult +="" + ch1 + count1;

        }
        System.out.println(expectedResult);

    }
}

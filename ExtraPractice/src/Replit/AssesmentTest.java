package Replit;

import java.util.Arrays;

public class AssesmentTest {
    public static void main(String[] args) {

        String str = "Ali";
        String str2 = "Ali geldi, Ali gitti";

        String[] s = str2.split(" ");
        int count  = 0;

        str2= str2.replaceAll(",","");

        System.out.println(str2);
        String[] str3 = {"A", "B","C"}; // C, B,A
        String[] str4 = new String[str3.length];

        int z = 0;
        for(int i = str3.length-1; i>=0; i--){
            str4[z] = str3[i];

            z++;
        }

        System.out.println(Arrays.toString(str4));

        int k = str3.length-1;
        for(String each : str3){
            str4[k] = each;
            k--;
        }
        System.out.println(Arrays.toString(str4));

//        for(String each : s){
//            if(each.equals(str)){
//                count++;
//            }
//            if(count == 2){
//                return true;
//            }else{
//                return false;
//            }
//
//        }



    }


}

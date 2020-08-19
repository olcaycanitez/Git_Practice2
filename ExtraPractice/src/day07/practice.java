package day07;
import java.util.*;
public class practice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below

        String firstlast = "";
        for(String each : words){
            firstlast += each.substring(0,1) + each.substring(each.length()-1) + ", ";

        }
        String[] result = {firstlast};
        System.out.println(Arrays.toString(new String[]{firstlast}));


    }

}

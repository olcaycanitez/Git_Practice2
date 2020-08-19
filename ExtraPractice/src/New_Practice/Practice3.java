package New_Practice;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {

        String[] names = {"John", "Adam", "Don"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        for(String item : names){
            System.out.println("names "+ item);
        }




    }

}

package New_Practice;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {

        int[] intArray = {2,15,7,1,3};
        Arrays.sort(intArray);

        System.out.println(Arrays.toString(intArray));

        System.out.println();

        for(int item : intArray){
            System.out.println("numbers "+ item );

        }


    }
}

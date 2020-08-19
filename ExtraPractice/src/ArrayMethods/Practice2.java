package ArrayMethods;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {

        int[] myNum = {10, 20, 30, 40, 50, 5, 4, 1, -10};

        System.out.println(myNum[myNum.length-1]);

        Arrays.sort(myNum);

        System.out.println(Arrays.toString(myNum));

      // find max and min ...
        System.out.println("Max num is: " + myNum[myNum.length-1]);

        System.out.println("Min num is: "+ myNum[0]);
    }
}

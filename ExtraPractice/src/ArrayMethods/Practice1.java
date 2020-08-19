package ArrayMethods;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5, 1.3, 5.4, 2.7};

        System.out.println(myList[0]);

        System.out.println(myList[1]);

        System.out.println(Arrays.toString(myList));

        Arrays.sort(myList); // smaller than bigger a

        System.out.println( "Max index number is: " + myList[myList.length-1]);
        // minimum index?
        System.out.println("Min index number is: " + myList[0]);

        System.out.println(Arrays.toString(myList));






    }
}

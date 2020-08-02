package day25_Practices;

import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,12,34,5,6,7,8,97,6,54,34,32};
        int[] arr2 = {4,5,45,66,67567,67568,573,45,645,5,6};

        int size = arr1.length + arr2.length;

        int[] arr3 = new int[size]; // 5

        /*

        arr3[0] = arr1[0];
        arr3[1] = arr1[1];
        arr3[2] = arr1[2];

        arr3[3] = arr2[0];
        arr3[4] = arr2[1];


         */

        int index = 0;
        for(int each : arr1){
           arr3[index] = each;
           index += 1;
        }
        for (int each : arr2){
            arr3[index] = each;
            index += 1;
        }


        System.out.println(Arrays.toString(arr3));

        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr3));

        System.out.println("Maximum: " + arr3[arr3.length-1]);

        int[] arr4 = {10,20,342,56786868,3,897789,879,98,67,54,23,3564,45564};
        arr4[4] = 9;
        Arrays.sort(arr4);

        System.out.println(Arrays.toString(arr4));






    }

}

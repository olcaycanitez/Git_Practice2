package day26_MultiDimensionalArray;

import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {

        int[] arr = {2,1,3,4,6,5,9,8,11,23,56,14};
        Arrays.sort(arr); // arr: 1 2 3
        System.out.println(Arrays.toString(arr));

        int[] desc = new int[arr.length];// {3,2,1}
                    /*

                    desc[0] = arr[2];
                    desc[1] = arr[1];
                    desc[2] = arr[0];


                     */

                    int k = arr.length-1;
                    for(int i = 0; i<= desc.length-1; i++){

                        desc[i] = arr[k];

                        k--;
                    }

        System.out.println(Arrays.toString(desc));

    }
}

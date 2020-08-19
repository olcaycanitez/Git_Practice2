package New_Practice;

import java.util.Arrays;

public class practice1 {
    public static void main(String[] args) {

        int[] targetArrayObject = {11,4,6};
        int targetItemToSerch = 4;

        Arrays.sort(targetArrayObject);
        //Arrays.binarySearch(targetArrayObject, targetItemToSerch);

        System.out.println(Arrays.toString(targetArrayObject));


    }

}

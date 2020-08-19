package ArrayMethods;
/*
 declare an integer array of size 8 and assign the values 10, 20, 30, 40, 50 ....to it.

Then use a for loop to print out all the elements of the array, one per line.
 */
import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {

        int[] nums = {10,20,30,40,50,5,60,70,80};

        int max = nums[0];
        int min = nums[0];

        for(int i = 0; i <= nums.length-1; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(min > nums[i]){
                min = nums[i];

            }
        }
        System.out.println(max);
        System.out.println(min);


    }
}

package ArrayMethods;

public class ForEach {
    public static void main(String[] args) {
        int[] nums = {125, 132, 95, 116, 110, 88, 76, 93, 11, 16, 18, 21, 118, 45, 66};
        int max = nums[0];
        int min = nums[0];


        for (int each : nums) { // 125, 132, 95, 116, 110 iterate
            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }
        }
        System.out.println("Minimum number is: " + min);
        System.out.println(("Maximum number is: " + max));


        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i] + "  ");
            }

        }
        System.out.println();

        for(int k = 0; k <= nums.length -1; k++){
            if(nums[k] % 2!= 0){
                System.out.print(nums[k] + "  ");
            }
        }






    }
}

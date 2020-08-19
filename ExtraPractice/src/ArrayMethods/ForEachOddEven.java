package ArrayMethods;

public class ForEachOddEven {
    public static void main(String[] args) {
        int[] nums = {125, 132, 95, 116, 110, 88, 76, 93, 11, 16, 18, 21, 118, 45, 66}; // 0, 1....

        nums[4] = 118;

        String even = "";
        String odd = "";

        for(int each : nums){
            if(each%2 == 0){
                even += each+ " ";
            }else{
                odd += each + " ";
            }
        }
        System.out.println(even + " ");
        System.out.println(odd+ " ");




    }

}

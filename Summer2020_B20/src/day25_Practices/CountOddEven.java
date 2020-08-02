package day25_Practices;

public class CountOddEven {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
        int countEVEN = 0;
        int countOdd = 0;

        String even = "";
        String odd = "";

        for(int each : nums){

            if(each%2 == 0){
                countEVEN += 1;
                even += each + " ";

            }else{
                countOdd += 1;
                odd += each + " ";
            }


 /*           if(each%2 ==0){
                countEVEN += 1;
                even += each+ " ";
                continue;
            }
            countOdd ++;
            odd += countOdd;

  */
        }
        System.out.println("Even Numbers: "+ countEVEN);
        System.out.println(even);
        System.out.println("Odd Numbers: "+ countOdd);
        System.out.println(odd);



    }

}

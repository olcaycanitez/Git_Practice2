package StringMethods;

public class Practice1 {
    public static void main(String[] args) {

        int[] arr = {5,5,4,6,4,1, 5000, 100, 200, 3000, 4000};
        // max and min average...

        double average = 0;
        double sum = 0;
        for(int j = 0; j <= arr.length-1; j++){
            sum+=arr[j];
        }


        

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i <= arr.length-1; i++) {
            if (max < arr[i]) {
                max = arr[i];

            }
            if(arr[i] < min ){
                min = arr[i];
            }

        }
        System.out.println(sum);
        System.out.println(sum/(arr.length-1));
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);



    }


}

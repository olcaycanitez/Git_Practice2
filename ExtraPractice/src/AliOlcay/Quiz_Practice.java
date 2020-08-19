package AliOlcay;

import java.util.Arrays;

public class Quiz_Practice {
    public static void main(String[] args) {

      String[] names = {"olcay", "ali", "adem", "ramazan"};

      String[] team = {"besiktas", "fenerbahce"};

      String[] str = new String[names.length + team.length];

      int length = str.length;

      System.out.println(length);

//      str[0] = names[0];
//      str[1] = names[1];
//      str[2] = names[2];
//      str[3] = names[3];
//      str[4] = team[0];
//      str[5] = team[1];

        int i = 0;
        for(String each : names ){
                str[i] = each;
                i++;


        }
        for(String each : team){
            str[i] = each;
            i++;
        }

        System.out.println(Arrays.toString(str));

        int[] arr = {5,5,4,6,4,1, -100, 100, 200, 3000, -3000};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int max1 = arr[0]; // 10
        int min1 = arr[0];

        for(int j = 0; j <= arr.length-1; j++ ){
            if(max1 < arr[j]){
                max1 = arr[j];
            }

            if(min1 > arr[j]){
                min1 = arr[j];
            }
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.println("min: "+min1);
        System.out.println("max: "+max1);

        int min = arr[0];
        int max = arr[arr.length-1];


        System.out.println("min: "+min);
        System.out.println("max: "+max);






    }
}

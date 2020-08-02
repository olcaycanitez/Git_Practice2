package Office_Hours.Practice_07_15_2020;


import org.omg.CORBA.CODESET_INCOMPATIBLE;

import java.util.Arrays;

public class ArraysShortQuiz {
    public static void main(String[] args) {

        char[] arr = {'D', 'C', 'B', 'A'};

        Arrays.sort(arr); // {A,B,C,D}

        for(char each : arr){
            System.out.print(each);

            if(each=='D'){
                continue;
            }
        }

        System.out.println();

        System.out.println("==========================================================");
        int wd = 0;
        String[] days = {"sun", "mon", "wed", "sat"};
        for(int i = 0; i < days.length; i++){

            switch(days[i]){
                case "sat":
                case "sun":
                    wd-=1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd+=2;



            }


        }

    }


}

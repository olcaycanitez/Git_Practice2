package day25_Practices;

public class ShortestString2 {
    public static void main(String[] args) {
        String[] arr = {"Anam","Nicholas", "Amir", "Nurmamet", "Tony", "Musa", "Alan" };

        int minLength = arr[0].length();

        for (String each : arr ) {

            if(each.length()< minLength){
                minLength = each.length();
            }

        }


        for(String each  : arr){
            if(each.length() == minLength){
                System.out.println(each);
            }
        }



    }

}

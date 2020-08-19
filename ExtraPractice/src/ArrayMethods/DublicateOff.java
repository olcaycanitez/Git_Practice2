package ArrayMethods;

public class DublicateOff {
    public static void main(String[] args) {

        String[]  arr1 = {"abc", "java", "javahungry", "java", "javahungry" };

        String result = "";

        for(String each : arr1){
            if(!result.contains(each)){
                result += each;
            }
           if(!result.contains(each)){
               result += each;
           }
            if(!result.contains(each)){
                result += each;
            }


        }
        System.out.println(result);



    }
}

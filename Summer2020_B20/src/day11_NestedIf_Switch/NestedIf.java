package day11_NestedIf_Switch;

public class NestedIf {
    public static void main(String[] args) {

     /*
                  90 ~ 100==>A
                  80 ~ 89==>B
                  70 ~ 79==>C
                  60 ~ 69==>D
                  0  ~ 59==>F
                  other ==> Invalid

      */


        int score = 100;
        String result = "";

        if (score >= 0 && score <= 100) { // valid score
            if (score >= 90) {
                result = "A";
            }else if(score >= 80){
                result = "B";
            }else if(score >=70){
                result = "C";
            }else if(score >=60){
                result = "D";
            }else{
                result = "F";

            }
        }else{
            result = "Invalid";
        }
        System.out.println(result);

        System.out.println("===================================");

        /*
        first task
                precondition: minimum salary of30k
                     sub condition: minimum 2 years of job history
        second task
               1 Monday
               2 Tuesday
               3 Wednesday
               4 Thursday
               5 Friday
               6 Saturday
               7 Sunday
         */


    }
}





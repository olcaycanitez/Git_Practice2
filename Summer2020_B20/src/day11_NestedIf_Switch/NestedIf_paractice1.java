package day11_NestedIf_Switch;
 /*
        first task
                precondition: minimum salary of30k
                     sub condition: minimum 2 years of job history

  */

public class NestedIf_paractice1 {
    public static void main(String[] args) {

        double salary = 120_000;
        int jobHistory = 5;

        if(salary>=30_000){

            if(jobHistory>=2){
                System.out.println("You are qualified");
            }else{
                System.out.println("You must have been on job at least 2 year");
            }

        }else{
            System.out.println("You MUST earn at least $30K");
        }




    }
}

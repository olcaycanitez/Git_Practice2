package day09;

/*
Task01:
     write a program that can check if number is positive negative or equals to zero.
        for example:
            num  = 1
            prints:
                1 is positive number
            num = -6
            print:
                6 is negative number
            num = 0
            print:
                zero

 */

public class Practice {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = -6;
        int num3 = 0;



        if(num1>0){
            System.out.println(num1 + " is positive number");
        }
        if(num2<0){
            System.out.println(num2 + " is negative number");
        }
        if(num3==0){
            System.out.println("Zero");
        }

        System.out.println("=================================================================");
        /*
        Task02:
    write a program that can calculate the grade.
        1. if grade is bigger then 90 output "Excellent"
        2. if the grade is bigger then 70 and smaller then 90 output "Good"
        3. if grade is bigger then 60 and smaller then 70 output "Pass"
        4. if grade is smaller then 60 output "Fail"
        ex: score = 75
            output:
                Good
        HINT: you will need && logic

         */
        int score = 90;

        if(score>90){
            System.out.println("Excellent");
        }
        if(score>70 && 90>= score){
            System.out.println("Good");
        }
        if(score>60 && 70>= score){
            System.out.println("Pass");
        }
        if(score<60){
            System.out.println("Fail");
        }
        System.out.println("===============================================================");

        /*
        Task03:
    Write a program that can calcuate the grade based on the score
        if score is between 90 to 100 ==> A
        if score is between 80 to 90 ==> B
        if score is between 70 to 80 ==> C
        if score is between 60 to 70 ==> D
        if score is below 60 ==> F
        Ex: score = 85;
            output:
                Your grade is B

         */

        int grade= 80;
        if(grade>90 && 100>=grade){
            System.out.println("Your grade is A");
        }
        if(grade>80 && grade<=90){
            System.out.println("Your grade is B");

        }
        if(grade>70 && grade <=80 ){
            System.out.println("Your grade is C");
        }
        if(grade>60 && grade <=70){
            System.out.println("Your grade is D");
        }
        if(grade<=60){
            System.out.println("F");
        }


    }
}

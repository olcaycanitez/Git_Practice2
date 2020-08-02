package day12__Switch_Scanner;
/*
2. write a program that can define the age groups of a person

        age groups are:
        Teenager (< 21)
        Adult   (>=21 && <55 )
        Senior  ( > 55 )
        age cannot be negative or greater than 150
        NOTE: MUST APPLY NESTED IF

 */

public class AgeGroups {
    public static void main(String[] args) {
        int age = 88;

        String ageGroup = "";

        if(age >0 && age <=150){
    /*        if(age<21){
                ageGroup = "Teenager";
            }else if(age <= 55){
                ageGroup = "Adult";        ======> istersen bu yontemi kullan
            }else{
                ageGroup = "Senior";
            }


     */

        ageGroup = (age<21 )?"Teneger" : (age<=55)?"Adult" : "Senior";

        }else{
            ageGroup = "Invalid";
        }
        System.out.println(ageGroup);



    }
}

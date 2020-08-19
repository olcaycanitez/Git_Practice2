package day08;

public class Practice {
    public static void main(String[] args) {


        String firstName = "Olcay";
        String lastName = "Canitez";
        int age = 33;
        String citizenShip = "Turkey";

        boolean eligibleToVote =  age >= 18 && citizenShip == "USA";
        //                        19 >  18  && "Turkey"  == "USA"
        //                           true   &&   false
        //                                false
        String fullName = firstName + " "+ lastName;

        System.out.println(fullName+" is eligible to vote: "+ eligibleToVote);



    }
}

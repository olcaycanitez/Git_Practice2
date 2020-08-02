package day08_LogicalOperators;

public class Practice {
    public static void main(String[] args) {
        String firstName = "Olcay";
        String lastName = "Canitez";
        int age = 33;
        String citizenShip = "Turkey";

        boolean eligibleToVote = age >= 18 && citizenShip == "USA";
        //                        19>= 18  &&  "China"    == "USA"
        //                          true   &&   false

        String fullName = firstName +" "+ lastName;

        System.out.println(fullName +" is eligible to vote: "+ eligibleToVote);
        // Aaron Daniel is eligible to vote: false



    }
}

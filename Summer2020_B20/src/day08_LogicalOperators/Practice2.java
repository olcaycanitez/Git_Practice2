package day08_LogicalOperators;

public class Practice2 {
    public static void main(String[] args) {
        String firstName = "Canor";
        String lastName = "McNugget";

        int age = 45;
        String citizen1 = "Russia";
        String citizen2 = "USA";

        boolean eligibleAge = age >= 18;
        //                    12  >=18 ==> true

        boolean usaCitizen = citizen1 == "USA" || citizen2 == "USA";
        //                     "USA"  == "USA" || "France" == "USA"
        //                           true           false   ==> true
        boolean eligibleToVote = eligibleAge && usaCitizen;
        //                         true     &&   true ==> true

        String fullName = firstName + " " + lastName;

        System.out.println(fullName+ " is eligible to vote for Trump: " +eligibleToVote);// Conor McNugget is eligible to vote vote for Trump: false



    }
}

package day08;

public class Practice2 {
    public static void main(String[] args) {
        String firstName = "Olcay";
        String lastName = "Canitez";
        int age = 33;
        String citizen1 = "Turkey";
        String citizen2 = "USA";

        boolean eligibleAge = age>= 18;
        //                     12>= 18
        //                       false

        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";
        //                    USA    ==  USA  ||  France  == USA
        //                          true      ||       false
        //                                   true

        boolean eligibleToVote = eligibleAge && usCitizen;
        //                            false  &&   true ==> false
        String fullName = firstName+ " " + lastName;

        System.out.println(fullName + " is eligible to vote for Trump: "+ eligibleToVote);// Olcay Canitez is eligible to vote for Trump: false

    }
}

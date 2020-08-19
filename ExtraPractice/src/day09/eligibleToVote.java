package day09;

public class eligibleToVote {
    public static void main(String[] args) {
        int age = 30;
        boolean usCitizen = true;

        if(age >= 18 && usCitizen){
            System.out.println("Eligible to vote for Trump");
        }else{
            System.out.println("Not eligib to vote for Trump");
        }



    }

}



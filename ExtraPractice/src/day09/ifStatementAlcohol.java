package day09;

public class ifStatementAlcohol {
    public static void main(String[] args) {
        int age = 19;
        boolean hasID = true;

        boolean eligible = hasID && age >= 21;
        //                 TRUE && FALSE==> FALSE
        String result = "";

        if(eligible==true){
           // System.out.println("Eligible to buy alcohol");
            result = "Eligible to buy alcohol";
        }
        if(eligible!=true){
           // System.out.println("You buy your milk");
            result = "You re not old enough to buy alcohol";

        }

        System.out.println(result);



    }

}

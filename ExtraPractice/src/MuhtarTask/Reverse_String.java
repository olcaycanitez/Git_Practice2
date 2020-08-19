package MuhtarTask;

public class Reverse_String {
    public static void main(String[] args) {

        String word = "Hollywood";
        //             doowylloH
        // word.length() =
        // int i = length; i == 0; i--

       // String reverse = ""; // null

        int lastIndexNumber = word.length()-1;

        for(int i= lastIndexNumber; i >=0; i--){
            System.out.print(word.charAt(i));

           // reverse += word.charAt(i); // doowylloH
        }
       // System.out.println(reverse);



    }
}

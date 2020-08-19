package MuhtarTask;

public class AtoZ {
    public static void main(String[] args) {
        int A = 65; // condition, increment...
        String reverse = "";// null

        for(int i = 0; i <= 25; i++ ){
            char ch = (char)(A+i);
            reverse += ch + " "; // A B C D ...


        }
        System.out.print(reverse);

    }
}

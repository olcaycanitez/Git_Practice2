package OlcayAli;



import java.util.Scanner;

/*       Write a Java method to display the middle character of a string
         If the length of the string is even there will be two middle characters.
         If the length of the string is odd there will be one middle character.
                Input :
                    ayse,   alime
                Output:
                    The middle character in the string: ys

 */
public class practice10 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word:");

        String word = input.next();

        int middleNumber = word.length() / 2; //

        String middleOfChar = "";

        if(word.length() % 2 != 0){   // condition is odd
            middleOfChar = middleOfChar + word.charAt(middleNumber);
        }else{
            middleOfChar = middleOfChar + word.charAt(middleNumber - 1) + word.charAt(middleNumber);
        }

        System.out.println(middleOfChar);

    }
}
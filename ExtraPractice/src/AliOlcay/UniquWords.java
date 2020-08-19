package AliOlcay;

public class UniquWords {
    public static void main(String[] args) {

        String[] sentence = {"I", "do", "love", "Programming", "Language", "I", "also", "do", "love", "testing"};
        // programming, language, also, testing

        for(int i = 0; i < sentence.length; i++){
            String str = sentence[i];
            int count = 0;

            for(String each : sentence){
                if(each == str){ // if(str.equals(each) boylede oluyor.
                    count++;
                }
            }
            if(count == 1){
                System.out.print(str + " ");
            }

        }





    }

}

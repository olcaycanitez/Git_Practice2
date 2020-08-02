package Office_Hours.Practice_07_14_2020;

public class Unique {
    public static void main(String[] args) {
        String str = "ABABGAGADHGHJFGHNGC";
        String expectedResult = "";

        // str = "ABABC";

        for( int j = 0; j < str.length(); j++){

            char ch = str.charAt(j);
            int count = 0;
            for(int i = 0; i < str.length(); i++){
                char each = str.charAt(i);
                if(each == ch){
                    count += 1;

                }
            }
            if(count == 1){
                expectedResult +=ch;

            }


        }

        System.out.print(expectedResult);

    }

}

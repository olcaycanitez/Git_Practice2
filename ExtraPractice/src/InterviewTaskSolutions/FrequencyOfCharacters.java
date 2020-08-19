package InterviewTaskSolutions;
/*
Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */


public class FrequencyOfCharacters {


    public static String FrequencyOfChars(String str) {
        String expectedResult = "";

        for (int j = 0; j <= str.length() - 1; j++) {
            int count = 0;

            for(int i = 0; i <= str.length()-1; i++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            expectedResult += "" + str.charAt(j) + count;
            str = str.replace(""+str.charAt(j),"");
        }
        return expectedResult;


    }

}

package day23_Arrays;

public class FrequencyOfChar2 {
    public static void main(String[] args) {
        String str = "BBCCDD";
        String nonDup = "";

        for (int i = 0; i <= str.length() - 1; i++) { // remove duplicates
            String ch = "" + str.charAt(i);

            if (nonDup.contains(ch)) {
                continue;

            } else {
                nonDup += ch;

            }
        }

        String expectedResult = ""; // "B2C2D2"

        // str = "BBCCDD"    nonDup = "BCD"         ===> "B2C2D2"

        for (int j = 0; j <= nonDup.length() - 1; j++) {
            char ch1 = nonDup.charAt(j);  // B, C, D
            int count = 0; // 2, 2, 2

            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch1) {
                    count++;

                }

            }
            expectedResult += "" + ch1 + count;

        }

        System.out.println(expectedResult);

    }
}

//        char ch1 = nonDup.charAt(0);  // B
//        int count1 = 0;
//        for (int i = 0; i <= str.length() - 1; i++) {
//            if (str.charAt(i) == ch1) {
//                count1++;
//
//            }
//
//        }
//
//        expectedResult += "" + ch1 + count1;
//
//        char ch2 = nonDup.charAt(1);
//        int count2 = 0;
//
//        for (int i = 0; i <= str.length() - 1; i++) {
//            if (str.charAt(i) == ch2) {
//                count2++;
//
//
//            }
//
//        }
//        expectedResult += "";
//
//    }
//}
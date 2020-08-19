package Replit;

public class interviewQuestion {
    public static void main(String[] args) {
        String str =  "ABAB";
        String nonDup = "";
        String result = "";

        for(int i = 0; i <= str.length()-1; i++){
            String ch = ""+str.charAt(i);
            if(!nonDup.contains(ch)){
                nonDup += ch;
            }
        }

        System.out.println(nonDup);

        // str = "ABAB"           nonDup = "AB"

            for(int j = 0; j <= nonDup.length()-1; j++){
                char ch = nonDup.charAt(j);  //
                int count = 0;
                for(int i = 0; i <= str.length()-1; i++){
                    if(str.charAt(i) == ch){
                        count += 1;
                    }
                }
                result += ""+ ch + count;

            }

        System.out.println(result);

    }

}

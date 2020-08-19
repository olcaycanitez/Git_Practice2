package MuhtarTask;

public class a_To_z {
    public static void main(String[] args) {
        int a = 97; // 122 - 97 = 25 ama i < 26; i++

        String reserve = "";

        for(int i = 0; i < 26; i++){
            // a + i
            char ch =(char) (a + i);  // double a = (int)18.00;
            reserve += ch;
        }
        System.out.println(reserve);
//
//        for(int j = 97; j <= 122; j++ ){
//            char ch1 = (char)(j);
//            System.out.println(ch1);
//        }

    }

}

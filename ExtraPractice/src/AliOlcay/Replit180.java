package AliOlcay;

public class Replit180 {
    public static void main(String[] args) {

        String main = "Hello Mello Mellos"; // Hello [me]llo
        String coverMe = "SE";
        String result = "";

        if(main.contains(coverMe)){
           result +=  main.replace(coverMe,"["+coverMe +"]");

        }else{
            result = ""+ "["+ main +"]";

        }
        System.out.println(result);
    }
}

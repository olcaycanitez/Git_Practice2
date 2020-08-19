package AliOlcay;

public class UniquNumber {
    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4,5,5,6,7,7,8,0,0,9,9,9}; //2, 4, 6, 8

        // FOR loop ile arr elementler iterate edilecek...
        // element sayisi = 1 olan unique olacakkkk

        for(int i = 0; i < arr.length; i++) { // iterate ediyoruz...
            int num = arr[i];
            int count = 0;

            for (int each : arr) { // mukayese ediliyor....
                if (num == each) {
                    count++;
                }
            }
            if(count == 1){
                System.out.print(num + " ");
            }
        }

        System.out.println();

        // second solution...

        for(int a : arr){ //iterate ediyoruz.... //
            int count = 0;
            for(int b : arr){
                if( a == b){
                    count++;
                }

            }
            if(count == 1){
                System.out.print(a);
            }

        }

    }
}

package day08;

public class Practice3 {
    public static void main(String[] args) {
        int ApplesCount = 20;
        int OrangesCount = 30;
        int PearsCount = 30;

        boolean comp = ApplesCount < OrangesCount || OrangesCount >= PearsCount;
        //                 20      <     30       ||   30          >=    30
        //  TRUE           ||             TRUE
        // TRUE
        System.out.println(comp);

        System.out.println("===============================================");

        String OutsideWeather;
        int Degree;
        OutsideWeather = "Shinny";
        Degree = 70;
        boolean comp2 = (!(OutsideWeather == "Rainy" || Degree == 70));
        //    "Shinny"    == "Rainy" || 70 == 70
        //              false        ||   true
        //                     (!(true))
        //                        false

        System.out.println(comp2);
        System.out.println("==============================================");

        int b = 2;
        boolean res = ++b == 2 || --b == 2 && --b == 2;
        //             3  == 2 ||   2 == 2 &&   1 == 2
        //               false ||   true   &&   false
        //                     true        &&      false
        //                    false
        System.out.println(res);

        int c = 5;
        boolean r2 = c++ == 6 || c-- == 5 || c == 5;
        //           5   == 6 || 6   == 5;
        //              false ||   false:
        //                  false
        System.out.println(r2);


    }

}

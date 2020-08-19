package OlcayAli;

/*
write a program that asks the user to enter:
                        1. building number
                        2. street name (assume it has one word only)
                        3. road name (assume it has one word only)
                        4. city name (assume it has one word only)
                        5. state
                        6. zipcode
            and then print out the full address
                ex:
                    input:
                            7925
                            Jones Branch
                            Dr
                            McLean
                            VA
                            22000
                    output:
                        addrees:    7925 Jones Branch Dr, McLean VA, 22000
 */

import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("bulding number");
        String buldingNumber = input.next();

        System.out.println("street name");
        String streetName = input.next();

        input.nextLine();
        System.out.println("road name");
        String roadName = input.nextLine();

        System.out.println("city name");
        String cityName = input.next();

        System.out.println("state");
        String state = input.next();

        System.out.println("zip code");
        String zipCode = input.next();

        System.out.println("addrees: " + buldingNumber + " " + streetName+ " " + roadName +", "+ "\n\t\t\t"+ cityName+" "+ state+", "+zipCode);



    }
}

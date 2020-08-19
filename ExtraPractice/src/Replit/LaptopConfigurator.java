package Replit;
import java.util.*;
public class LaptopConfigurator {
    public static void main(String[] args) {
        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0;
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE


        System.out.println("Select screen size:");
        screenType = scan.next();

        if (screenType.equals("13.3")) {
            price += 200;
        } else if (screenType.equals("15.0")) {
            price += 300.0;
        } else if (screenType.equals("17.3")) {
            price += 400;
        }

        System.out.println("Select CPU type:");
        cpu = scan.next();

        if (cpu.equals("i3")) {
            price += 150;
        } else if (cpu.equals("i5")) {
            price += 250.0;
        } else if (cpu.equals("i7")) {
            price += 350;
        }


        System.out.println("Select RAM size:");
        ram = scan.nextInt();

        if (ram == 4) {
            price += 50;
        } else if (ram > 4) {
            ram = ram / 4;
            price += (ram * 50.0);
        }

        System.out.println("Select storage type:");
        storageType = scan.next();

        System.out.println("Enter memory size:");

        int memSize = scan.nextInt();

        if (storageType.equals("SSD")) {
            if (memSize == 500) {
                price += 100;
            } else if (memSize > 500) {
                memSize = memSize / 500;
                price += (memSize * 100);
            }

        } else if (storageType.equals("HDD")) {
            if (memSize == 500) {
                price += 50;
            } else if (memSize > 500) {
                memSize = memSize / 500;
                price += (memSize * 50);
            }

        }

        System.out.println("Enter screen resolution:");
        String resolution = scan.next();

        if (resolution.equals("4K")) {
            price += 200;
        } else if (resolution.equals("FULLHD")) {
            price += 100;
        }

            System.out.println("Laptop price is: $" + price);


        }

    }

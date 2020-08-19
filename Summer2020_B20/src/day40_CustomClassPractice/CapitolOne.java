package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitolOne {

    public static void main(String[] args) {
        BankAccount Beslan = new BankAccount();
        BankAccount Ahmet = new BankAccount();
        BankAccount Viorel  = new BankAccount();
        BankAccount Nurmamet = new BankAccount();
        BankAccount Wagar = new BankAccount();

        Beslan.setAccountInfo("Checking", "Beslan", "4567890123");
        Ahmet.setAccountInfo("Checking", "Ahmet", "341342365787");
        Viorel.setAccountInfo("Checking", "Viorel", "7612531265");
        Nurmamet.setAccountInfo("Checking", "Nurmamet", "87676756656");
        Wagar.setAccountInfo("Checking", "Wagar", "1323123122131");

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(Beslan, Ahmet, Viorel, Nurmamet, Wagar));

        for( BankAccount each : accounts){
            each.deposit(500);
            each.getAccountInfo();
        }

        accounts.get(3).deposit(10000);
        accounts.get(3).checkBalance();
        accounts.get(3).withDraw(9000);
        accounts.get(3).checkBalance();

        accounts.get(4).deposit(600);
        accounts.get(4).checkBalance();

        System.out.println("===========================================================================");
        accounts.removeIf( each -> each.balance < 1000);
        for(BankAccount each : accounts){
            each.getAccountInfo();
        }


    }

}

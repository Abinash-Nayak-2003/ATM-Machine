package ATMmachine;

import java.util.Scanner;

class ATM {
    float Balance;
    int PIN = 1289;

    public void checkpin() {
        System.out.println("Enter your pin:");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();
        if (enterpin == PIN) {
            menu();

        } else {
            System.out.println("Enter a valid pin:");
            checkpin();
        }
    }

    public void menu() {

        System.out.println("Enter Your choice:");
        System.out.println("1.check A/C Bsalance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.EXIT");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt == 1) {
            checkbalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice.");
        }
    }
    public void checkbalance()
    {
        System.out.println("Balance"+Balance);
        menu();
    }
    public void withdrawMoney()
    {
        System.out.println("Enter Amount to Withdraw:");
        Scanner Sc=new Scanner (System.in);
        float amount=Sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance=Balance-amount;
            System.out.println("Money Withdraw Successfull");
        }
        menu();
    }
    public void depositMoney()
    {
        System.out.println("Enter the Amount:");
        Scanner Sc=new Scanner(System.in);
        float amount=Sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("Money deposit Successfull:");
        menu();
    }
}
public class ATMmachine {
    public static void main(String[] args) {
        ATM obj=new ATM();
        obj.checkpin();

    }
}

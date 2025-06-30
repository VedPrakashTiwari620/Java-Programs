package com.example.challenges77__90.challenge78;

import java.util.StringJoiner;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public double getBalance(String acc) {
        if (acc==accountNumber){
            return balance;
        }
        return 0;
    }

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", BankAccount.class.getSimpleName() + "[", "]")
                .add("accountHolderName='" + accountHolderName + "'")
                .toString();
    }

    public void depositMoney(long deposit){
        if (deposit<=0){
            System.out.println("Invalid Deposit.");
        }else {
            balance+=deposit;
            System.out.printf("Current Balance is %f ", balance);
        }


    }

    public void withdrawMoney(long withdraw){

        if (withdraw<=0){
            System.out.println("Invalid Withdraw.");
        }else if (withdraw<=balance){
            balance-=withdraw;
            System.out.println("Withdrawing successfully");
            System.out.printf("Current Balance is %.2f ", balance);
        }else {
            System.out.println("Not Enough Balance.");
        }
    }
}

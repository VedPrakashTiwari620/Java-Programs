package com.example.challenge78;

import javax.swing.colorchooser.AbstractColorChooserPanel;

public class Customer {
    public static void main(String[] args) {
        BankAccount account= new BankAccount("Ved Prakash Tiwari","ICIC00121212",1000);
        account.withdrawMoney(10000);
        account.depositMoney(120000);
        System.out.println(account);
        if (account.getBalance("ICIC00121212")<=0){
            System.out.println("Acc No. Wrong.");
        }else {
            System.out.println(account.getBalance("ICIC00121212"));
        }

    }
}

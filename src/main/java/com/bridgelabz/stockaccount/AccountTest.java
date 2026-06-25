package com.bridgelabz.stockaccount;

public class AccountTest {

    public static void main(String[] args) {

        Account account = new Account("Chandana",10000);

        account.display();

        account.debit(3000);

        account.display();

        account.debit(9000);

        account.display();

    }

}
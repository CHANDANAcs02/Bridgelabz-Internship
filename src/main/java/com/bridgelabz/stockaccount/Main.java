package com.bridgelabz.stockaccount;

public class Main {

    public static void main(String[] args) {

        // Assignment 1

        StockPortfolio portfolio = new StockPortfolio();

        portfolio.addStock(new Stock("TCS",20,3500));
        portfolio.addStock(new Stock("Infosys",15,1600));
        portfolio.addStock(new Stock("Wipro",30,450));

        portfolio.printReport();

        // Assignment 2

        Account account = new Account("Chandana",10000);

        account.debit(2000);
        account.debit(15000);

        account.display();

        // Assignment 3

        StockAccount stockAccount = new StockAccount();

        stockAccount.buy("TCS",20);
        stockAccount.buy("Infosys",30);

        stockAccount.sell("TCS",5);

        stockAccount.printReport();

    }

}
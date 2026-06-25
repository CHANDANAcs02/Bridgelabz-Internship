package com.bridgelabz.stockaccount;

import java.time.LocalDateTime;

public class CompanyShares {

    private String stockSymbol;
    private int numberOfShares;
    private LocalDateTime transactionDate;

    public CompanyShares(String stockSymbol, int numberOfShares) {

        this.stockSymbol = stockSymbol;
        this.numberOfShares = numberOfShares;
        this.transactionDate = LocalDateTime.now();

    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void buyShares(int shares) {
        numberOfShares += shares;
        transactionDate = LocalDateTime.now();
    }

    public void sellShares(int shares) {

        if(shares <= numberOfShares){

            numberOfShares -= shares;
            transactionDate = LocalDateTime.now();

        }else{

            System.out.println("Not enough shares.");

        }

    }

    public void display(){

        System.out.println("----------------------");
        System.out.println("Stock Symbol : " + stockSymbol);
        System.out.println("Shares : " + numberOfShares);
        System.out.println("Transaction : " + transactionDate);

    }

}
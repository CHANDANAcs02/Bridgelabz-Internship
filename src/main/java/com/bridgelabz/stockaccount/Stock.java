package com.bridgelabz.stockaccount;

public class Stock {

    private String stockName;
    private int numberOfShares;
    private double sharePrice;

    public Stock(String stockName, int numberOfShares, double sharePrice) {
        this.stockName = stockName;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    public String getStockName() {
        return stockName;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public double getStockValue() {
        return numberOfShares * sharePrice;
    }

    public void displayStock() {
        System.out.println("------------------------------");
        System.out.println("Stock Name      : " + stockName);
        System.out.println("Number of Shares: " + numberOfShares);
        System.out.println("Share Price     : " + sharePrice);
        System.out.println("Stock Value     : " + getStockValue());
    }
}
package com.bridgelabz.stockaccount;

import java.util.ArrayList;

public class StockPortfolio {

    private ArrayList<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double calculateTotalValue() {
        double total = 0;

        for (Stock stock : stocks) {
            total += stock.getStockValue();
        }

        return total;
    }

    public void printReport() {

        System.out.println("\n------ STOCK REPORT ------");

        for (Stock stock : stocks) {
            stock.displayStock();
        }

        System.out.println("----------------------------");
        System.out.println("Total Stock Value : " + calculateTotalValue());
    }
}
package com.bridgelabz.stockaccount;

import java.util.ArrayList;

public class StockAccount {

    private ArrayList<CompanyShares> portfolio = new ArrayList<>();

    public void buy(String symbol,int shares){

        for(CompanyShares company : portfolio){

            if(company.getStockSymbol().equalsIgnoreCase(symbol)){

                company.buyShares(shares);
                return;

            }

        }

        portfolio.add(new CompanyShares(symbol,shares));

    }

    public void sell(String symbol,int shares){

        for(CompanyShares company : portfolio){

            if(company.getStockSymbol().equalsIgnoreCase(symbol)){

                company.sellShares(shares);
                return;

            }

        }

        System.out.println("Stock not found.");

    }

    public void printReport(){

        System.out.println("\n----- Portfolio Report -----");

        for(CompanyShares company : portfolio){

            company.display();

        }

    }

}
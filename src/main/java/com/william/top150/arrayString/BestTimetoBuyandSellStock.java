package com.william.top150.arrayString;

import java.util.HashMap;
import java.util.Map;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class BestTimetoBuyandSellStock {

    public static void main(String[] args) {

        int[] prices = {7,6,4,3,1};

        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {

        int minPrice = 10000;
        int maxProfit = 0;

        for(int i = 0; i< prices.length; i++){

            if(minPrice > prices[i]){
                minPrice = prices[i];
            }

            if(prices[i]-minPrice > maxProfit){
                maxProfit = prices[i]-minPrice;
            }
        }

        return maxProfit;
    }

}

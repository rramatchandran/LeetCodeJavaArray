package com.rfour;

public class bestTimetoBuySell {
    public static void main(String[] args) {

        bestTimetoBuySell mp = new bestTimetoBuySell();
        int[] prices = {7,1,5,3,6,4} ;
        mp.maxProfit(prices);

        int[] prices1 = {1,2,3,4,5};
        mp.maxProfit(prices1);

        int[] prices2 = {7,6,4,3,1};
        mp.maxProfit(prices2);
    }

    public int maxProfit(int[] prices){
        if(prices==null || prices.length ==0)
            return 0;
        int profit = 0;

        for(int i=0; i<prices.length-1;i++){
            if(prices[i+1] >prices[i]){
                profit +=prices[i+1] - prices[i];
            }
        }
        System.out.println(profit);
        return profit;

    }



}

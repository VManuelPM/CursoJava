package com.amoelcodigo.top.interview;

/**
 * Ejercicio 121
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock bs = new BestTimeToBuyAndSellStock();
        System.out.println(bs.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(bs.maxProfit(new int[]{7,6,4,3,1}));
        System.out.println(bs.maxProfit(new int[]{1}));
        System.out.println(bs.maxProfit(new int[]{2, 4, 1}));
    }
}

package com.skakarla.problems;

public class Buy_and_sell_stock_I 
{
	public static void main(String[] args) 
	{
		int[] price = { 7, 1, 5, 3, 6, 4 };
		int n = price.length;
		int bestBuy = price[0];
		int max_profit = 0, profit;
		for (int i = 1; i < n; i++) 
		{
			if (price[i] < bestBuy) 
			{
				bestBuy = Math.min(bestBuy, price[i]);
			} else 
			{
				profit = price[i] - bestBuy;
				max_profit = Math.max(max_profit, profit);
			}
		}

		System.out.println(max_profit);

	}

}

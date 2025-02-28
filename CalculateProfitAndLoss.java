import java.util.Scanner;

public class CalculateProfitAndLoss{
	public static void main(String [] args){
		double costPrice = 129;
		double sellingPrice = 191;
		if(sellingPrice > costPrice){
			double profit = sellingPrice - costPrice;
			double profitPercentage = (profit/costPrice)*100;
			System.out.print("Profit gained of Rs " + profit + ", profit percentage is of : " + profitPercentage);
			
		}
		else{
			double loss = sellingPrice - costPrice;
			double lossPercentage = (loss/costPrice)*100;
			System.out.print("Loss of Rs " + loss + ", loss percentage is of : " + lossPercentage);
		}
	}
}
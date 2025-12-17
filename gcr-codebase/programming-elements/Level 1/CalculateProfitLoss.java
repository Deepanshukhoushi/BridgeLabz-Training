//creating class CalculateProfitLoss 
public class CalculateProfitLoss{
    public static void main(String[] args){
	//creating variable costprice to store 129
	double costprice = 129;

	//creating variable sellingprice store 191
	double sellingprice = 191;
	
	// creating variable profit and profitpercentage to calculate values
	double profit = sellingprice-costprice;
	double profitpercentage = profit / costprice * 100;
	
	//displaying the values
	System.out.println("The Cost Price is INR " + costprice + " and Selling Price is INR " + sellingprice);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitpercentage);
    }
}
/*
18. Currency Exchange Kiosk 
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).
*/

import java.util.Scanner;
public class CurrencyExchange{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	String choice;
	do{
	    System.out.print("Enter Amount in INR: ");
	    double amount = input.nextDouble();
	    System.out.println("Choose Target Currency: ");
	    System.out.println("1: US Dollar\n2: Euro\n3: AUD\n4: CAD\n");
	    int currency = input.nextInt();
	
	    switch(currency){
	        case 1: {
		    System.out.println(amount + " INR = " + String.format("%.2f", (amount*0.011)) + " US Dollar");
	        break;
	        }
	        case 2: {
		    System.out.println(amount + " INR = " + String.format("%.2f", (amount*0.0095)) + " Euro");
	        break;
	        }
	        case 3: {
		    System.out.println(amount + " INR = " + String.format("%.2f", (amount*0.017)) + " AUD");
	        break;
	        }
	        case 4: {
		    System.out.println(amount + " INR = " + String.format("%.2f", (amount*0.015)) + " CAD");
	        break;
	        }
	        default: System.out.println("Invalid Input!");
            }
	    System.out.println("---------------------------------------------");
	    System.out.println("Enter Yes to continue Exchange or No for exit");
	    choice = input.next();
	}
     while(choice.equals("Yes") || choice.equals("yes") || choice.equals("YES") || choice.equals("Y"));
    }
}
		
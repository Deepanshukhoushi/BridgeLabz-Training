package com.functionalinterface.interfaces.digitalpayment;
import java.util.Scanner;
public class PaymentApp {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();
        
        System.out.println("Enter Upi payment amount: ");
        int upiAmount = input.nextInt();
        
        System.out.println("\nEnter Card payment amount: ");
        int cardAmount = input.nextInt();
        
        System.out.println("\nEnter Wallet payment amount: ");
        int walletAmount = input.nextInt();
        
        upi.pay(upiAmount);
        wallet.pay(walletAmount);
        card.pay(cardAmount);
        
        input.close();
    }
}

package com.callcenter;
import java.util.Scanner;
public class CallCenterApp {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        CallManagement callCenter = new CallManagement();
        System.out.println("Enter number of customers: ");
        int num = input.nextInt();
        for (int i = 0; i<num; i++) {
        	System.out.println("\nEnter customer "+ (i+1) + " Id, and isVip = true else false: ");
        	String customerId = input.next();
        	boolean isVip = input.nextBoolean();
        	callCenter.receiveCall(new Customer(customerId, isVip));
        	callCenter.handleNextCall();
        }
        callCenter.showCallStatistics();
        input.close();
    }
}

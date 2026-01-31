package com.functionalinterface.markerinterface.sensitivedatatagging;
import java.util.Scanner;
public class SecurityApp {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter username and password: ");
        UserCredentials creds = new UserCredentials(input.next(), input.next());

        System.out.println("Enter Product name and price: ");
        ProductInfo product =
                new ProductInfo(input.next(), input.nextInt());

        EncryptionService.process(creds);
        EncryptionService.process(product);
        
        input.close();
    }
}


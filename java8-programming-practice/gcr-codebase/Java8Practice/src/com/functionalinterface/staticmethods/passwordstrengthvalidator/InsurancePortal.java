package com.functionalinterface.staticmethods.passwordstrengthvalidator;
import java.util.Scanner;
public class InsurancePortal {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter Your Password: ");
    
        String password = input.next();

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Password is strong");
        } else {
            System.out.println("Password is weak");
        }
        input.close();
    }
}

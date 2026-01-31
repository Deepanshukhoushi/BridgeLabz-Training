package com.functionalinterface.smartdevicecontrol;
import java.util.Scanner;
public class SmartHomeApp {
    public static void main(String[] args) {
    	Scanner input =new Scanner(System.in);
    	
        SmartDevice light = new Light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();
        
        System.out.println("Choose between options:\n"
        		+ "1. Light ON\n"
        		+ "2. AC ON\n" 
        		+ "3. TV ON\n"
        		+ "0. Exit\n");
        int choice = input.nextInt();
		    while(choice!=0) {
		    switch (choice){
		    	case 1: {
		    		light.turnOn();
		    		light.turnOff();
		    		break;
		    	}
		    	case 2: {
		    		ac.turnOn();
		    		ac.turnOff();
		    		break;
		    	}
		    	case 3: {
		    		tv.turnOn();
		    		tv.turnOff();
		    		break;
		    	}
		    	default: choice=0;
		    	
		    }choice = input.nextInt();
        }
        input.close();
    }
}

package com.browserbuddy;
import java.util.Scanner;
public class BrowserBuddyApp {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
        BrowserBuddy browser = new BrowserBuddy();
        
        browser.openNewTab();
        Tab tab = browser.getCurrentTab();
        String str;
        System.out.println("Enter URL of site: ");
        str = input.next();
        do {
        	if(str.equals("exit")) {
        		break;
        	}
        	tab.visit(str);
        	tab.back();
        	tab.forward();
        	System.out.println("Enter next URL to open or exit to close all tabs: ");
        	str = input.next();
        }
        while (!str.equals("exit"));

        browser.closeTab();
        browser.reopenTab();

        System.out.println("Current Page: " + browser.getCurrentTab().getCurrentPage());
        input.close();
    }
}
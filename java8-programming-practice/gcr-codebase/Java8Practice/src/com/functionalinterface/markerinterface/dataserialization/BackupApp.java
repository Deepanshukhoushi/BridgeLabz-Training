package com.functionalinterface.markerinterface.dataserialization;
import java.util.Scanner;
public class BackupApp {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter Username & Gmail: ");
        UserData user = new UserData(input.next(), input.next());
        
        System.out.println("Enter Sessiondata: ");
        SessionData session = new SessionData(input.next());

        BackupService.backup(user);
        BackupService.backup(session);
        
        input.close();
    }
}

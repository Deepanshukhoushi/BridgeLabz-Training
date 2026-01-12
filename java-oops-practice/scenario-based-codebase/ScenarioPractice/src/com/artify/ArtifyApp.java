package com.artify;
import java.util.Scanner;

public class ArtifyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter user name: ");
        String userName = sc.nextLine();

        System.out.print("Enter wallet balance: ");
        double balance = sc.nextDouble();
        sc.nextLine(); 

        User user = new User(userName, balance);
        
        System.out.print("Enter artwork title: ");
        String title = sc.nextLine();

        System.out.print("Enter artist name: ");
        String artist = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.println("Choose Art Type:");
        System.out.println("1. Digital Art");
        System.out.println("2. Print Art");
        int choice = sc.nextInt();

        Artwork artwork;
        
        if (choice == 1) {
            artwork = new DigitalArt(title, artist, price);
        } else {
            artwork = new PrintArt(title, artist, price);
        }

        artwork.purchase(user);
        artwork.license();

        System.out.println("Remaining Wallet Balance: " + user.getWalletBalance());

        sc.close();
    }
}

package com.sorting.insertionsort.artexpo;
import java.time.LocalTime;
import java.util.Scanner;


public class ArtExpoMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArtistRegistration artists = new ArtistRegistration();
		
		while (true) {
			System.out.println("\nEnter 1 to view all artists");
			System.out.println("Enter 2 to add an artist");
			System.out.println("Enter 3 to sort artists");
			System.out.println("Enter 4 to exit");
			
			int choice = input.nextInt();
			switch(choice) {
			case 1 : {
				artists.showArtist();
				break;
			}
			case 2: {
				System.out.println("Enter name: ");
				String name = input.nextLine();
				input.nextLine();
				System.out.println("Enter registration time: ");
				String registrationTime = input.nextLine();
				
				LocalTime time = LocalTime.parse(registrationTime);
				
				artists.addArtist(new Registration(name, time));
				break;
			}
			case 3: {
				artists.insertionSort();
				break;
			}
			case 4: {
				System.out.println("Exited");
				return;
			}	
			default:
				System.out.println("Invalid choice! ");
			}
		}
	}
}

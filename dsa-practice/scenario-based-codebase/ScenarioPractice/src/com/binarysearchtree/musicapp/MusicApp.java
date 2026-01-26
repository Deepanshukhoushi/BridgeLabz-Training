package com.binarysearchtree.musicapp;

import java.util.Scanner;

public class MusicApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SongBST library = new SongBST();
        int choice;

        do {
            System.out.println("\n--- Music Streaming App ---");
            System.out.println("1. Add New Track");
            System.out.println("2. Search Track by ID");
            System.out.println("3. Show Playlist Alphabetically");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Track ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Song Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Artist Name: ");
                    String artist = sc.nextLine();
                    library.insert(new Song(id, title, artist));
                    System.out.println("Song added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Track ID to search: ");
                    Song song = library.searchByTrackId(sc.nextInt());
                    if (song != null) {
                        System.out.println("Found → " +
                                song.getTitle() + " by " +
                                song.getArtist());
                    } else {
                        System.out.println("Song not found!");
                    }
                    break;

                case 3:
                    library.displayAlphabetically();
                    break;

                case 4:
                    System.out.println("Exiting music app...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}

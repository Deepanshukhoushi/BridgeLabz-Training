package com.sorting.quicksort.gamerzone;

import java.util.ArrayList;
import java.util.Scanner;

public class GameZoneMain {
	public static void main(String[] args) {
		ArrayList<Player> players = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter no. of players: ");
		int n = input.nextInt();
		
		for (int i = 0; i<n; i++) {
			System.out.println("Enter " + (i+1) + " player name: ");
			String name = input.next();
			
			System.out.println("Enter Score of Player " + (i+1) + " : ");
			int score = input.nextInt();
			System.out.println(" ");
			
			players.add(new Player(name, score));
		}
		

		SortScores.sortPlayerScores(players, 0, players.size()-1);
		SortScores.displayResult(players);
		input.close();
	}
}

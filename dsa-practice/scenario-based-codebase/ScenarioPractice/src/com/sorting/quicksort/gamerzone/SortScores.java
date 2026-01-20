package com.sorting.quicksort.gamerzone;

import java.util.ArrayList;

public class SortScores {
	public static void sortPlayerScores(ArrayList<Player> players, int low, int high) {
		if (low<high) {
			int pi = partition(players, low, high);
			
			sortPlayerScores(players, low, pi-1);
			sortPlayerScores(players, pi+1, high);
		}
	}
	
	private static int partition(ArrayList<Player> players, int low, int high) {
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (players.get(j).getScore() > players.get(high).getScore()) {
                i++;
                Player player = players.get(i);
                players.set(i, players.get(j));
                players.set(j, player);                
            }
        }
        i++;

        Player player = players.get(i);
        players.set(i, players.get(high));
        players.set(high,player);

        return i;
    }
	

	public static void displayResult(ArrayList<Player> players) {
		System.out.println("Player sorted by Scores: ");
		for(Player player : players) {
			System.out.println(player);
		}
	}
}

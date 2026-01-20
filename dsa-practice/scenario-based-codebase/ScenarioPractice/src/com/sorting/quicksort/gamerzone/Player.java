package com.sorting.quicksort.gamerzone;

public class Player {
	private String name;
	private int score;
	
	public Player(String name, int score) {
		this.name = name;
		this.score = score;
	
	}
	
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	@Override
	public String toString() {
		return "Player name: " + name + ", Score: " + score;
	}
}
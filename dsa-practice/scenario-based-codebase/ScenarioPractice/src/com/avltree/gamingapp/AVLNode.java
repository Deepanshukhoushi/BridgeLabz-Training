package com.avltree.gamingapp;

public class AVLNode {
	Player player;
	AVLNode left, right;
	int height;
	
	public AVLNode(Player player, AVLNode left, AVLNode right, int height) {
		this.player = player;
		this.left = left;
		this.right = right;
		this.height = height;
	}
}

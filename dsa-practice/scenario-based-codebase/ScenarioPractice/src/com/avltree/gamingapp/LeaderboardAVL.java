package com.avltree.gamingapp;

public class LeaderboardAVL {
	private AVLNode root;
	
	private int height(AVLNode n) {
		return n == null ? 0 : n.height;
	}
	
	private int getBalance(AVLNode n) {
		return n == null ? 0 : height(n.left) - height(n.right);
	}
	
	private AVLNode rightRotate(AVLNode y) {
		AVLNode x= y.left;
		AVLNode T2 = x.right;
		
		x.right = y;
		y.left = T2;
		
		y.height = Math.max(height(y.left), height(y.right)) + 1;
		x.height = Math.max(height(x.left), height(x.right)) + 1;
		
		return x;
	}
	
	private AVLNode leftRotate(AVLNode x) {
		AVLNode y = x.right;
		AVLNode T2 = y.left;
		
		y.left = x;
		x.right = T2;
		
		x.height = Math.max(height(x.left), height(x.right)) + 1;
		y.height = Math.max(height(y.left), height(y.right)) + 1;
		
		return y;
	}
	
	public void insert(Player p) {
		root = insertRec(root, p);
	}
	
	private AVLNode insertRec(AVLNode node, Player p) {
        if (node == null) return new AVLNode(p, node, node, 0);

        if (p.score < node.player.score)
            node.left = insertRec(node.left, p);
        else
            node.right = insertRec(node.right, p);

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        if (balance > 1 && p.score < node.left.player.score)
            return rightRotate(node);

        if (balance < -1 && p.score > node.right.player.score)
            return leftRotate(node);

        if (balance > 1 && p.score > node.left.player.score) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && p.score < node.right.player.score) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void remove(int score) {
        root = deleteRec(root, score);
    }

    private AVLNode deleteRec(AVLNode root, int score) {
        if (root == null) return null;

        if (score < root.player.score)
            root.left = deleteRec(root.left, score);
        else if (score > root.player.score)
            root.right = deleteRec(root.right, score);
        else {
            if (root.left == null || root.right == null) {
                root = (root.left != null) ? root.left : root.right;
            } else {
                AVLNode temp = minValueNode(root.right);
                root.player = temp.player;
                root.right = deleteRec(root.right, temp.player.score);
            }
        }

        if (root == null) return null;

        root.height = Math.max(height(root.left), height(root.right)) + 1;
        int balance = getBalance(root);

        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    private AVLNode minValueNode(AVLNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    public void displayTopPlayers(int limit) {
        System.out.println("Top Players:");
        displayDesc(root, new int[]{0}, limit);
    }

    private void displayDesc(AVLNode node, int[] count, int limit) {
        if (node == null || count[0] >= limit) return;

        displayDesc(node.right, count, limit);

        if (count[0] < limit) {
            System.out.println(node.player.name +
                    " | Score: " + node.player.score);
            count[0]++;
        }

        displayDesc(node.left, count, limit);
    }
}
	

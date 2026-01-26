package com.avltree.ticketbookingsystem;

public class EventAVLTree {
    private AVLNode root;

    private int height(AVLNode n) {
        return (n == null) ? 0 : n.height;
    }

    private int getBalance(AVLNode n) {
        return (n == null) ? 0 : height(n.left) - height(n.right);
    }

    private AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
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

    public void insert(Event event) {
        root = insertRec(root, event);
    }

    private AVLNode insertRec(AVLNode node, Event event) {
        if (node == null) return new AVLNode(event);

        if (event.time < node.event.time)
            node.left = insertRec(node.left, event);
        else
            node.right = insertRec(node.right, event);

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // Rotations
        if (balance > 1 && event.time < node.left.event.time)
            return rightRotate(node);

        if (balance < -1 && event.time > node.right.event.time)
            return leftRotate(node);

        if (balance > 1 && event.time > node.left.event.time) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && event.time < node.right.event.time) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void delete(int time) {
        root = deleteRec(root, time);
    }

    private AVLNode deleteRec(AVLNode root, int time) {
        if (root == null) return null;

        if (time < root.event.time)
            root.left = deleteRec(root.left, time);
        else if (time > root.event.time)
            root.right = deleteRec(root.right, time);
        else {
            if (root.left == null || root.right == null) {
                root = (root.left != null) ? root.left : root.right;
            } else {
                AVLNode temp = minValueNode(root.right);
                root.event = temp.event;
                root.right = deleteRec(root.right, temp.event.time);
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

    public void displayUpcomingEvents() {
        System.out.println("Upcoming Events (Sorted by Time):");
        inorder(root);
    }

    private void inorder(AVLNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.println("Time: " + node.event.time +
                    " | Event: " + node.event.name +
                    " | Venue: " + node.event.venue);
            inorder(node.right);
        }
    }
}

package Day_3.HackerRank_Problems;

import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree {

    Node root;

    // Insert into BST
    Node insert(Node root, int data) {

        if (root == null) {
            return new Node(data);
        }

        if (data <= root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Postorder Traversal
    void postOrder(Node root) {

        if (root == null) {
            return;
        }

        postOrder(root.left);

        postOrder(root.right);

        System.out.print(root.data + " ");
    }
}

public class PostOrderTraversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BinaryTree tree = new BinaryTree();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            tree.root = tree.insert(tree.root, sc.nextInt());
        }

        System.out.println("Postorder Traversal:");

        tree.postOrder(tree.root);

        sc.close();
    }
}
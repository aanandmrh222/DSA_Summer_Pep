package AK_07_Trees;

import java.util.*;

public class AK_08_PreOder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // Pre-order traversal: Root -> Left -> Right
    public static void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Post-order traversal: Left -> Right -> Root
    public static void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    // In-order traversal: Left -> Root -> Right
    public static void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    // Level-order traversal: Breadth-first traversal using a queue
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null); // Marker for end of level

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            queue.poll();
            if (temp != null) {
                System.out.print(temp.data + " ");

                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            } else if (!queue.isEmpty()) {
                queue.add(null); // Add marker for next level
            }

        }
    }

    public static int countNodes(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + countNodes(node.left) + countNodes(node.right);
        }
    }

    // count leaf nodes
    public static int countLeafNodes(Node node) {
        if (node == null) {
            return 0;
        } else if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

    // height of the tree -> longest path from the root to leaf
    public static int height(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // sum of all nodes
    public static int sumOfNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return node.data + sumOfNodes(node.left) + sumOfNodes(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Pre-order traversal of the tree:");
        preOrder(root);

        System.out.println("\nPost-order traversal of the tree:");
        postOrder(root);

        System.out.println("\nIn-order traversal of the tree:");
        inOrder(root);

        System.out.println("\nLevel-order traversal of the tree:");
        levelOrder(root);

        System.out.println("\nTotal number of nodes in the tree: " + countNodes(root));
        System.out.println("Total number of leaf nodes in the tree: " + countLeafNodes(root));

        System.out.println("Height of the tree: " + height(root));
        System.out.println("Sum of all nodes in the tree: " + sumOfNodes(root));
    }
}

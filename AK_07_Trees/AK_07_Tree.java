package AK_07_Trees;
public class AK_07_Tree {
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
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println("Root Node: " + root.data);
        System.out.println("Left Child of Root: " + root.left.data);
        System.out.println("Right Child of Root: " + root.right.data);

    }

}
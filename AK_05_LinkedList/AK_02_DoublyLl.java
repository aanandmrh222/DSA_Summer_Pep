package AK_05_LinkedList;

public class AK_02_DoublyLl {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null) {
            head = newNode;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void deleteFromEnd() {
        if(head == null) return;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    public static void main(String[] args) {
        AK_02_DoublyLl ll = new AK_02_DoublyLl();

        ll.insertAtEnd(1);
        ll.insertAtEnd(2);


    }
}

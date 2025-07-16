package AK_05_LinkedList;

public class AK_03_CircularLl {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            newNode.next = newNode;
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        newNode.next = head;
        temp.next = newNode;
    }

    public void insertAtBeg(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            newNode.next = newNode;
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);
        Node temp = head;

        for (int i=0; i<pos-1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void printList() {

    }
    public static void main(String[] args) {

    }
}


// deletion from end and start from the circular linked list
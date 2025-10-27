package com.Rijul.day58;

public class DeletionOfFirstElement {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        // insert at end for testing
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void deleteAt(int idx) {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }

            if (idx < 0 || idx >= size()) {
                System.out.println("Invalid index!");
                return;
            }

            if (idx == 0) {
                head = head.next;
                if (head == null) tail = null; // if list becomes empty
                return;
            }

            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }

            // deleting last element
            if (temp.next == tail) {
                tail = temp;
                tail.next = null;
            } else {
                temp.next = temp.next.next;
            }
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);

        System.out.println("Original list:");
        ll.display();

        ll.deleteAt(0);
        System.out.println("After deleting index 0:");
        ll.display();

        ll.deleteAt(2);
        System.out.println("After deleting index 2:");
        ll.display();

        ll.deleteAt(5);
    }
}
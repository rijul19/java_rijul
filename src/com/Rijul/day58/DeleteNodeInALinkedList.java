package com.Rijul.day58;

public class DeleteNodeInALinkedList {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void add(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        void deletionOfNode(Node node) {
            if (node == null || node.next == null) {
                System.out.println("Cannot delete this node (it may be the last node or null).");
                return;
            }
            node.val = node.next.val;
            node.next = node.next.next;
        }

        void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);

        System.out.println("Original list:");
        ll.printList();

        Node nodeToDelete = ll.head.next.next;
        ll.deletionOfNode(nodeToDelete);

        System.out.println("List after deleting node 3:");
        ll.printList();
    }
}
package com.Rijul.day57;

class SingleLinkedList {
    private Node head;
    private int size;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
    public void addLast(int data){
        Node node = new Node(data);

        if (head == null){
            head = node;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
    }
    public void insertAtPosition(int data, int position){
        if (position <= 0 || position > size + 1) {
            System.out.println("Invalid position!");
            return;
        }
            Node newNode = new Node(data);
            if(position == 1){
                newNode.next = head;
                head = newNode;
                return;
            }
            Node current = head;
            for(int i=1; i < position - 1 && current != null; i++){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    public void display(){
        if (head == null){
            System.out.println("List is empty!");
            return;
        }
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public int size(){
        return size;
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        list.addFirst(56);
        list.addFirst(70);
        list.addFirst(90);

        System.out.println("initial list:");
        list.display();

        list.insertAtPosition(54,2);
        System.out.println("after inserting 54 at position2:");

        list.addLast(100);
        System.out.println("after adding 100 at the end:");
        list.display();

        System.out.println("size of the list:" + list.size());
    }
    }


package org.example;

class Node {
    int data;
    Node next, prev;

    public Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

class Main {
    public static Node push(Node head, int key) {
        Node node = new Node(key);
        node.next = head;

        if (head != null) {
            head.prev = node;
        }

        head = node;
        return head;
    }

    public static void printDDL(String msg, Node head) {
        System.out.print(msg);
        while (head != null) {
            System.out.printf("%d —> ", head.data);
            head = head.next;
        }

        System.out.println("null");
    }

    public static void swap(Node node) {
        Node prev = node.prev;
        node.prev = node.next;
        node.next = prev;
    }

    public static Node reverse(Node head, Node curr) {
        if (curr.next == null) {
            swap(curr);

            head = curr;
            return head;
        }

        swap(curr);

        head = reverse(head, curr.prev);
        return head;
    }

    public static Node reverseDDL(Node head) {
        if (head == null) {
            return head;
        }

        Node curr = head;

        head = reverse(head, curr);
        return head;
    }

    public static void main(String[] args) {
        int[] keys = {1, 2, 3, 4, 5};

        Node head = null;
        for (int key : keys) {
            head = push(head, key);
        }

        printDDL("Оригинальный лист: ", head);
        head = reverseDDL(head);
        printDDL("Перевернутый лист: ", head);
    }
}
package com.java.grokking.twoPointer;

public class RemoveNthNodeFromLast {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(1);
//        head.next = new LinkedListNode(2);
//        head.next.next = new LinkedListNode(3);
//        head.next.next.next = new LinkedListNode(4);
//        head.next.next.next.next = new LinkedListNode(5);

        int n = 1;
        LinkedListNode resNode = RemoveNthNodeFromLast.removeNthNode(head, n);
        printAllNodes(resNode);

    }

    private static void printAllNodes(LinkedListNode resNode) {
        while(resNode != null) {
            System.out.println(resNode.data);
            resNode = resNode.next;
        }
    }

    public static LinkedListNode removeNthNode(LinkedListNode node, int n) {
        LinkedListNode resNode = node;
        LinkedListNode left = node, right = node;
        if(node == null || n < 1) {
            return node;
        }
        int i=0;

        // Move the right node by n elements to the right
        while(i < n) {
            left = left.next;
            i++;
        }

        if(left == null) {
            resNode = right.next;
            return resNode;
        }

        // Move left and right until right.next is null
        while(left.next != null) {
            left = left.next;
            right = right.next;
        }

        right.next = right.next.next;

        return resNode;
    }

    static class LinkedListNode {
        public int data;
        public LinkedListNode next;
        // Constructor will be used to make a LinkedListNode type object
        public LinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}

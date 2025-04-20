package bai3;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node fast = head;
        Node slow = head;


        for (int i = 0; i < k; i++) {
            if (fast == null){
                return -1;
            }
            fast = fast.next;
        }


        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow != null ? slow.data : -1;
    }
}
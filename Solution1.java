package bai3;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

class Solution1 {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node temp = head;
        Node temp1 = head;

        
        for (int i = 0; i < k; i++) {
            if (temp == null){ 
            return -1;
            }
            temp = temp.next;
        }

        
        while (temp != null) {
            temp = temp.next;
            temp1 = temp1.next;
        }

        return temp1 != null ? temp1.data : -1;
    }
}

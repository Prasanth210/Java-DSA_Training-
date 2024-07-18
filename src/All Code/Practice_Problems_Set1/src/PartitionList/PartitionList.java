package PartitionList;

import java.util.*;

public class PartitionList {
        public static Node partition(Node head, int x) {
            Queue<Integer> queue1 = new LinkedList<>();
            Queue<Integer> queue2 = new LinkedList<>();

            Node temp = head;

            while(temp != null){
                if(temp.data < x){
                    queue1.add(temp.data);
                }else{
                    queue2.add(temp.data);
                }

                temp = temp.next;
            }

            temp = head;
            Node dummy = new Node(0);
            Node curr = dummy;

            while(!queue1.isEmpty()){
                curr.next = new Node(queue1.remove());
                curr = curr.next;

            }

            while(!queue2.isEmpty()){
                curr.next = new Node(queue2.remove());
                curr = curr.next;
            }

            return dummy.next;
        }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

        public static void main(String[] args) {
        int x = 3;
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);
        Node ans = partition(head,x);
        printLinkedList(ans);


    }
}


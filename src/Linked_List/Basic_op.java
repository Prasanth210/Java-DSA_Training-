package Linked_List;

import java.util.LinkedList;

public class Basic_op {
    public static void main(String[] args) {

        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        traverse(head);
        head = reverse(head);
        traverse(head);

    }
    static void traverse(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    static Node reverse(Node head){
        Node curr=head,pre=null,next;

        while(curr !=null){
            next = curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }
}

package Oops;

import java.util.*;
    public class PalindromList {
        public static class Node {
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }

        }
        public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.print("Linked List: ");
        PrintLinkedlist(head);

        if (ispalindrom(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
            }
        }

        public static boolean ispalindrom(Node head){
            Stack <Integer>st= new Stack<>();
            Node temp=head;
            while(temp!=null){
                st.push(temp.data);
                temp=temp.next;
            }
            temp=head;
            while(temp!= null){
               if(temp.data!=st.pop()){
                   return false;
               }
               temp=temp.next;

            }
            return true;

       }
       public static void PrintLinkedlist(Node head){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
           System.out.println();
       }

    }

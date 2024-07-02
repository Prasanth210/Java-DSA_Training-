package Collection;

import java.util.Stack;

public class List_implement {
    public static  class Node {
        int data;
        Node next;
    }

    public Node head;
    public Node tail;
    public int size;

    public void addLast(int item) {
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        if (this.size >= 1) {
            this.tail.next = nn;
        }
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.tail = nn;
            this.size++;
        }
    }

    public void addFirst(int item) {
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        if (this.size >= 1) {
            nn.next = this.head;
        }
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.head = nn;
            this.size++;
        }
    }

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public int getfirst() throws Exception {
        if (this.size == 0) {
            throw new Exception("List is Empty");
        }
        return head.data;
    }

    public int getlast() throws Exception {
        if (this.size == 0) {
            throw new Exception("List is Empty");
        }
        return tail.data;
    }

    public Node getNodeAt(int idx) throws Exception {
        if (this.size == 0)
            throw new Exception("List is Empty");
        if (idx < 0 || idx > this.size)
            throw new Exception("Invalid index");
        Node temp = this.head;

        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int getAt(int idx) throws Exception {
        if (this.size == 0)
            throw new Exception("List is Empty");
        if (idx < 0 || idx > this.size)
            throw new Exception("Invalid index");
        Node temp = this.head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }

        return temp.data;
    }

    public void removefirst() throws Exception {
        if (this.size == 0) {
            throw new Exception("List is Empty");
        }
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size = 0;
        } else {
            this.head = this.head.next;
            this.size--;
        }
    }

    public void removelast() throws Exception {
        if (this.size == 0) {
            throw new Exception("List is Empty");
        }
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }
        Node sizem2 = getNodeAt(this.size - 1);
        this.tail = sizem2;
        this.tail.next = null;
        this.size--;
    }

    public void removeAt(int idx) throws Exception {
        if (this.size == 0) {
            throw new Exception("List is Empty");
        }
        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }
        Node nm1 = getNodeAt(idx - 1);
        Node np1 = getNodeAt(idx + 1);
        nm1.next = np1;
        this.size--;
    }

    public void reverseList() {
        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            temp.data = stack.pop();
            temp = temp.next;
        }


    }
}

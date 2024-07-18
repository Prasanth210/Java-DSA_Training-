package MergeTwoLists;

public class MergeTwoLists {
    public static Node mergeTwoLists(Node list1, Node list2) {
        Node returnNode = new Node(0);
        Node headNode = returnNode;

        while(list1 != null && list2 != null){

            if(list1.data < list2.data){
                returnNode.next = list1;
                list1 = list1.next;
            }else{
                returnNode.next = list2;
                list2 = list2.next;
            }
            returnNode = returnNode.next;
        }

        if(list1 == null){
            returnNode.next = list2;
        }

        else if(list2 == null){
            returnNode.next = list1;
        }
        return headNode.next;
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
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(4);

        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(5);

        Node ans = mergeTwoLists(head1,head2);
        printLinkedList(ans);



    }
}

public class Linked_list {
    public static void main(String[] args) throws Exception {
        List_implement ll=new List_implement();
        ll.addLast(10);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.addLast(70);
        ll.addLast(80);
        ll.display();

        System.out.println("\n"+"First Element: "+ll.getfirst());
        System.out.println("Last Element: "+ll.getlast());

        System.out.println("\nGet value At index=1: "+ll.getAt(1));
        System.out.println( "\nNode Address"+ll.getNodeAt(2));

        ll.removefirst();
        System.out.println("\nAfter removing First");
        ll.display();

        ll.removelast();
        System.out.println("\nAfter removing Last");
        ll.display();

        ll.removeAt(2);
        System.out.println("\nAfter remove At");
        ll.display();

        ll.reverseList();
        System.out.println("\nAfter reverseing the List");
        ll.display();
    }
}

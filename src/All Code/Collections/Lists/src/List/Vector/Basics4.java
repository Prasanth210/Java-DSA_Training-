package List.Vector;
import java.util.Iterator;
import java.util.Vector;
/*
Access Vector Elements
get(index) - returns an element specified by the index
iterator() - returns an iterator object to sequentially access vector elements

 */

public class Basics4 {
    public static void main(String[] args) {
            Vector<String> animals= new Vector<>();
            animals.add("Dog");
            animals.add("Horse");
            animals.add("Cat");

            // Using get()
            String element = animals.get(2);
            System.out.println("Element at index 2: " + element);

            // Using iterator()
            Iterator<String> iterate = animals.iterator();
            System.out.print("Vector: ");
            while(iterate.hasNext()) {
                System.out.print(iterate.next());
                System.out.print(", ");
            }
        }
    }

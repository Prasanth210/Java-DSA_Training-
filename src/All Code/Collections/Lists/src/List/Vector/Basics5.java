package List.Vector;
import java.util.Vector;

/*
Remove Vector Elements
remove(index) - removes an element from specified position
removeAll() - removes all the elements
clear() - removes all elements. It is more efficient than removeAll()
 */
public class Basics5 {
        public static void main(String[] args) {
            Vector<String> animals= new Vector<>();
            animals.add("Dog");
            animals.add("Horse");
            animals.add("Cat");

            System.out.println("Initial Vector: " + animals);

            // Using remove()
            String element = animals.remove(1);
            System.out.println("Removed Element: " + element);
            System.out.println("New Vector: " + animals);

            // Using clear()
            animals.clear();
            System.out.println("Vector after clear(): " + animals);
        }
    }

    /*
set()	changes an element of the vector
size()	returns the size of the vector
toArray()	converts the vector into an array
toString()	converts the vector into a String
contains()	searches the vector for specified element and returns a boolean result

 */
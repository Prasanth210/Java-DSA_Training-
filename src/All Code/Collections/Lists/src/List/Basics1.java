//Implementing the ArrayList Class
package List;
import java.util.List;
import java.util.ArrayList;
public class Basics1 {

        public static void main(String[] args) {
            // Creating list using the ArrayList class
            List<Integer> numbers = new ArrayList<>();

            // Add elements to the list
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            System.out.println("List: " + numbers);

            // Access element from the list
            int number = numbers.get(2);
            System.out.println("Accessed Element: " + number);

            // Remove element from the list
            int removedNumber = numbers.remove(1);
            System.out.println("Removed Element: " + removedNumber);
        }
    }

/*
size()	Returns the length of the arraylist.
sort()	Sort the arraylist elements.
clone()	Creates a new arraylist with the same element, size,
                                        and capacity.
contains()	Searches the arraylist for the specified element
                         and returns a boolean result.
ensureCapacity()	Specifies the total element the arraylist
                                can contain.
isEmpty()	Checks if the arraylist is empty.
indexOf()	Searches a specified element in an arraylist
        and returns the index of the element.
 */
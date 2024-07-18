package List.Vector;
// Java Vector
//The Vector class is an implementation
// of the List interface that allows
// us to create resizable-arrays similar
// to the ArrayList class.

import java.util.Vector;

public class Basics3 {
    public static void main(String[] args) {
        Vector<String> mammals= new Vector<>();
        // Using the add() method
        mammals.add("Dog");
        mammals.add("Horse");

        // Using index number
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);

        // Using addAll()
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);
    }
}



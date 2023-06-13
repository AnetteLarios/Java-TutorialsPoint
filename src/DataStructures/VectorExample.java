package DataStructures;
import java.util.*;
import java.util.Vector;
/*
This program is  a simple example of how to use a vector in java

@author Anette Larios
@since 13.06.2023
@version 1.8.0
 */
public class VectorExample {

    public static void main (String []args){
        //Declarating a vector object called vector
        Vector vector = new Vector(3,2);
        //Printing the initial size of the vector(amount of elements)
        System.out.println("Initial size: " + vector.size());
        //Printing the initial capacity of the vector
        System.out.println("Initial capacity: " + vector.capacity());

        //Adding elements to the vector
        vector.addElement(new Integer(1));
        vector.addElement(new Integer(2));
        vector.addElement(new Integer(3));
        vector.addElement(new Integer(4));
        //Printing capacity of the vector
        System.out.println("Capacity after four additions: " + vector.capacity());
        //Adding element to the vector
        vector.addElement(new Double(5.45));
        //Printing capacity of the vector
        System.out.println("Current capacity: " + vector.capacity());

        //Adding elements to the vector
        vector.addElement(new Double(6.08));
        vector.addElement(new Integer(7));
        //Printing capacity of the vector
        System.out.println("Current capacity: " + vector.capacity());

        //Adding elements to the vector
        vector.addElement(new Float(9.4));
        vector.addElement(new Integer(10));
        //Printing capacity of the vector
        System.out.println("Current capacity: " + vector.capacity());

        //Adding elements to the vector
        vector.addElement(new Integer(11));
        vector.addElement(new Integer(12));
        //Printing first and last elements of the vector
        System.out.println("First element: " + (Integer)vector.firstElement());
        System.out.println("Last element: " + (Integer)vector.lastElement());

        //Adding elements to the vector
        vector.addElement(new Integer(11));
        vector.addElement(new Integer(12));
        //Printing first and last elements of the vector
        System.out.println("First element: " + (Integer)vector.firstElement());
        System.out.println("Last elenment: " + (Integer)vector.lastElement());

        //Verifying if the vector contains number 3
        if(vector.contains(new Integer(3)))
            System.out.println("Vector contains 3.");

        //Creating a enumeration object called 'vectorEnum' and assigning vector values.
        Enumeration vectorEnum = vector.elements();
        System.out.println("Elements in vector:");

        //while vector still has elements, prints the next element.
        while(vectorEnum.hasMoreElements())
            System.out.print(vectorEnum.nextElement() + " ");
        System.out.println();
    }
}

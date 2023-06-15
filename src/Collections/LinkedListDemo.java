package Collections;
import java.util.*;

/*
This is a simple program example of how linked list works. Adding elements, modifying them and deleting some of them.
@author Anette Larios
@since 15.06.2023
@version 1.8.0
 */
public class LinkedListDemo {

    public static void main (String []args){
        //creating a linked list
        LinkedList linkedList = new LinkedList();

        //adding elements to the linked list
        linkedList.add("France");
        linkedList.add("Brazil");
        linkedList.add("Denmark");
        linkedList.add("Egypt");
        linkedList.add("Canada");
        linkedList.addLast("Zambia");
        linkedList.add("Argentina");
        linkedList.add(1, "Australia");
        System.out.println("original content of the linked list: " + linkedList);

        /*
        remove elements from the linked list
        rememmber that the elements are sorted from 0. France had position 0 and it was removed, now Australia is in
        position 0 and and Denmark is in position 2, so the country that is removed next is Denmark
        */
        linkedList.remove("France");
        linkedList.remove(2);
        System.out.println("content of the linked list after the deletion: " +linkedList);

        /*
        remove first and last elements
        The first element now is Australia and the last is Argentina, both countries are removed
        */
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Linked list after the second deletion: " +linkedList);

        /*
        get and set value
        creating an object called 'val' that will store the second element in the list, that now is Canada
        */
        Object val = linkedList.get(2);
        /*
        Setting a new value to the second element in the list, putting the string stored in val and adding the string }
        'Changed'
        */
        linkedList.set(2,(String) val +  "Changed");
        //Printing the list again after changing the second element that now says 'CanadaChanged'
        System.out.println("Linked list after change: " + linkedList);

    }
}

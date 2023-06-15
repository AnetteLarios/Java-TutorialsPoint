package Collections;
import java.util.*;
/*
This is a simple program of a LinkedHashSet, creating the object and adding elements
@author Anette Larios
@since 15.06.2023
@version 1.8.0
 */
public class LinkedHashSetDemo {

    public static void main (String []args){
        //Creating a hashset
        LinkedHashSet hashSet = new LinkedHashSet();

        //adding elements to the hash set
        hashSet.add("Bubbles");
        hashSet.add("Airplane");
        hashSet.add("Diamond");
        hashSet.add("Elephant");
        hashSet.add("Colors");
        hashSet.add("Figure");
        System.out.println(hashSet);
    }
}

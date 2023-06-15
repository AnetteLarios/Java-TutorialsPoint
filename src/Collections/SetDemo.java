package Collections;

import java.util.HashSet;

import java.util.Set;

import java.util.TreeSet;

/*
This is a program example of Sets.

@author Anette Larios
@since 15.06.2023
 */


public class SetDemo {

    public static void main(String[] args) {
        //creating an array of integers called 'count' and initializing elements
        int count[] = {34, 22, 10, 60, 30, 22};
        //Creating a set of integers called 'set'
        Set<Integer> set = new HashSet<Integer>();
        try {
            //from position 0 - 5 of the array, the elements will be stored into the set
            for (int i = 0; i < 5; i++) {
                set.add(count[i]);
            }
            //Printing elements within the set
            System.out.println(set);
            //Creating a TreeSet called 'sortedSet' that receives the set.
            TreeSet sortedSet = new TreeSet<Integer>(set);
            //TreeSet sorts the elements that receives, printing the sorted elements
            System.out.println("The sorted list is:");
            System.out.println(sortedSet);
            //Printing the firs element of the sortedSet
            System.out.println("The First element of the set is: " + (Integer) sortedSet.first());
            //Printing the last element of the sortedSet
            System.out.println("The last element of the set is: " + (Integer) sortedSet.last());
        }
        catch (Exception e) {
        }
    }
}

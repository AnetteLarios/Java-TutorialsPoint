package Collections;

import java.util.ArrayList;

/*
This is a simple example of how Array List works, adding elements, removing elements, and displaying them.
@author Anette Larios
@since 15.06.2023
@version 1.8.0
*/
public class ArrayListDemo {

    public static void main (String []args){
        //Creating an array list
        ArrayList arrayList = new ArrayList();
        System.out.println("Initial size of the array list: " + arrayList.size());

        //adding elements to the array list
        arrayList.add("Cyan");
        arrayList.add("Azure");
        arrayList.add("Emerald");
        arrayList.add("Black");
        arrayList.add("Diamond");
        arrayList.add("Fuchsia");
        /*
        Remember that the positions of the arrayList begins at 0. So in the position 1, between Cyan and Azure,
        Aquamarine will be added.
         */
        arrayList.add(1, "Aquamarine");
        System.out.println("Size of the array List after additions: " + arrayList.size());

        //displaying the array list
        System.out.println("Contents of array list: " + arrayList);

        //Remove elements from the array list
        arrayList.remove("Fuchsia");
        /*
        Because of the deletion made before, now Azure is in position 2, this is the element that it is going  to be
        deleted
        */
        arrayList.remove(2);
        System.out.println("Size of array list after deletions: " + arrayList.size());
        System.out.println("Array list after deletions: " + arrayList);



    }
}

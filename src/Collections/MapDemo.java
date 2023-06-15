package Collections;
import java.util.*;
public class MapDemo {
/*
This is a simple example of how to create a map and store elements in it.
@author Anette Larios
@since 15.06.2023
@version 1.8.0
 */
    public static void main(String []args){
        //Creating a map object called 'map'
        Map map = new HashMap();
        //Putting elements within the map, key and value
        map.put("Jessica", "8");
        map.put("James", "31");
        map.put("Liam", "12");
        map.put("Danielle", "14");
        //printing a break line
        System.out.println();
        //Printing a message and the elements stored in the map
        System.out.println("Map elements");
        System.out.println("\t" + map);
    }
}

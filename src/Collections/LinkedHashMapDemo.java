package Collections;
import java.util.*;
public class LinkedHashMapDemo {
/*
This is a simple program that shows how to do a LinkedHashMap
@author Anette Larios
@since 15.06.2023
@version 1.8.0
 */
    public static void main(String[]args){
        //Creating a hash map
        LinkedHashMap linkedHashMap = new LinkedHashMap();

        //Inserting elements in the map
        linkedHashMap.put("Zara", new Double(3456.34));
        linkedHashMap.put("Martin", new Double(156.15));
        linkedHashMap.put("Arthur", new Double (1567.45));
        linkedHashMap.put("Damian", new Double(145.21));
        linkedHashMap.put("Emma", new Double(1478592.56));

        //get a set of the entries
        Set set = linkedHashMap.entrySet();
        //Get an iterator
        Iterator iterator = set.iterator();

        //Display elements
        while(iterator.hasNext()){
            Map.Entry mapEntry = (Map.Entry)iterator.next();
            System.out.println(mapEntry.getKey() + ": ");
            System.out.println(mapEntry.getValue());
        }
        System.out.println();
        //Deposit 1000 into Emma's account
        //Obtains first Emma's balance and then adds 1000
        double balance = ((Double)linkedHashMap.get("Emma")).doubleValue();
        linkedHashMap.put("Emma", new Double(balance + 1000));
        //Prints Emma's new balance
        System.out.println("Emma's new balance: " + linkedHashMap.get("Emma"));
    }
}

package DataStructures;
import java.util.*;
/*
This is a program example of how HashTables works in java.
@author Anette Larios
@since 14.06.2023 (last update: 15.06.2023)
@version 1.8.0
 */
public class HashTable {
    public static void main(String args[]){
        //Creating a hashtable called 'balance'
        Hashtable balance = new Hashtable();
        //Creating an enumarion object called 'names'
        Enumeration names;
        //Creating a string called 'str'
        String str;
        //Creating a double called 'bal'
        double bal;

        /*
        Storing objects inside the hash table. Every object need a key and a value. In this case
        The names are the keys and the numbers are the values.
        */
        balance.put("Pedro", new Double(3434.34));
        balance.put("Verónica", new Double(123.22));
        balance.put("Daisy", new Double(1378.00));
        balance.put("Jason", new Double(99.22));
        balance.put("Chris", new Double(78.95));

        //Assigning to enumarion object the keys of the hash table
        names = balance.keys();
        //while theres more names in the enumeration object
        while(names.hasMoreElements()){
            //the string that was created before will store all keys
            str = (String)  names.nextElement();
            //Then the programs prints each name and with balance.get(str), sends the key to the hash table
            //Sending the key through .get, will return the value assigned to that key
            System.out.println(str + ": " + balance.get(str));
        }
        //Printing a breakline
        System.out.println();
        //The double variable called 'bal' will store the value associated to the key 'Pedro'
        bal = ((Double)balance.get("Pedro")).doubleValue();
        //Assigning a new value related to the key 'Pedro'
        balance.put("Pedro", new Double (bal +1000));
        //Printing the new value assigned to 'Pedro' key.
        System.out.println("Pedro's new balance: " + balance.get("Pedro"));
    }
}

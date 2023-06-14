package DataStructures;
import java.util.*;

public class HashTable {
    public static void main(String args[]){
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;

        balance.put("Pedro", new Double(3434.34));
        balance.put("Verónica", new Double(123.22));
        balance.put("Daisy", new Double(1378.00));
        balance.put("Jason", new Double(99.22));
        balance.put("Chris", new Double(78.95));

        names = balance.keys();

        while(names.hasMoreElements()){
            str = (String)  names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        bal = ((Double)balance.get("Pedro")).doubleValue();
        balance.put("Zara", new Double (bal +1000));
        System.out.println("Pedro's new balance: " + balance.get("Zara"));
    }
}

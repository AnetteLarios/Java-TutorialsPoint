package DataStructures;
import java.util.Vector;//Necessary to use a Vector data structure
import java.util.Enumeration; //Similar to an interface, it is necessary to use Enumeration.
/*
This is a program example of how to use Enumeration in a vector.
@author Anette Larios
@since 13.06.2023
@version 1.8.0
 */
public class EnumerationExample {

    public static void main(String []args){
        //Creating a enumeration object called days.
        Enumeration days;
        //Creating a Vector objecto called dayNames.
        Vector dayNames = new Vector();
        /*
        Adding elements to the vector
         */
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");

        //days object will store and enumerate dayNames elements
        days = dayNames.elements();
        //while there's elements in days, the program will print them
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}

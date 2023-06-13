package DataStructures;
import java.util.BitSet;
public class BitSetExample {
/*
This program shows the functionality of a BitSet in java.

@author Anette Larios
@since 13.06.2023
@version 1.8.0
 */

    public static void main(String[] args) {
        //Declaring two arrays of bits, with 16 elements.
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);
        //Iterating from 0 to 16
        for (int i = 0; i < 16; i++) {
            //If the residue of the elements divided by 2 is 0, add them to bits1.
            if ((i % 2) == 0) bits1.set(i);
            //If the residue of the elements divided by 5 is diferent of 0, add them to bits2.
            if ((i % 5) != 0) bits2.set(i);
        }
        /*
        Priting the elements of each array
         */
        System.out.println("Initial pattern in bits1: ");
        System.out.println(bits1);
        System.out.println("initial pattern in bits2: ");
        System.out.println(bits2);

        //Printing elements that match in bits2 and bits1
        bits2.and(bits1);
        System.out.println("bits2 AND bits1: ");
        System.out.println(bits2);

        //Printing even numbers
        bits2.or(bits1);
        System.out.println("Bits2 OR bits1: ");
        System.out.println(bits2);

        bits2.xor(bits1);
        System.out.println("bits2 XOR bits1: ");
        System.out.println(bits2);
    }
}


package DataStructures;
/*
This program shows a simple example of arrays' applications. Initializing an array of numbers, making a comparison
between the numbers, finding the greatest of them and adding them into a variable.

@author Anette Larios
@since 14.06.2023 (Last update: 15.06.2023)
@version 1.8.0
 */
public class ArraysExample1 {
        public static void main (String []args){
            //Creating an array of doubles called 'listOfNumbers' and initializing values
            double [] listOfNumbers = {1.2,1.5,2.3,5.1,3.4};
            //creating a double variable called 'total' and initializing it in 0.
            double total = 0;
            //creating a double variable called max and initializing in the value stored in position 0 of the array
            //list of numbers (1.2)
            double max = listOfNumbers[0];
            //Printing a message
            System.out.println("Printing all numbers in the array: ");
            //From position 0 to position 4 of the array
            for(int i = 0; i < 5; i++){
                //the program will print all numbers stored in the array
                System.out.println(listOfNumbers[i]);
                //making a comparation of numbers, our maximum right now it is 1.2, this number will be comparated
                //with each number stored in the array, if it is find another number greater than 1.2, this new number
                //will become 'max' until there is no greater number. This process will continue consecutively
                if(max < listOfNumbers[i]) max = listOfNumbers[i];
                //as the for cycle is iterating in the positions of the array will add the values in total variable
                total += listOfNumbers[i];
            }
            //Printing the addition of all numbers within the array
            System.out.println("Printing the addition of all numbers in the array");
            System.out.println(total);
            //Printing the biggest value in the array found by the comparison in for cycle
            System.out.println("Printing the biggest value in the array");
            System.out.println(max);
        }
}

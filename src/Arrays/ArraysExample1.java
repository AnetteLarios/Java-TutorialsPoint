package Arrays;

public class ArraysExample1 {

        public static void main (String []args){
            double [] listOfNumbers = {1.2,1.5,2.3,5.1,3.4};
            double total = 0;
            double max = listOfNumbers[0];

            System.out.println("Printing all numbers in the array: ");
            for(int i = 0; i < 5; i++){
                System.out.println(listOfNumbers[i]);
                if(max < listOfNumbers[i]) max = listOfNumbers[i];
                total += listOfNumbers[i];
            }
            System.out.println("Printing the addition of all numbers in the array");
            System.out.println(total);
            System.out.println("Printing the biggest value in the array");
            System.out.println(max);
        }
}

package InterfacesProgram1;
/*
Mammalint class implements Animal interface
This program is a simple example of how can be used an interface on a class.
Implements the method of the interface and its own to create an object.

@author Anette Larios
@since 12.06.2023
@version 1.8.0
 */
public class MammalInt implements Animal{

    public void eat(){
        System.out.println("Mammal eats");
    }

    public void travel(){
        System.out.println("Mammal travels");
    }

    public int numberOfLegs(){
        return 0;
    }
    //main
    public static void main (String []args){
        //creates an object called 'firstMammal' type MammalInt
        MammalInt firstMammal = new MammalInt();
        //Calls methods for the created object.
        firstMammal.eat();
        firstMammal.travel();
    }
}

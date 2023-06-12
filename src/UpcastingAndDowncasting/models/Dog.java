package UpcastingAndDowncasting.models;
/*
Class 'Dog' extends parent 'Animal' class properties.
Overrides 'makeNoise' method and has 'growl' function that  exemplifies its behavior

@author Anette Larios
@since 12.06.2023
 */
public class Dog extends Animal{

    /*
    makeNoise is an overriden' method from 'Animal' class that shows the animal's behavior.

    @author Anette Larios
    @since 12.06.2023
     */
    public void makeNoise(){
        System.out.println("Woof woof");
    }

    /*
    growl it is a method that shows a different second behavior of the Dog.

    @author Anette Larios
    @since 12.06.2023
     */
    public void growl(){
        System.out.println("Grrr");
    }
}

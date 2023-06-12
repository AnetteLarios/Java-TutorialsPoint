package UpcastingAndDowncasting;

/*
This is the main program of Upcasting and Downcasting. It exemplifies the functionality
of this method.

@author Anette Larios
@since 12.06.2023
@version 1.8.0
 */

import UpcastingAndDowncasting.models.Animal;
import UpcastingAndDowncasting.models.Dog;
import UpcastingAndDowncasting.models.Cat;

public class CastingMain {

    public static void main(String[] args) {
        //Upcasting
        /*Creating an 'firstAnimal' object type 'Animal'
          Even if it is declared to be a Dog we can not access the methods within the subclass
          since it is an Animal
         */

        Animal firstAnimal = new Dog();
        //Upcasting
        /*
        Creating a 'cat' object type 'Animal'
        Even if it is declared to be a new Cat, is not possible to use the methods within the
        subclass since it is and Animal
         */
        Animal cat = new Cat();

        /*
        Calling 'showAnAnimalBehavior' function for 'firstAnimal' and 'cat' object.
        As we are upcasting every Animal has the 'ability' to use 'makeNoise' function.
        But, if the subclass is overriding 'makeNoise' method, it will use the method within
        the subclass, in this way, we can use one function to show different behaviors in
        other classes.
        */

        showAnAnimalBehavior(firstAnimal);
        showAnAnimalBehavior(cat);
    }

    /*
    showAnAnimalBehavior function calls to 'makeNoise' method if a subclass it is overriding
    this method from Animal class, and it will do what is within subclass' method.
    If the subclass that is passed as a parameter does not have a 'makeNoise' method, it will
    call the method from 'Animal' class.

    @param any object of type Animal, it can be a class that extends Animal class or an specific
    Animal declared object.
    @author Anette Larios
    @since 12.06.2023
     */
    public static void showAnAnimalBehavior(Animal animal){
        animal.makeNoise();
        //DownCasting
        /*
        This is the a way to access to a subclass method that we are downcasting. Here the program
        it is verifying if that Animal passed as a parameter is or not a Dog, if it is a Dog, it will
        call it specific method 'growl' that it is only within 'Dog' class.
        If the Animal is not a Dog, it will not call growl method, since this fuction can receive any
        animal but not all animals has that method. If the program does not make that verification, it will
        show a mistake for cat object because cat object does not have or can access to growl method.
         */
        if( animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.growl();
        }

    }
}
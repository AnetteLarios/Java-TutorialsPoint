package UpcastingAndDowncasting.models;
/*
Cat model inherits Animal properties and functionalities.
It has only one function 'makeNoise' to show animal's behaviour.

@author Anette Larios
@since 12.06.2023
 */
public class Cat extends Animal{
    /*
    makeNoise method shows a message of the noise the animal makes.

    @author Anette Larios
    @since 12.06.2023
    */
    public void makeNoise(){
        System.out.println("Meow meow");
    }
}

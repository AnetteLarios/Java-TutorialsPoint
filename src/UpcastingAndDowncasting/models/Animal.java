package UpcastingAndDowncasting.models;
/*
 Parent class 'Animal' inherits it properties to another sub-classes.
 It has a 'makeNoise' method that other classes will overrride.

 @author Anette Larios
 @since 12.06.2023
 */
public class Animal {
    String name;

    /*
    makeNoise method shows a message of the Animal's behavior.This fuction will be overriden

    @author Anette Larios
    @since 12.06.2023
     */
    public void makeNoise(){
        System.out.println("I am just an Animal");
    }
}

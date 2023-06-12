package Encapsulation;

import Encapsulation.models.EncapsulatedClass;
/*
This is a program that exemplifies the functionalities of Encapsulation method in OOP
It encapsulates a class and its fields, and then assign values to the fields of a created object through getters
and setters.

@author Anette Larios
@since 12.06.2023
@version 1.8.0

 */
public class EncapsulationAppMain {

    public  static void main (String [] args){
        EncapsulatedClass encapsulatedObject = new EncapsulatedClass();
        encapsulatedObject.setName("Ajolote");
        encapsulatedObject.setAge(2);
        encapsulatedObject.setIdNum("AjMex0");

        System.out.println("Name: " + encapsulatedObject.getName() + " Age: " + encapsulatedObject.getAge() +
                            " IdNumber: " + encapsulatedObject.getIdNum());

    }
}

package InterfacesProgram2.models;
import InterfacesProgram2.models.models.CircleInt;
import InterfacesProgram2.models.models.RectangleInt;
/*
This is a program example of Interfaces. It has a geometric figure interface applied to a 'Circle' and 'Rectangle'
classes.
The interface has two functions 'calculateArea' and 'calculatePerimeter'

@author Anette Larios
@since 13.06.2023
@version 1.8.0
 */
public class Interfaces2AppMain {

    public static void main (String []args){

        CircleInt circle = new CircleInt(5);
        RectangleInt rectangle = new RectangleInt(4,6);

        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Perimeter of the circle: " + circle.calculatePerimeter());

        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of the rectangle: " + rectangle.calculatePerimeter());
    }
}

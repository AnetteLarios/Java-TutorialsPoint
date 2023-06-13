package InterfacesProgram2.models.models;
/*
RectangleInt implements GeometricFigure interface.
Contains attributes base and height to implement GeometricFigure's functions.
@author Anette Larios
@since 13.06.2023

 */
public class RectangleInt implements GeometricFigure {
    private double base;
    private double height;

    //class constructor
    public RectangleInt (double base, double height){
        this.base = base;
        this.height = height;
    }
    /*
    calculateArea calculates the area of the rectangle
    @return the result of base per height
    @author Anette Larios
    @since 13.06.2023
     */
    public double calculateArea(){
        return base * height;
    }
    /*
    calculatePerimeter calculates the perimeter of the rectangle
    @return the result of base plus height multiplied by 2.
    @author Anette Larios
    @since 13.06.2023
     */
    public double calculatePerimeter(){
        return 2 * (base + height);
    }
}

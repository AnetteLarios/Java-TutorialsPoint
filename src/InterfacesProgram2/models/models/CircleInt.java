package InterfacesProgram2.models.models;
/*
CircleInt class implements GeometricFigure interface.

@author Anette Larios
@since 13.06.2023
 */
public class CircleInt implements GeometricFigure {
    private double radius;

    //class constructor
    public CircleInt(double radius) {
        this.radius = radius;
    }
    /*
    calculateArea function override 'calculateArea' from 'GeometricFigure' interface.
    @return Pi per square radius
    @author Anette Larios
    @since 13.06.2023
     */
    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    /*
    calculatePerimeter function override 'calculatePerimeter' from GeometricFigure interface.
    return 2 per Pi per radius
     */
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}

package Lesson9_HW.GeometricShapes;

public class Circle extends Shapes {
    private double radius;

 public Circle(double radius){
     this.radius = radius;
 }

    @Override
    public double perimeter() {
        return (2*(Shapes.pi)* radius);
    }

    @Override
    public double squre() {
        return (Shapes.pi*Math.pow(radius,2));
    }
}

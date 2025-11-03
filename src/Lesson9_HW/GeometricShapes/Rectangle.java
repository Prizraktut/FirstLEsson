package Lesson9_HW.GeometricShapes;

import Lesson8_HW.Animals.Rabbit;

public class Rectangle extends Shapes{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }

    @Override
    public double squre() {
        return (length*width);
    }
}

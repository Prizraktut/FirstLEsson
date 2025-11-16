package Lesson9_HW.GeometricShapes;

public class Triangle extends Shapes{
    private double firstLenth;
    private double secondLenth;
    private double hypotenuse;
    private double high;

    //для периметра
    public Triangle(double firstLenth, double secondLenth, double hypotenuse) {
        this.firstLenth = firstLenth;
        this.secondLenth = secondLenth;
        this.hypotenuse = hypotenuse;
    }

    // для площади
    public Triangle(double hypotenuse,double high){
        this.hypotenuse = hypotenuse;
        this.high = high;
    }

    @Override
    public double perimeter() {
        return (firstLenth+secondLenth+ hypotenuse);
    }

    @Override
    public double squre() {
        return (hypotenuse*high)/2;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

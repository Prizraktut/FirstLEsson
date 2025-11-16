package Lesson10_HW.User;

public class Car implements Cloneable {
    private String model;
    private String mark;
    private char classOfCar;
    private int horsePower;


    public Car(String model, String mark, char classOfCar, int horsePower) {
        this.model = model;
        this.mark = mark;
        this.classOfCar = classOfCar;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "\n\t\tModel: " + model +
                "\n\t\tMark: " + mark +
                "\n\t\tClass: " + classOfCar+
                "\n\t\tHP: " + horsePower;
    }

    @Override
    public int hashCode() {
        return horsePower;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){return true;}
        if (obj == null || obj.getClass() != this.getClass()) {return false;}
        Car car = (Car)obj;
        return model.equals(car.model) && mark.equals(car.mark) && classOfCar == car.classOfCar &&
                horsePower == car.horsePower;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setClassOfCar(char classOfCar) {
        this.classOfCar = classOfCar;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public char getClassOfCar() {
        return classOfCar;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public Car clone() {
        try {
            Car clone = (Car) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

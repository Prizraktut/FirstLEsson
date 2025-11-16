package Lesson10_HW.User;

public class Apartment implements Cloneable {
    private int roomAmount;
    private double square;
    private boolean balcony;

    public Apartment(int roomAmount, double square, boolean balcony) {
        this.roomAmount = roomAmount;
        this.square = square;
        this.balcony = balcony;
    }

    @Override
    public String toString() {
        return "\n\t\troomAmount: " + roomAmount +
                "\n\t\tsquare: " + square +
                "\n\t\tbalcony: " + balcony+ "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){return true;}
        if (obj == null || obj.getClass() != this.getClass()) {return false;}
        Apartment apartment = (Apartment) obj;
        return roomAmount == apartment.roomAmount && square == apartment.square && balcony == apartment.balcony;
    }

    @Override
    public int hashCode() {
        return roomAmount + (int)square;
    }

    public void setRoomAmount(int roomAmount) {
        this.roomAmount = roomAmount;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public int getRoomAmount() {
        return roomAmount;
    }

    public double getSquare() {
        return square;
    }

    public boolean isBalcony() {
        return balcony;
    }

    @Override
    public Apartment clone() {
        try {
            Apartment clone = (Apartment) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

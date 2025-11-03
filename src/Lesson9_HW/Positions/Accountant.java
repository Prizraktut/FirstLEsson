package Lesson9_HW.Positions;

public class Accountant implements Print,Cloneable {
    String post;

    public Accountant(String post) {
        this.post = post;
    }

    @Override
    public void printPost() {
        System.out.println("Person's position is \"" + post + "\"");
    }




    @Override
    public Accountant clone() {
        try {
            Accountant clone = (Accountant) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

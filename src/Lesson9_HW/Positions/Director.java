package Lesson9_HW.Positions;

public class Director implements Print {
    String post;

    public Director(String post) {
        this.post = post;

    }

    @Override
    public void printPost() {
        System.out.println("Person's position is \"" + post + "\"");
    }


}

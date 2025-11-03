package Lesson9_HW.Positions;

public class Worker implements Print {
    String post;

    public Worker(String post) {
        this.post = post;
    }

    @Override
    public void printPost() {
        System.out.println("Person's position is \"" + post + "\"" );
    }
}

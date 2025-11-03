package Lesson8_HW.Animals;

public class Animal {
    public final String type;
    public final String classification;
    public int age;

    public Animal(String type, String classification, int age) {
        this.type = type;
        this.classification = classification;
        this.age = age;
    }

    public Animal(){
        this("Unknown","Unknown", -1);
    }

    public void voice(){
        System.out.println("Animal makes some kind of sound");
    }

    public void eat(String food){
        System.out.println("Animal eats something");
    }

    @Override
    public String toString() {
        return "Type: " + type +
                " \nClassification: " + classification +
                " \nAge " + age;
    }

}

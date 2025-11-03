package Lesson8_HW.Animals;

public class Rabbit extends Animal{
    String name;

    public Rabbit(String type, String classification, int age){
        super(type, classification, age);
    }


    @Override
    public void voice(){
    System.out.println("Rabbit says piii");
    }

    @Override
    public void eat(String food){
        String foodToEat = "Grass";
        if(food.equals(foodToEat)) {
            System.out.println(name + " likes to eat " + food);
        }
        else {
            System.out.println("UIIII This is not my food!");
            }
        }
    }



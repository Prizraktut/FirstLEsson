package Lesson8_HW.Animals;

import java.util.Objects;

public class Tiger extends Animal{
    String name;

    public Tiger(String type, String classification, int age, String name){
        super(type,classification,age);
        this.name = name;
    }

    @Override
    public void voice(){
        System.out.println( name + " say RRRR");
    }

    @Override

    public void eat(String food){
        String foodToEat = "Meat";
        if(food.equals(foodToEat)) {
            System.out.println(name + " likes to eat " + food);
        }
        else {
            System.out.println("RRRRR This is not my food!");
        }
    }

}

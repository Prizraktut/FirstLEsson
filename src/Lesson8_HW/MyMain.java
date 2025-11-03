package Lesson8_HW;

import Lesson8_HW.Animals.Dog;
import Lesson8_HW.Animals.Tiger;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args){
        //createAnyAnimals();
        privateDog();
    }

    public static void createAnyAnimals(){
        String food;
        System.out.println("Enter the food, please");
        Scanner input = new Scanner(System.in);

       Tiger simba = new Tiger("Predator","Wild", 4, "Simba");
            food = input.next();
            simba.eat(food);
    }


        //Первый вариант обхода приватного конструктора
    public static void privateDog(){
        Dog tyzik = new Dog();
        tyzik.eat("Meat");
        System.out.println(tyzik);
    }


    // Второй вариант обхода приватного конструктора
    public static void privateDog1(){
        Dog sharik = Dog.getPrivateCostructor();
        System.out.println(sharik);
        sharik.eat("Meat");

    }

}

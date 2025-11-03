package Lesson9_HW;

import Lesson9_HW.GeometricShapes.Circle;
import Lesson9_HW.GeometricShapes.Rectangle;
import Lesson9_HW.GeometricShapes.Triangle;
import Lesson9_HW.Positions.Accountant;
import Lesson9_HW.Positions.Director;
import Lesson9_HW.Positions.Worker;

import java.util.Scanner;

public class MyMain {

    public static void main (String[] args){
        //getInformationPost();
        //calculateSquare();
        //getFigures();
        cloneAcc();
    }

    public static void getInformationPost(){
        Worker worker = new Worker("Worker for nothing");
        worker.printPost();

        Director director = new Director("Director of management");
        director.printPost();

        Accountant accountant = new Accountant("Bank accountant");
        accountant.printPost();
    }


    //Пример использования клонирования объекта с помощью метода Clone
    public static void cloneAcc(){
        Accountant accountant = new Accountant("Bank accountant");
        accountant.clone(); //Можно вызвать метод clone переопределив его из маркера-интерфейса Clonable
        Accountant accountantOther = accountant.clone();

        System.out.println("First obj = Second? " + (accountant == accountantOther));
    }



    public static void getFigures(){

        int[] figures = new int[5];

        for (int count = 0; count< figures.length;count++){

            figures[count] = input();
        }
        calculatePerimetr(figures);
    }


    private static void calculatePerimetr(int[] figures)
    {
        double summ = 0;

        for (int count = 0; count<figures.length;count++){
            if (figures[count] == 1){
            Circle circle = new Circle(4);
            summ += circle.perimeter();
        }
            else if (figures[count] == 2) {
            Triangle triangle = new Triangle(4,5,6);
            summ += triangle.perimeter();
            }
            else if (figures[count] == 3) {
                Rectangle rectangle = new Rectangle(4,5);
                summ += rectangle.perimeter();
            }
        }
        System.out.println("Summ of fives shapes perimeters is " + summ);

    }

    public static void calculateSquare(){
        Triangle triangle = new Triangle(4,5);
        System.out.println("Square triangle is " + triangle.squre());

    }


    public static int input(){
        Scanner input = new Scanner(System.in);
        int inputNumb = -1;
        int inputCorrect = 0;

        while (inputCorrect ==0) {

            System.out.println("Enter number type of  fives figures: 1- Circle, 2 - Triangle, 3 - Rectangle");

            if (input.hasNextInt()) {
                inputNumb = input.nextInt();
                if (inputNumb == 1 | inputNumb == 2 | inputNumb == 3) {
                    inputCorrect = 1;
                }
                else {
                    System.out.println("Wrong value!");
                }

            }
            else {
                System.out.println("Wrong value!");
            }
        }
            return inputNumb;
    }




}

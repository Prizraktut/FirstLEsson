package Lesson1_HW;

import java.util.Scanner;

//import static Lesson4_HW.Lesson4_HW.massives;

public class Main {
    public static void main(String[] args){
        //calculateByFormula();
        //digitSumm();
       // digitSumm2();
        //rounding();
        //ostatok();
    }

    // Задача 1:
    //Написать приложение, которое будет вычислять и выводить значение по формуле:
    //a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
    public static void calculateByFormula(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число b:");
        int b = input.nextInt();
        System.out.print("Введите число c:");
        int c = input.nextInt();
        System.out.println("Рассчитывает число по формуле {a = 4*(b+c-1)/2}");
        System.out.println("Ваше число a = " + 4*(b+c-1)/2);
        System.out.println();
    }


// Задача 2:
//В переменной n хранится двузначное число. Создайте программу, вычисляющую и
//выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8
//(2+6)
    public static void digitSumm(){

        int n= 79;

        int sumDigit;
        int ost = n %10;
        int firstDigit = n/10;

        sumDigit = ost+firstDigit;

        System.out.println("Сумма чисело n равна: " + sumDigit);
        System.out.println();
    }


//Задача 3:
//В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
//выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
//9 (1+2+6)
    public static void digitSumm2(){
        int n = 353;

        int firstDigit = n/100;
        int lastDigit = n %10;

        int middleDigit;
        int firsttwo = n/10;
        middleDigit = firsttwo %10;
        int sumDigit = firstDigit+lastDigit+middleDigit;

        System.out.println("Сумма цифр трехзначного числа: " + sumDigit);
        System.out.println();
    }

    //Задача 4:
    //В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
    //программу, округляющую число n до ближайшего целого и выводящую результат на
    //экран
    public static void rounding(){
        double n = 7.345;
        int integer;
         integer = (int)n;

         System.out.println("Ближайшее целое число: " + integer);
    }

    //Задача 5:
    //В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
    //на экран результат деления q на w с остатком. Пример вывода программы (для случая,
    //когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке
    public static  void ostatok(){
        int q = 745;
        int w = 222;

        int ostatok;
        ostatok = q %w;

        System.out.println("Остаток от деления числа q на w равняется " + ostatok);
        System.out.println();

    }


    //Задача *:
    //Написать программу которая будет менять местами значение целочисленных
    //переменных. Пример:
    //int a = 1; int b = 2;
    ////код (ваше решение)
    //sout(a); //выведет 2
    //sout(b); //выведет 1
    //Усовершенствовать программу, использовать только 2 входные переменные (a,b)
    public static void changeValues(){
        int a = 2;
        int b = 234;


        a = a+b;
        b = a-b;
        a = a-b;

        //int c = a;
       // a = b;
       // b = c;
        System.out.println("Значение a:"+a + " Значение b:" + b);


    }

}

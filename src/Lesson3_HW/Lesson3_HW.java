package Lesson3_HW;

import java.util.Scanner;

public class Lesson3_HW {
    public static void math1 (){
       // isEven();
        // isWArm();
        //numbersSQRT();
       // sequence();
        summNumbers();
    }

//Задача 1:
//Напишите программу, которая будет принимать на вход число из консоли и на выход
//будет выводить сообщение четное число или нет. Для определения четности числа
//используйте операцию получения остатка от деления (операция выглядит так: '% 2')
    public static void isEven(){
        Scanner input = new Scanner(System.in);
        System.out.print("Проверка на четность числа. Введите число:");
        int n = input.nextInt();
        if (n %2 == 0){
            System.out.println("Число чётное");
        }
        else {
            System.out.println("Число нечётное");
        }
    }

    //Задача 2:
    //Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
    //Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold»
    public static void isWArm(){
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число (температура на улице):");
        int t = input.nextInt();

        if( t> -5) {
            System.out.println("Warm");
        }
        else if (t<= -20) {
            System.out.println("Cold");
        }
        else {
            System.out.println("Normal");
        }
    }

    //Задача 3:
    //Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно

    public static void numbersSQRT(){
        for(int i = 10;i<21;i++){
            int n = i*i;
            System.out.println("Квадрат числа "+ i + " равен " + n);
        }
    }
    //Задача 4:
    //Необходимо, чтоб программа выводила на экран вот такую последовательность:
    //7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
    public static void sequence(){
        int n = 0;
        System.out.print("Последовательность чисел: ");
        while (n != 98){
            n = n+7;
           System.out.print(n + " ");
        }
    }

//Задача *:
//Напишите программу, где пользователь вводит любое целое положительное число. А
//программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
//числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
//ввести некорректные данные
    public static void summNumbers(){
        Scanner input = new Scanner(System.in);

        boolean out = false; //если false значит введено неверное значение. выход из бесконечного цикла - ввести "-1"
        double n = 0;

        while (out == false){
            System.out.print("Введите любое целое положительное число либо завершите работу, набрав \"-1\": ");
            n = input.nextDouble();

            if ((n < 1 || n % 1 != 0) && n != -1) {
                System.out.println("Необходимо внести целое положительное число!");

            }
            else if (n==-1){
                System.out.println("Выход по требованию");
               return;
            }
            else
            {
                out = true;
            }

        }
        long summ = 0;

        for(int i = 1; i<=n;i++) {
            summ += i;
        }
        System.out.println("Сумма чисел от 1 до " + n + " равняется " + summ);
    }
}


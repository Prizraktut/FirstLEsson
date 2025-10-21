package Lesson5_HW;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson5_HW {


    public  static void main(String[] args){
        //findSummAllElem();
        //chess();
        convertMassive();

    }
//Задача 1:
//1.1 Создать двумерный массив, заполнить его случайными числами.
//1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
//1.3 Найти сумму всех получившихся элементов и вывести в консоль
    public static void findSummAllElem(){
        Scanner scanner = new Scanner(System.in);
        int input;
        int summ = 0;

        int[][] array3x = new int[][]{
                {4,5,3,4,6},
                {6,12,4,},
                {3,1,11,63,111},
                {98,0,2}
        };
        System.out.print("Введите число ");
        input = scanner.nextInt();
        for(int row = 0;row<array3x.length;row++){
            for(int col = 0;col < array3x[row].length;col++){
                array3x[row][col] = array3x[row][col] + input;
                summ += array3x[row][col];
            }
        }

        System.out.println("Сумма всех элементов: " + summ);

    }
    //Задача 2:
    //Создать программу для раскраски шахматной доски с помощью цикла. Создать
    //двумерный массив String 8х8. С помощью циклов задать элементам массива значения
    //B(Black) или W(White).
public static void chess (){

    String[][] chessmassive = new String[8][8];

    for(int row = 0; row<chessmassive.length; row++){
        for(int col = 0;col < chessmassive[row].length;col++){
            if(row ==0 || row == 2 || row == 4 || row ==6){
                if(col  == 0 || col == 2 || col == 4 || col ==6) {
                    chessmassive[row][col] = "W  ";
                }
                else {
                    chessmassive[row][col] = "B  ";
                }
            }
            else {
                if(col  == 0 || col == 2 || col == 4 || col ==7) {
                    chessmassive[row][col] = "B  ";
                }
                else {
                    chessmassive[row][col] = "W  ";
                }
            }
        }
    }

    for(int row = 0; row<chessmassive.length; row++){
        for(int col = 0;col < chessmassive[row].length;col++){
            System.out.print(chessmassive[row][col]);
        }
        System.out.println();
    }
}
//Задача *:
//Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
//Формат входных данных:
//Программа получает на вход два числа n и m.
//Формат выходных данных:
//Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
//символа.

    public static void convertMassive(){
        Scanner scanner = new Scanner((System.in));
        int n = input(1);
        int m = input(2);

        String[][] snake = new String[n][m];
        int i;
        for (int row = 0;row<snake.length;row++){
            i = 1;
            for (int col = 0;col<snake[row].length;col++){

                boolean goNext = false;

                System.out.print("Введите число от 0 до 999 ");
                int number = scanner.nextInt();
                //int number = (int)(Math.random()*100);
                while (!goNext) {

                    if (number > 999 || number < 0) {
                        System.out.println("Неверно введено значение!");
                        System.out.print("Введите число от 0 до 999 ");
                        number = scanner.nextInt();
                    }
                    else {
                        goNext = true;
                    }
                }
                    if (row % 2 == 0) {
                        snake[row][col] = convertNum(number);
                    } else {
                        snake[row][snake[row].length - i] = convertNum(number);
                        i++;
                    }
            }
        }
        output(snake);
    } // end method


    public static int input(int count){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Введите " + count + " размерность двухмерного массива ");
        n = scanner.nextInt();
        return n;
    }

    public static String convertNum(int number){
        String convNum = "";
        if (number>=0 && number<10){
            convNum = " " + Integer.toString(number) + " ";
        } else if (number>9 && number <100) {
            convNum = " " + Integer.toString(number);
        }
        else {
    convNum = Integer.toString(number);
        }
        return convNum;
    }


    public static void output(String[][] snake){

        for (String[] strings : snake) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }

    }



} // end class

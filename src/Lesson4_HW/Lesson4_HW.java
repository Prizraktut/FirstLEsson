//Для всех задач исходят следующие условия: пользователь с клавиатурой вводит размер
//массива (просто подразумевает число). После того, как задан размер массива, заполните его
//одним из двух способов: с помощью Math.random(), или каждый элемент массива вводится
//вручную. Попробовать оба партнера. После увеличения массива
//данные, решить для него следующую задачу:

package Lesson4_HW;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson4_HW {

    public static void main(String[] args) {

        //inputAndOutputDirectAndReversMassive();
        // findMaxMinValue();
        //countelementnull();
        //changeEement();
        // increasingSubsequence();
        correctMassive();
    }

    //Задача 1
//Пройдите по массиву, выведите все элементы в прямом и обратном порядке
    public static void inputAndOutputDirectAndReversMassive(){
        Scanner Scanner = new  Scanner(System.in);

        System.out.print("Введите размерность массива ");
        int i = Scanner.nextInt();
        double[] massive = new double[i];
        for (int index = 0; index < i; index++){
            massive[index] =  (int)(Math.random()*100);
            System.out.println(" Direct massive["+ index + "] = " + massive[index]);
        }

        System.out.println();
        System.out.println();

        for( int index = i-1;index >=0;index--){
            System.out.println("Reverse massive["+ index + "] = " + massive[index]);
        }
    }

    //Задача 2+3:
    //найти создание-максимальное количество элементов и вывод
    //Найти индексы минимальногоv и максимального элементов и вывести в консоль
    public static void findMaxMinValue() {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Введите размерность массива ");
        int i = Scanner.nextInt();
        double[] massive = new double[i];

        for(int count = 0;count<i;count++){
            System.out.println("Введите " + (count+1) + " Число массива");
            massive[count]= Scanner.nextDouble();
        }
        System.out.println("Введенные элементы массива: " + Arrays.toString(massive));

        double max = massive[0];
        double min = massive[0];
        int indexmin = 0;
        int indexmax = 0;

        for (int count = 0;count<i;count++){

            if (massive[count]>max){
                max = massive[count];
                indexmax = count;
            }

            if (massive[count]<min){
                min = massive[count];
                indexmin = count;
            }
        }
        System.out.println("Максимальное число массива: " + max + " Минммальное: " + min);
        System.out.println( "Индекс максимального Элемента: " + indexmax + " Минимального: " + indexmin);
    }
    //Задача 4:
    //Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
    //сообщение, что их нет

    public static void countelementnull (){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Введите размерность массива ");
        int i = Scanner.nextInt();
        double[] massive = new double[i];

        for(int count = 0;count<i;count++){
            System.out.println("Введите " + (count+1) + " Число массива");
            massive[count]= Scanner.nextDouble();
        }
        System.out.println("Введенные элементы массива: " + Arrays.toString(massive));

        int elemzerocount  = 0;

        for (int count = 0;count<i;count++){
            if (massive[count] == 0){elemzerocount++;}
        }
        System.out.println("Количество Элементов со значением 0 = " + elemzerocount);

    }

    //Задача 5:
//Пройти по массиву и поменять местами элементы первый и последний, второй и
//предпоследний и т.д.
    public static void changeEement(){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Введите размерность массива ");
        int i = Scanner.nextInt();
        double[] massive = new double[i];

        for(int count = 0;count<i;count++){
            System.out.println("Введите " + (count+1) + " Число массива");
            massive[count]= Scanner.nextDouble();
        }
        System.out.println("Введенные элементы массива: " + Arrays.toString(massive));

        int countchange = i/2;
        int first = 0;
        int last = i-1;
        double tmp = 0;
        for(int count = 0;count<countchange;count++){
            tmp = massive[first];
            massive[first] = massive[last];
            massive[last] = tmp;
            first+=1;
            last-=1;
        }
        System.out.println("Result massive: " + Arrays.toString(massive));
    }

    //Задача 6:
    //Проверить, является ли массив возрастающей последовательностью (каждое следующее
    //число больше предыдущего).
    public static void increasingSubsequence(){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Введите размерность массива ");
        int i = Scanner.nextInt();
        double[] massive = new double[i];

        for(int count = 0;count<i;count++){
            System.out.println("Введите " + (count+1) + " Число массива");
            massive[count]= Scanner.nextDouble();
        }
        System.out.println("Введенные элементы массива: " + Arrays.toString(massive));

        for(int count = 0;count<(massive.length)-1;count++){
            if (massive[count]>=massive[count+1]){
                System.out.println("This is not increasing subsequence");
                return;
            }
        }
        System.out.println("This is increasing subsequence");
    }// конец метода


    //Задача *:
    //Имеется массив из неотрицательных чисел(любой). Представьте что массив
    //представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
    //добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
    //содержит нуля в начале, кроме самого числа 0.
    public static void correctMassive(){
        Scanner Scanner = new Scanner(System.in);

        int[] massive = new int[]{3,7,6,5,4};

        String massiveString = "";
        int numbersNew = 0;
        char[] massiveChar;

        System.out.println("Введенные элементы массива: " + Arrays.toString(massive));


        for(int count = 0;count<(massive.length);count++){
            massiveString = massiveString + massive[count];
            }
        numbersNew = Integer.parseInt(massiveString);
        numbersNew++;
        massiveString = Integer.toString(numbersNew);

        massiveChar = massiveString.toCharArray();

        for(int count = 0;count<massive.length;count++){
            massive[count] = Character.getNumericValue(massiveChar[count]);
        }

        System.out.println(Arrays.toString(massive));

    }// конец метода

} // Конец класса
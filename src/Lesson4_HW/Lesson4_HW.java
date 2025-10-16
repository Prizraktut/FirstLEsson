package Lesson4_HW;

import java.util.Scanner;

public class Lesson4_HW {

    public static void main(String[] args){

       inputAndOutputDirectAndReversMassive();

    }


    public static void inputAndOutputDirectAndReversMassive(){
        Scanner Scanner = new  Scanner(System.in);

        System.out.print("Введите размерность массива ");
        int i = Scanner.nextInt();
        double[] massive = new double[i];
        for (int index = 0; index < i; index++){
            massive[index] =  Math.random()*100;
            System.out.println(" Direct massive["+ index + "] = " + massive[index]);
        }

        System.out.println();
        System.out.println();

        for( int index = i-1;index >=1;index--){
            System.out.println("Reverse massive["+ index + "] = " + massive[index]);
        }

    }


}

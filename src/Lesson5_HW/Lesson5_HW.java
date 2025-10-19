package Lesson5_HW;

import java.util.Scanner;

public class Lesson5_HW {


    public  static void main(String[] args){
        findSummAllElem();

    }

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
public static void chess (){

    String[][] chessmassive = new String[8][8];

    for(int row = 0; row<chessmassive.length; row++){
        for(int col = 0;col < chessmassive[row].length;col++){
            chessmassive[row][col] = chessmassive[row][col];

        }
    }


}


}

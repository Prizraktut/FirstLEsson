package Lesson6_HW;
//Задача *:
//Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен
//задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100. Сделать
//метод для добавления денег в банкомат. Сделать функцию, снимающую деньги, которая
//принимает сумму денег, а возвращает булевое значение - успешность выполнения
//операции. При снятии денег, функция должна распечатывать каким количеством купюр
//какого номинала выдаётся сумма. Создать конструктор с тремя параметрами -
//количеством купюр каждого номинала

import java.util.Scanner;

public class ATM {

    private int BYN10;
    private int BYN20;
    private int BYN50;

    public ATM(int BYN10,int BYN20, int BYN50){
    this.BYN10 = BYN10;
    this.BYN20 = BYN20;
    this.BYN50 = BYN50;
    }

    public void takeBanknotes(){
        System.out.print("Enter money byn10 to put, please ");
        int inputMoney =  input();
        BYN10+=inputMoney;
        System.out.print("Enter money byn20 to put, please ");
         inputMoney =  input();
        BYN20+=inputMoney;
        System.out.print("Enter money byn50 to put, please ");
         inputMoney =  input();
        BYN50+=inputMoney;
        System.out.println("OK");
    }

    public boolean receiveBanknotes(){
        int count50 = 0;
        int count20 = 0;
        int count10 = 0;

        System.out.print("Enter money to to get, please ");
        int inputMoney =  input();
        boolean correct = false;

        while (!correct){
            if (inputMoney %10 != 0){
                System.out.println("Incorrect input");
                System.out.print("Enter money, please ");
                inputMoney =  input();
            }
            else {
                correct = true;
            }
        }

        System.out.println();

        while (inputMoney/50 > 0){

            if(BYN50 == 0){
                break;
            }

            inputMoney-=50;
            BYN50--;
            count50++;
        }

        while (inputMoney/20 > 0){
            if(BYN20 == 0){
                break;
            }
            inputMoney-=20;
            BYN20--;
            count20++;
        }

        while (inputMoney /10 > 0){
            if(BYN10 == 0){
                break;
            }
            inputMoney-=10;
            BYN10--;
            count10++;
        }
            if (inputMoney != 0) {
                System.out.println("There is not enough money in ATM");
                return false;
            }
            else {
                System.out.println("Your money:\n\t50byn :" + count50 + "\n\t20byn :" + count20 + "\n\t10byn :" + count10);
                return true;
            }
    }

    private int input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}


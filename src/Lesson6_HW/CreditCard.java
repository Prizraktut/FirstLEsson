package Lesson6_HW;

import java.util.Scanner;
//
public class CreditCard {
    public double totalSum;
    public String account;
//Задача 1:
//Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
//метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
//который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
//выводит текущую информацию о карточке. Напишите программу, которая создает три
//объекта класса CreditCard у которых заданы номер счета и начальная сумма.
//Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
//третьей. Выведите на экран текущее состояние всех трех карточек
    public CreditCard(String myAccount,double myTotalSum){
        totalSum = myTotalSum;
        account = myAccount;
    }

    public void infoAcc(){
        System.out.println("Текущий номер счета: " + account + "; Текущий баланс: " + totalSum);
    }

    public void withdraw (String input){
        Scanner scanner = new Scanner(System.in);
        double moneyToAdd;
        System.out.println("Текушая сумма на счете " + account + " равна " + totalSum );
        System.out.print(input + " ");
        moneyToAdd = scanner.nextDouble();
        totalSum = totalSum - moneyToAdd;
        System.out.println("Текущая сумма на счете " + account + " стала " + totalSum );
    }

    public void addMoneytoAcc(String input){
        Scanner scanner = new Scanner(System.in);
        double moneyToAdd;
        System.out.println("Текушая сумма на счете " + account + " равна " + totalSum );
        System.out.print(input + " ");
        moneyToAdd = scanner.nextDouble();
        totalSum = totalSum + moneyToAdd;
        System.out.println("Текущая сумма на счете " + account + " стала " + totalSum );
    }


}

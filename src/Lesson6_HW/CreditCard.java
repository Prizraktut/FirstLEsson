package Lesson6_HW;

import java.util.Scanner;

public class CreditCard {
    public double totalSum;
    public String account;

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

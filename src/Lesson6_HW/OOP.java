package Lesson6_HW;

public class OOP {

    public static void main( String[] args){
        //CreateAccAndDoOperations();
        startATM();
    }

    public static void CreateAccAndDoOperations(){
        CreditCard EugeneAcc = new CreditCard("123456789",999);
        CreditCard EugeneAcc2 = new CreditCard("323456789",0);
        CreditCard EugeneAcc3 = new CreditCard("623456789",7878789);
        EugeneAcc.withdraw("Внесите сумму для снятия");
        EugeneAcc2.infoAcc();
        EugeneAcc3.addMoneytoAcc("Внесите сумму для пополнения");

    }

public static void startATM(){
        boolean ans = true;
        ATM bankATM = new ATM(20,0,2);
        bankATM.takeBanknotes();
        ans = bankATM.receiveBanknotes();
        if (ans){
            System.out.println("Success");

        }
else {
            System.out.println("Failed");
        }

}

}

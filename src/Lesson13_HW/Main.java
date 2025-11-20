package Lesson13_HW;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        verification();
    }

    public static void verification(){
        try{
            String userNameCorrect = "Andrew";
            String userPassCorrect = "qwerty1";
            System.out.print("Please, enter your USERNAME: ");
            String username = new Scanner(System.in).nextLine();
            System.out.print("Please, enter your PASSWORD: ");
            String password = new Scanner(System.in).nextLine();
            initializeExeption(username,password,userNameCorrect,userPassCorrect);
        }
        catch (UserPassExeption | UserLoginExeption e){
            System.out.println(e.getMessage());
        }
    }

public static void initializeExeption(String username,String password,String userNameCorrect,
                                      String userPassCorrect) throws UserPassExeption, UserLoginExeption{
        if(!password.equals(userPassCorrect)){
            throw new UserPassExeption("Password is incorrect");
        } else if (!username.equals(userNameCorrect)) {
            throw new UserLoginExeption("Login is incorrect");
        }
    }
}

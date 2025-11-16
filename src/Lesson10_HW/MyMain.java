package Lesson10_HW;

import Lesson10_HW.User.Apartment;
import Lesson10_HW.User.Car;
import Lesson10_HW.User.UserMain;

import java.util.Scanner;

public class MyMain {

    public static void main(String[] args){
        getUserToString();
    }

    public static void getUserToString(){
        Car car = new Car("Dongfeng","Aeolus",'C',123);
        Apartment apartment = new Apartment(1,36.7,true);
        UserMain user = new UserMain(123,"Eugene","Kurbatov",33,"Bank",car,apartment);

        Car car2 = new Car("Dongfeng","Aeolus",'C',123);
        Apartment apartment2 = new Apartment(1,36.7,true);
        UserMain user2 = new UserMain(1234,"Eugene","Kurbatov",33,"Bank",car2,apartment2);
        System.out.println("-".repeat(100));

        System.out.println("Сравниваем два объекта переопределенным методом equals - " + user.equals(user2));
        //System.out.println("Информация по user" + user);
       // System.out.println("Переопределённый hashcode - " + user.hashCode());

        System.out.println("-".repeat(70));

        cloneUSer(user); // Клонируем юзера двумя способами, меняем параметр объекта в объекте и, допустим, сравниваем
        // значение вложенного объекта.
    }

    public static void cloneUSer(UserMain user){
        System.out.println("Введите тип клонирования: глубокое -1, поверхностое -2 :");
        int choise = scanner();
        System.out.println("Введите userId");
        int userId = scanner();
        if (choise ==1) {
            UserMain userClone =  user.clone(); // Переопределенный метод, но уже полного клонирования
            userClone.setIdUser(userId);
            Apartment apartmentClone = userClone.getApartment(); // устанавливаем объект объекта полного клона
            System.out.println("Сравнение с клоном - " + userClone.equals(user));
            // при полном клонировании значение объекта в объекте меняется только у него
            System.out.println("Меняем значение вложенного объекта с полным клонированием" +
                    " и  сравниваем - " + userClone.equals(user));
            apartmentClone.setSquare(55.5);
        }
        else if (choise ==2) {
            UserMain userClone2 =  user.cloneSuper(); // метод поверхностного клонирования
            userClone2.setIdUser(userId);
            Apartment apartmentClone2 = userClone2.getApartment();// устанавливаем объект объекта поверхностного клона
            System.out.println("Сравнение с клоном - " + userClone2.equals(user));
            apartmentClone2.setSquare(55.5);
            // так как в поверхностном клонировании внутренние объекты - ссылка на объект основного объекта,
            // то меняется и там тоже
            System.out.println("Меняем значение вложенного объекта с поверхностным клонированием" +
                    " снова сравниваем - " + userClone2.equals(user));
            }
        }

    public static int scanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }

}

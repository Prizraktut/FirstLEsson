package Lesson12_HW;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args){
        //findWords();
        findEmailAndOther();
    }

    public static void findWords(){
        boolean isFound = false;
        //String string = "Моя машина забор РОЙ! пчеЛ ?МОХ УЛЕЙ кот Кошка Миша МИША.";
        System.out.println("Введите строку: ");
        String string = input();

        Pattern pattern = Pattern.compile("\\b[A-ZА-Я]{2,6}\\b", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()){
            System.out.println("Найденные слова: " + matcher.group());
            isFound = true;
        }

        if (!isFound){
            System.out.println("Слов не найдено");
        }
    }

    public static void findEmailAndOther(){
        boolean isFoundEmail = false;
        boolean isFoundNumber = false;
        boolean isFoundDoc = false;
        String patternExpEmail = "\\b[\\w.]+@[\\w.]+\\.[a-zA-Z]{2}\\b";
        String patternExpETelNumber = "(?<=\\s|^)\\+\\(\\d{2}\\)\\d{7}(?=\\s|$)";
        String patternExpDocNumber = "\\b\\d{4}-\\d{4}-\\d{2}\\b";

        Pattern patternEmail = Pattern.compile(patternExpEmail, Pattern.UNICODE_CHARACTER_CLASS);
        Pattern patternTelNumber = Pattern.compile(patternExpETelNumber, Pattern.UNICODE_CHARACTER_CLASS);
        Pattern patternDocNumber = Pattern.compile(patternExpDocNumber, Pattern.UNICODE_CHARACTER_CLASS);
        System.out.println("Введите строку: ");
        String string = input();

        Matcher matcherExpEmail = patternEmail.matcher(string);
        while (matcherExpEmail.find()){
            System.out.println("Email: " + matcherExpEmail.group());
            isFoundEmail = true;
        }
        if (!isFoundEmail){
            System.out.println("E-mail не найдено");
        }

        Matcher matcherExpTelNumber = patternTelNumber.matcher(string);
        while (matcherExpTelNumber.find()){
            System.out.println("Tel. number: " + matcherExpTelNumber.group());
            isFoundNumber = true;
        }
        if (!isFoundNumber){
            System.out.println("Тел. номера не найдены");
        }

        Matcher matcherExpDocNumber = patternDocNumber.matcher(string);
        while (matcherExpDocNumber.find()){
            System.out.println("Doc. number: " + matcherExpDocNumber.group());
            isFoundDoc = true;
        }
        if (!isFoundDoc){
            System.out.println("Номера документа не найдено");
        }


    }


    public static String input (){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

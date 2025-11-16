package Lesson11_HW.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Strings {
    public String[] strings;
    public String string;

    public Strings() {
        strings = new String[3];
    }

    public void inputStrings(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 3 строки :");
        System.out.println("первая строка: ");
        strings[0] = input.nextLine();
        System.out.println("вторая строка: ");
        strings[1] = input.nextLine();
        System.out.println("третья строка: ");
        strings[2] = input.nextLine();

    }

    public void workWithStrings(){
        inputStrings(); // ввод массива из 3 строк

        String stringMax = strings[0];
        String stringMin = strings[0];

        for (String string : strings) {
            if (string.length() >= stringMax.length()) {
                stringMax = string;
            }

            if (string.length() <= stringMin.length()) {
                stringMin = string;
            }
        }
        System.out.println("Самая длинная строка: " + stringMax + " , длинна - " + stringMax.length());
        System.out.println("Самая короткая строка: " + stringMin + " , длинна - " + stringMin.length());
    }

    public void StringsFormat(){
        inputStrings(); // ввод массива из 3 строк

        String tmp;
        if( strings[0].length()>= strings[1].length()){
            tmp = strings[1];
            strings[1] = strings[0];
            strings[0] = tmp;
        }
        if( strings[1].length()>= strings[2].length()){
            tmp = strings[2];
            strings[2] = strings[1];
            strings[1] = tmp;
        }
        if( strings[0].length()>=strings[1].length()){
            tmp = strings[1];
            strings[1] = strings[0];
            strings[0] = tmp;
        }
        System.out.println("Строки по возрастанию: "  + Arrays.toString(strings));
    }

    public void lenthMiddle(){
        inputStrings(); // ввод массива из 3 строк
        String stringResult = "";
        int middle = (strings[0].length()+strings[1].length()+strings[2].length())/3;
        for (String s : strings) {
            if (s.length() < middle) {
                stringResult += s + ", длина - " + s.length() + "\n";
            }
        }
        if(!stringResult.isEmpty()){
        System.out.println("Строки, длина которых меньше средней, а также их длина:\n" + stringResult);
        }
        else System.out.println("Строки, длина которых меньше средней отсутствуют!");
    }


    public void findVArCharStrings(){
        inputStrings(); // ввод массива из 3 строк
        char[] strchar;
        boolean isRepeat = false;
        for (int count = 0;count<strings.length;count++){
            strings[count] = strings[count].toLowerCase();
        }

        for (String s : strings) {
            strchar = s.toCharArray();
            for (int countChar = 0; countChar < strchar.length; countChar++) {
                for (int countCharToCompare = countChar; countCharToCompare < strchar.length - 1; countCharToCompare++) {
                    if (strchar[countChar] == strchar[countCharToCompare + 1]) {
                        isRepeat = true;
                        break;
                    }
                }
            }
            if(isRepeat) {
                System.out.println("В слове " + s + " есть повторяющиеся буквы");
            }
            else {
                System.out.println("В слове " + s + " нет повторяющихся букв");
                return;
            }
            isRepeat = false;
        }
    }


    public void charDuplicate() {
        String stringDuplicate = "";
        inputStrings(); // ввод массива из 3 строк

        for (String s : strings) {
            char[] chars = s.toCharArray();

            for (char aChar : chars) {
                stringDuplicate += "" + aChar + aChar;
            }
            System.out.println("Задублированное слово: " + stringDuplicate);
            stringDuplicate = "";
        }
    }

    public void isPalindrome(){
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int choose = 0;
        String palindrome = "ротатор машин полено мама папап".toLowerCase();
        String[] stringsWord = palindrome.split(" ");
        for (int count = 0; count< stringsWord.length;count++){
            stringsWord[count] = stringsWord[count].trim();
        }

        System.out.println("Введите номер слова в строке для проверки на палиндром");
        while (!check){
            if (input.hasNextInt()){
                choose = input.nextInt();
                if (choose <= stringsWord.length && choose > 0){
                    check = true;
                }
                else {
                    System.out.println("Вы ввели неверное значение!");
                    System.out.println("Введите номер слова в строке для проверки на палиндром");
                }
            }
            else {
                System.out.println("Необходимо ввести число!");
                System.out.println("Введите номер слова в строке для проверки на палиндром");
            }

        }
            char[] palindromeChar = stringsWord[choose-1].toCharArray();
            boolean isPalindrome = true;
            int countToCompare = stringsWord[choose-1].length() / 2;
            int countBack = stringsWord[choose-1].length() - 1;
            for (int count = 0; count < countToCompare; count++) {
                if (palindromeChar[count] != palindromeChar[countBack]) {
                    System.out.println(stringsWord[choose-1] + " is not a palindrome");
                    return;
                } else {
                    countBack--;
                }

            }
        System.out.println(stringsWord[choose-1] + " is a palindrome");
    }
}

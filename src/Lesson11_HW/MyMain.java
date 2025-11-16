package Lesson11_HW;

import Lesson11_HW.Strings.Strings;

public class MyMain {

    public static void main(String[] args){
       calculate1();
    }

    public static void calculate1(){
        Strings strings = new Strings();


        strings.StringsFormat();// сортировать строки по возрастанию
         strings.lenthMiddle(); // Вывести на консоль те строки, длина которых меньше средней и их длину
       strings.workWithStrings(); // Найти самую длиную и короткую строку
        strings.findVArCharStrings();  //  Найти слово, состоящее только из различных символов.
        strings.charDuplicate(); // Задублировать буквы в словах
        strings.isPalindrome();// проверка слова на палиндром

    }
}

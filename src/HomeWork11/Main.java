package HomeWork11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Блок 2. Домашнее задание
 * <p>
 * <p>
 * <p>
 * <p>
 * 5. Вывести на консоль новую строку, которой задублирована каждая буква из
 * начальной строки. Например, "Hello" -> "HHeelllloo".
 * Задача *:
 * Дана строка произвольной длины с произвольными словами. Написать программу для
 * проверки является ли любое выбранное слово в строке палиндромом.
 * Например, есть строка, вводится число 3, значит необходимо проверить является ли
 * 3-е слово в этой строке палиндромом.
 * Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций:
 * например, в строке 5 слов, а на вход программе передали число 500.
 */

public class Main {
    public static void main(String[] args) {

        task1();

    }

    static void task1() {

        /**1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
         найденные строки и их длину.*/


        System.out.println("Task 1.");
        Scanner sc = new Scanner(System.in);
        String lineOne;
        String lineTwo;
        String lineThree;

        System.out.println("Введите строку 1");
        lineOne = sc.nextLine();
        System.out.println("Введите строку 2");
        lineTwo = sc.nextLine();
        System.out.println("Введите строку 3");
        lineThree = sc.nextLine();

        sc.close();

        String shortest, mid, longest;


        if (lineOne.length() <= lineTwo.length() && lineOne.length() <= lineThree.length()) {
            shortest = lineOne;
            if (lineTwo.length() < lineThree.length()) {
                longest = lineThree;
                mid = lineTwo;
            } else {
                longest = lineTwo;
                mid = lineThree;
            }
        } else if (lineTwo.length() <= lineOne.length() && lineTwo.length() <= lineThree.length()) {
            shortest = lineTwo;
            if (lineOne.length() < lineThree.length()) {
                longest = lineThree;
                mid = lineOne;
            } else {
                longest = lineOne;
                mid = lineThree;
            }

        } else {
            shortest = lineThree;
            if (lineOne.length() < lineTwo.length()) {
                longest = lineTwo;
                mid = lineOne;
            } else {
                longest = lineOne;
                mid = lineTwo;
            }
        }


        System.out.println("Самая длинная строка: " + longest + ". Длина строки - " + longest.length());
        System.out.println("Самая короткая строка: " + shortest + ". Длина строки - " + shortest.length());

        System.out.println("________________________________");

        System.out.println("Task 2.");

        /** 2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
         * значений их длины.*/

        System.out.println(shortest + ", " + mid + ", " + longest); //вариант 1

        String[] arrayStr = {lineOne, lineTwo, lineThree}; // второй вариант, создать массив

        Arrays.sort(arrayStr, Comparator.comparingInt(String::length));// и отсортировать в массиве через компоратор
        System.out.println(Arrays.toString(arrayStr));


        System.out.println("________________________________");

        System.out.println("Task 3.");


        /**3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
         * средней, а также их длину.*/

        int averageLineLenght;

        averageLineLenght = (lineOne.length() + lineTwo.length() + lineThree.length()) / 3;

        System.out.println("Средняя длина строки составляет: " + averageLineLenght);

        for (String s : arrayStr) {
            if (s.length() < averageLineLenght) {
                System.out.println("Длина строки " + s + " составляет " + s.length() + ". И она меньше средней");
            }
        }

        System.out.println("________________________________");

        System.out.println("Task 4.");

        /**4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
         * Если таких слов несколько, найти первое из них.*/

        String duplicateChars = null;

        if (hasUniqueChars(lineOne)) {
            duplicateChars = lineOne;
        } else if (hasUniqueChars(lineTwo)) {
            duplicateChars = lineTwo;
        } else if (hasUniqueChars(lineThree)) {
            duplicateChars = lineThree;
        }

        System.out.println("Слово состоящее из различных символов: " + duplicateChars);


    }

    private static boolean hasUniqueChars(String str) {

        if (str == null && str.length() <= 1) {//если строка пустая или длина меньше одного, то все символы уникальны
            return true;
        }

        //циклы для проверки уникальности каждого символа в строке
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false; //повторяющийся символ найден.
                }
            }
        }
        return true;

    }


}

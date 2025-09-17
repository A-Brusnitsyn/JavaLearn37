package HomeWork11;

import java.util.Scanner;

public class TaskStar {
    public static void main(String[] args) {

        /** Задача *:
         * Дана строка произвольной длины с произвольными словами. Написать программу для
         * проверки является ли любое выбранное слово в строке палиндромом.
         * Например, есть строка, вводится число 3, значит необходимо проверить является ли
         * 3-е слово в этой строке палиндромом.
         * Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций:
         * например, в строке 5 слов, а на вход программе передали число 500.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String line = sc.nextLine();

        String[] words = line.split(" ");

        System.out.printf("Введите номер слова от 1 до %d, узнаем палиндром лм это?\n", words.length);


        if (sc.hasNextInt()) {
            int num = sc.nextInt();

            if (num < 0 || num > words.length) {
                System.out.printf("Неверный номер слова, введите число от 1 до %d.\n", words.length);
            } else {
                if (isPalindrome(words[num - 1])) {
                    System.out.printf("Слово %s является палиндромом\n", words[num - 1]);
                } else {
                    System.out.printf("Слово %s не является палиндромом\n", words[num - 1]);
                }

            }

        } else {
            System.out.println("Введено не число! Повторите попытку.");
        }
        sc.close();

    }

    private static boolean isPalindrome(String word) {
        String lowReg = word.toLowerCase();
        String reverseWord = new StringBuilder(lowReg).reverse().toString();
        return lowReg.equals(reverseWord);

    }
}

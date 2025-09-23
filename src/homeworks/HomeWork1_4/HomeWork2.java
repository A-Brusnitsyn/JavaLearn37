package homeworks.HomeWork1_4;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        /*Задача 1:
        Напишите программу, которая будет принимать на вход число из консоли и на выход
        будет выводить сообщение четное число или нет. Для определения четности числа
        используйте операцию получения остатка от деления (операция выглядит так: '% 2').*/
        System.out.println("Задача 1:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        if (scanner.hasNextInt()) {
            int number2 = scanner.nextInt();
            if (number2 % 2 == 0) {
                System.out.println("Четное");
            } else {
                System.out.println("Нечетное");
            }
        } else {
            System.out.println("Ошибка ввода, попробуйте повторить!");
        }


    /*Задача 2:
    Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
    Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».*/
        System.out.println("Задача 2:");
        scanner.nextLine();

        System.out.println("Введите температуру:");
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            if (t > -5) {
                System.out.println("Warm");
            } else if (t <= -5 && t > -20) {
                System.out.println("Normal");
            } else {
                System.out.println("Cold");
            }
        } else {
            System.out.println("Ошибка ввода, попробуйте повторить!");
        }


       /* Задача 3:
        Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.*/
        System.out.println("Задача 3:");
        for (int i = 10; i <= 20; i++) {
            System.out.println(i * i);
        }

       /* Задача 4:
        Необходимо, чтоб программа выводила на экран вот такую последовательность:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.*/
        System.out.println("Задача 4:");
        int num = 0;
        while (num <= 98) {
            System.out.print(num + " ");
            num += 7;
        }

        /*Задача *:

        Напишите программу, где пользователь вводит любое целое положительное число. А
        программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
        числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
        ввести некорректные данные*/

        System.out.println("\nЗадача *");
        scanner.nextLine();
        System.out.println("Введите целое положительное число");
        if (scanner.hasNextInt()) {
            int num2 = scanner.nextInt();
            if (num2 > 0) {
                int sum2 = 0;
                for (int i = 1; i <= num2; i++) {
                    sum2 += i;
                }
                System.out.println(sum2);
            } else {
                System.out.println("Введено отрицательное число");
            }
        } else {
            System.out.println("Введены неверные данные");
        }
        scanner.close();
    }


}

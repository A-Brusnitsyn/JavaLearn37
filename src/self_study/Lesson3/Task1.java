package self_study.Lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Задача 1:
        //Ввести с клавиатуры два целых числа. Если Число1 четное, вывести произведение двух чисел (пр.1), если нет - частное (пр.2).
        //Также если числа равны - вывести надпись Числа равны!
        //пр1.: Число1 * Число2 = Произведение, где число1 - значение 1-го числа, число2 - значение 2-го числа, Произведение - результат умножения.
        //пр2.: Число1 / Число2 = Частное, где число1 - значение 1-го числа, число2 - значение 2-го числа, Частное - результат деления.
        //Помните, что в Java результатом деления двух целых чисел будет целое число.

        int a = 5;
        int b = 1;

        int c = a++ - 3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = sc.nextInt();
        int res;

        if (num1 % 2 == 0) {
            res = num1 * num2;
            System.out.println("Результат умножения чисел: " + res);
        } else if (num1 % 2 != 0 && num1 != num2) {
            System.out.println("Результат деления чисел: " + ((double) num1 / num2));
        } else if (num1 == num2) {
            System.out.println("Числа равны.");
        }
        sc.close();
    }
}

package CodeTraining.Lesson4.Cycles;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        //Задача 1:
        //Ввести с клавиатуры целое число. Вывести в консоль его факториал.

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = sc.nextInt();
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        System.out.println(res);

        //Задача 2:
        //Ввести с клавиатуры целое число. Вывести в консоль сумму цифр введенного числа.

        System.out.println("Введите число еще раз:");
        int num2 = sc.nextInt();

        int i = 0;
        int res2 = 0;
        while (i <= num2) {
            res2 += i;
            i++;
        }
        System.out.println(res2);
        sc.close();

    }
}

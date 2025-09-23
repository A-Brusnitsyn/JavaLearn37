package self_study.Lesson4.Cycles;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Задача 4:
        //Ввести с клавиатуры целое число (Число 2). Для каждого из чисел от 1 до 10 выполнить:
        //Если Число1 четное, вывести сумму двух чисел (пр.1), если нет - разность (пр.2). Также если числа равны -
        // вывести надпись Числа равны!.
        //пр1.: Число1 + Число2 = Сумма, где Число1 - значение 1-го числа (от 1 до 10), Число2 - значение введенного с
        // клавиатуры числа, Сумма - результат сложения.
        //пр2.: Число1 - Число2 = Разность, где Число1 - значение 1-го числа (от 1 до 10), Число2 - значение введенного
        // с клавиатуры числа, Разность - результат вычитания.

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                int result = i + num;
                System.out.printf("%d + %d = %d\n", i, num, result);
            } else {
                int result = i - num;
                System.out.printf("%d - %d = %d\n", i, num, result);
            }

            if (i == num) {
                System.out.println("Числа равны!");
            }
        }

        sc.close();
    }
}

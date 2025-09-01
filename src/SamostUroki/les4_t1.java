package SamostUroki;

import java.util.Scanner;

public class les4_t1 {
    public static void main(String[] args) {
        // №1 Ввести с клавиатуры целое число. Вывести в консоль его факториал.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number < 0) {
            System.out.println("Факториал не возможно рассчитать для отрицательных чисел!");
        } else {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            System.out.println("Факториал числа " + number + " равен " + result);
        }
    }
}

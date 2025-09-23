package self_study.Lesson6.Methods;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int num1 = sc.nextInt();
        System.out.print("Введите число 2: ");
        int num2 = sc.nextInt();

        if (num1 % 2 == 0 || num2 % 3 == 0) {
            if (num1 > num2) {
                System.out.println(num1 + " больше числа " + num2);
            } else if (num1 < num2) {
                System.out.println(num1 + " меньше числа " + num2);
            } else {
                System.out.println(num1 == num2);
            }
        }

        kratnoe(num1, num2);
        sc.close();
    }

    static void kratnoe(int a, int b) {
        if (a % 2 == 0 && a % 3 == 0) {
            if (Math.pow(a, b) > Integer.MAX_VALUE || Math.pow(a, b) < Integer.MIN_VALUE) {
                System.out.println("Результат выходит за пределы типа int");
            } else {
                System.out.println("Число " + a + " в степени " + b + " равно " + Math.pow(a, b));
            }
        }

    }
}

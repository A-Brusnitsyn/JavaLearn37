package SamostUroki;

import java.util.Scanner;

public class lesson003_t1 {
    public static void main(String[] args) {
        //Ввести с клавиатуры два целых числа. Если Число1 четное, вывести произведение двух чисел (пр.1),
        // если нет - частное (пр.2). Также если числа равны - вывести надпись Числа равны!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println(a * b);
        } else {
            System.out.println(a / b);
        }
        if (a==b){
            System.out.println("Числа равны");
        }
        scanner.close();
    }
}

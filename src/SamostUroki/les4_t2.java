package SamostUroki;

import java.util.Scanner;

public class les4_t2 {
    public static void main(String[] args) {
        //No 2. Ввести с клавиатуры целое число. Вывести в консоль сумму цифр введенного числа.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое ЧИСЛО");
        int sum = 0;
        int num = scanner.nextInt();
        scanner.close();
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.printf("Сумма цифр числа равна %d", sum);
    }
}

package homeworks.HomeWork5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /*Задача 1:
        1.1 Создать двумерный массив, заполнить его случайными числами.
        1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
        1.3 Найти сумму всех получившихся элементов и вывести в консоль*/
        System.out.println("Task 1: ");
        int[][] array = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(0, 15);
            }

        }
        System.out.println("Array is filled with numbers: " + Arrays.deepToString(array));
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            //array[i]=array[i+ scanner.nextInt()];
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter number: ");
                array[i][j] = array[i][j] + scanner.nextInt();
                sum = array[i][j] + sum;
            }

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
        System.out.println("Сумма всех значений в массиве: " + sum);

        /*Задача 3:
        Найдите сумму элементов на главной диагонали*/
        int sumMain = 0;
        int sumPob = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sumMain += array[i][j];
                }
                if (i + j == array.length - 1) {
                    sumPob += array[i][j];
                }
            }
        }
        System.out.println("Сумма значений на главной диагонали: " + sumMain);
        System.out.println("Сумма значений на побочной диагонали: " + sumPob);

    }
}

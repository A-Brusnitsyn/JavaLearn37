package HomeWorks5;

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
        System.out.println(Arrays.deepToString(array));
        System.out.println("Сумма всех значений в массиве: " + sum);
    }
}

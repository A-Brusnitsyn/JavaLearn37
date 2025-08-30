package HomeWorks5;

import java.util.Scanner;

public class TaskStar {
    public static void main(String[] args) {
        /*Задача *:
        Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
                Формат входных данных:
        Программа получает на вход два числа n и m.
                Формат выходных данных:
        Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
        символа.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter columns: ");
        int columns = scanner.nextInt();
        int[][] arrSnake = new int[rows][columns];

        for (int i = 0; i < arrSnake.length; i++) {


        }
        for (int i = 0; i < arrSnake.length; i++) {
            for (int j = 0; j < arrSnake[i].length; j++) {
                System.out.println(arrSnake[i][j] + " ");
            }
            System.out.println();
        }

    }
}

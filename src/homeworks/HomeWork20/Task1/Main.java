package homeworks.HomeWork20.Task1;

import java.util.Scanner;

/*Задача 1:
Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
вычислений возвращаются в метод main().*/
public class Main {
    public static void main(String[] args) {
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        MaxFinder maxFinder = new MaxFinder(array);
        MinFinder minFinder = new MinFinder(array);

        maxFinder.run();
        minFinder.run();

        System.out.println(minFinder.getMin());
        System.out.println(maxFinder.getMax());
    }
}

package HomeWorks;


import java.util.Arrays;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
       /* Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
        массива (просто целое число). После того как размер массива задан, заполнить его
        одним из двух способов: используя Math.random(), или каждый элемент массива вводится
        пользователем вручную. Попробовать оба варианта. После заполнения массива
        данными, решить для него следующие задачи:
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int arraySize = scanner.nextInt();
        int[] numbers = new int[arraySize];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        /*Задача 1:
        Пройти по массиву, вывести все элементы в прямом и в обратном порядке.*/
        System.out.println("Задача 1:");
        System.out.println("Массив в прямом порядке:");
        for (int i : numbers) {
            System.out.println(i);
        }
        System.out.println("И в обратном:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        scanner.close();
        /*Задача 2:
        Найти минимальный-максимальный элементы и вывести в консоль*/
        System.out.println("Задача 2:");
        System.out.println("Вариант 1:");
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length ; i++) {
            if (numbers[i]> max){
                max=numbers[i];
            }
            if (numbers[i]<min){
                min=numbers[i];
            }

        }
        System.out.println("Минимальное значение:" + min + " Максимальное значение: " + max);

        System.out.println("Вариант 2:");
        Arrays.sort(numbers);
        System.out.println("Минимальное значение массива: " + numbers[0]);
        System.out.println("Максимальное значение массива: " + numbers[numbers.length-1]);

    }

}


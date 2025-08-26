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
        Задача 1:
        Пройти по массиву, вывести все элементы в прямом и в обратном порядке.*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int arraySize = scanner.nextInt();
        int [] numbers = new int[arraySize];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=(int) (Math.random()*100);
        }
        System.out.println("Созданный массив"+ Arrays.toString(numbers));

        }
}


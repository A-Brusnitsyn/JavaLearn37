package HomeWorks;


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
        int [] numbers = new int[arraySize];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=(int) (Math.random()*100);
        }
    /*Задача 1:
    Пройти по массиву, вывести все элементы в прямом и в обратном порядке.*/
        System.out.println("Задача 1:");
        System.out.println("Массив в прямом порядке:");
        for (int i:numbers){
            System.out.println(i);
        }
        System.out.println("И в обратном:");
        for (int i = numbers.length-1; i >=0 ; i--) {
            System.out.println(numbers[i]);

        }
    }

}


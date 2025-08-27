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
        System.out.println("Массив в прямом порядке: ");
        for (int i : numbers) {
            System.out.print(i+ " ");
        }
        System.out.println("\nИ в обратном:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        /*Задача 2:
        Найти минимальный-максимальный элементы и вывести в консоль*/
        System.out.println("\nЗадача 2:");
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.printf("Минимальное значение: %d Максимальное значение: %d \n", min, max);

        /*System.out.println("Вариант 2:");
        Arrays.sort(numbers);
        System.out.println("Минимальное значение массива: " + numbers[0]);
        System.out.println("Максимальное значение массива: " + numbers[numbers.length - 1]);*/

        /*Задача 3:
        Найти индексы минимального и максимального элементов и вывести в консоль.*/
        System.out.println("Задача 3:");
        int maxI = 0;
        int minI = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxI]) {
                maxI = i;
            }
            if (numbers[i] < numbers[minI]) {
                minI = i;
            }
        }
        System.out.println("Мин.индекс: " + minI + " Макс.индекс: " + maxI);

        /*Задача 4:
        Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
        сообщение, что их нет.*/
        System.out.println("Задача 4:");

        System.out.println("Введите размер массива");
        int arraySize2 = scanner.nextInt();
        int[] numbers2 = new int[arraySize2];
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print("Введите элемент массива: ");
            numbers2[i] = scanner.nextInt();
        }
        System.out.println("Массив: " + Arrays.toString(numbers2));
        int zero = 0;
        for (int i =0; i< numbers2.length;i++) {
            if (numbers2[i] == 0) {
                zero++;
            }
        }if (zero==0){
            System.out.println("Нулевых значение нет");
        }else System.out.println("Количество нолей в массиве: " + zero);
        scanner.close();

        /*Задача 5:
        Пройти по массиву и поменять местами элементы первый и последний, второй и
        предпоследний и т.д.*/
        System.out.println("Задача 5:");
        int a =0;
        int b =0;
        for (int i =0,j=numbers2.length-1; i<numbers2.length/2; i++,j--) {
            a=numbers2[i];
            b=numbers2[j];
            numbers2[i]=b;
            numbers2[j]=a;
        }
        System.out.println(Arrays.toString(numbers2));



    }


}


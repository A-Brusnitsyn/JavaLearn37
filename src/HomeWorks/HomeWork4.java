package HomeWorks;


import java.util.Arrays;
import java.util.Random;
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
            System.out.print(i + " ");
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
        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] == 0) {
                zero++;
            }
        }
        if (zero == 0) {
            System.out.println("Нулевых значение нет");
        } else System.out.println("Количество нолей в массиве: " + zero);


        /*Задача 5:
        Пройти по массиву и поменять местами элементы первый и последний, второй и
        предпоследний и т.д.*/
        System.out.println("Задача 5:");
        int a = 0;
        int b = 0;
        for (int i = 0, j = numbers2.length - 1; i < numbers2.length / 2; i++, j--) {
            a = numbers2[i];
            b = numbers2[j];
            numbers2[i] = b;
            numbers2[j] = a;
        }
        System.out.println(Arrays.toString(numbers2));

        /*Задача 6:
        Проверить, является ли массив возрастающей последовательностью (каждое следующее
        число больше предыдущего).*/
        for (int i = 1; i < numbers2.length - 1; i++) {
            if (numbers2[i] > numbers2[i + 1]) {
                System.out.println("Массив не является возрастающей последовательностью");
                break;
            }
        }

        /*Задача *:
        Имеется массив из неотрицательных чисел(любой). Представьте что массив
        представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
        добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
        содержит нуля в начале, кроме самого числа 0.
        Пример:
        Input: [1,4,0,5,6,3]
        Output: [1,4,0,5,6,4]
        Input: [9,9,9]
        Output: [1,0,0,0]*/


        //Думал над задачей, но не мог разобраться с тем как быть с массивом из 9...подглядел решение в домашках одногрупников и потом как понял...)
        //в else if если значение массива =9 заменяем на 0, и так по всем значениям (в случае если массив только из 9)
        //а потом в другом блоке if проверяем первое значение массива, и если оно =0, то добавляем к текущему массиву 1 и 0 заменяем на 1.

        System.out.println("Задача *:");
        System.out.println("Введите размер массива для последней задачи:");

        int arraySize3 = scanner.nextInt();
        int[] array1 = new int[arraySize3];
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i]= random.nextInt(4,10);
        }
        System.out.println("Новый массив: "+ Arrays.toString(array1));

        for (int i = array1.length-1; i >=0; i--) {
            if (array1[i]<9){
                array1[i]++;
                break;
            } else if (array1[i]==9) {
                array1[i]=0;
            }
        }
        if (array1[0]==0){
            array1=new int[array1.length+1];
            array1[0]=1;

        }
        scanner.close();
        System.out.println(Arrays.toString(array1));


    }


}


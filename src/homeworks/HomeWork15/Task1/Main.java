package homeworks.HomeWork15.Task1;

//Задача 1:
//Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
//4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
//При решении использовать коллекции.

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        System.out.println("Введите числа через запятую:");
        line = sc.nextLine();

        String[] splittedLine = line.split(",");
        sc.close();

        HashSet<Double> numbers = new HashSet<>();

        for (String num : splittedLine) {
            numbers.add(Double.parseDouble(num.trim()));
        }

        System.out.println(numbers);
    }
}

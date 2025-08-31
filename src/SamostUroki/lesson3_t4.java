package SamostUroki;

import java.util.Scanner;
import java.util.SortedMap;

public class lesson3_t4 {
    public static void main(String[] args) {
        /*Введите с клавиатуры два целых числа. Если первое – четное ИЛИ второе – кратно трем, выведите в консоль
        результат сравнения этих чисел в любом формате. Например, Число1 больше Числа2. Или true (если числа равны) и false - если нет.
        Если первое число кратно и двум, и трем – также выведите на экран число один, возведенное в степень N, где N – второе число.
        Для возведения в степень можно использовать Math.pow(). В случае, если результат выражения выходит за пределы
        типа int (допустимые значения - [-2147483648; 2147483647]) – вывести сообщение Результат выражения слишком большой!.
        Также минимальное и максимальное значение int содержится в константах Integer.MIN_VALUE и Integer.MAX_VALUE соответственно.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num1 = scanner.nextInt();
        System.out.println("Введите число: ");
        int num2 = scanner.nextInt();
        if (num1%2==0 || num2%3==0){
            System.out.println("Первое число больше второго?");
            System.out.println(num1>num2);
        }
        double result = Math.pow(num1,num2);
        if (num1%2==0 && num1%3==0) {
            System.out.println(num1 + " в степени " + num2 + " равно " + result);
        }
        if (result>Integer.MAX_VALUE || result<Integer.MIN_VALUE){
            System.out.println("Число слишком большое");
        }else
            System.out.println((int) result);
    }

}

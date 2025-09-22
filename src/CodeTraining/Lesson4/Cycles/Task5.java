package CodeTraining.Lesson4.Cycles;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Задача 5:
        //Выводить на экран Не угадал! до тех пор, пока с клавиатуры не будет введено число 1. Запрашивать число с клавиатуры:
        //Вариант 1: перед выводом на экран Не угадал!
        //Вариант 2: после вывода на экран Не угадал!
        //Подумать, где стоило бы использовать цикл do-while, а где – нет.

        Scanner sc= new Scanner(System.in);

        while (sc.nextInt()!=1){
            System.out.println("Не угадал!");
        }
        System.out.println("Угадал!");


    }
}

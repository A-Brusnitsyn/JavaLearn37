package CodeTraining.Lesson4.Cycles;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Задача 3:
        //Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа). Нарисовать в консоли
        //заданный прямоугольник, используя - и |. Углы прямоугольника обозначить символом (пробел). Каждая единица
        //длины должна обозначаться одним символом -, каждая единица ширины – символом |.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника: ");
        int lenght = sc.nextInt();
        System.out.println("Введите ширину прямоугольника: ");
        int width = sc.nextInt();

        String len = " ";
        String wid = "";
        String space = "";

        for (int i = 1; i <= lenght; i++) {
            len += "-";
            space += " ";
        }
        for (int i = 1; i <= width; i++) {
            wid += "\n|" + space + "|";
        }
        System.out.println(len + wid + "\n" + len);
    }
}

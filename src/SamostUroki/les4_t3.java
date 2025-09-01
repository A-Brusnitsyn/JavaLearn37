package SamostUroki;

import java.util.Scanner;

public class les4_t3 {
    public static void main(String[] args) {
        //No 3. Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа). Нарисовать в консоли
        // заданный прямоугольник, используя - и |. Углы прямоугольника обозначить символом
        // (пробел). Каждая единица длины должна обозначаться одним символом -, каждая единица ширины – символом |.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника:");
        int dlina = scanner.nextInt();
        System.out.println("Введите ширину прямоугольника:");
        int shir = scanner.nextInt();
        String dl2 = " ";
        String sh2 = "|";
        String sh3 = "";
        if (dlina <= 0 || shir <= 0) {
            System.out.println("Неверные параметры");
        }
        for (int i = 0; i < dlina; i++) {
            dl2 += "-";
            sh2 += " ";
        }
        sh2+="|\n";
        //System.out.println(dl2);
        for (int i = 0; i < shir; i++) {
            sh3 += sh2;
        }
        System.out.println(dl2+"\n"+sh3+dl2);
    }
}

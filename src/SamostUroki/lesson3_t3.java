package SamostUroki;

import java.util.Scanner;

public class lesson3_t3 {
    public static void main(String[] args) {
        /*Заведите три переменные типа String. С клавиатуры введите в них вашу фамилию, имя и отчество соответственно. Выведите в консоль ваше ФИО в одну строку.
        Реализуйте, используя:
        System.out.println()
        System.out.printf()*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite familiyu: ");
        String f = scanner.nextLine();
        System.out.println("Vvedite imya: ");
        String name = scanner.nextLine();
        System.out.println("Vvedite otchestvo: ");
        String otche = scanner.nextLine();
        System.out.println(f + " " + name + " " + otche);
        System.out.printf("%s %s %s", f, name, otche);
    }
}

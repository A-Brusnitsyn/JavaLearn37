package self_study.Lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Заведите три переменные типа String. С клавиатуры введите в них вашу фамилию, имя и отчество соответственно.
        // Выведите в консоль ваше ФИО в одну строку.
        //Реализуйте, используя:
        //System.out.println()
        //System.out.printf()

        Scanner sc = new Scanner(System.in);
        String firstName;
        String otchectvo;
        String lastName;

        System.out.print("Введите имя: ");
        firstName = sc.nextLine();
        System.out.print("Введите отчество: ");
        otchectvo = sc.nextLine();
        System.out.print("Введите фамилию: ");
        lastName = sc.nextLine();

        System.out.println(firstName + " " + otchectvo + " " + lastName);
        System.out.printf("Имя %s, отчество %s, фамилия %s.", firstName, otchectvo, lastName);

    }
}

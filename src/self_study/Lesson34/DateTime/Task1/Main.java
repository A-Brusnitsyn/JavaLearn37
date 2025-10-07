package self_study.Lesson34.DateTime.Task1;

//Задача 1:
//Реализуйте метод, возвращающий объект LocalDateTime на основании переданной строки.
// Пример входящей строки: 20.12.2022 20:16:00.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату и время, например '20.12.2022 20:16:00'");
        String date = sc.nextLine();
        sc.close();

        System.out.println(time(date));
    }

    static LocalDateTime time(String date) {
        return LocalDateTime.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
    }
}

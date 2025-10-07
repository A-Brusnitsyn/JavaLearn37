package self_study.Lesson34.DateTime.Task2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Задача 2:
//Реализуйте программу, выводящую в консоль сообщение, являются ли введенные с клавиатуры дата и
//время больше или меньше текущего. Формат вводимых даты и времени рекомендую взять из Задачи 1.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату и время, например '20.12.2022 20:16:00'");
        String inputDate = sc.nextLine();
        sc.close();
        LocalDateTime date = LocalDateTime.parse(inputDate, DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));

        if (date.isAfter(LocalDateTime.now())) {
            System.out.println("Время еще не настало!");
        } else if (date.isBefore(LocalDateTime.now())) {
            System.out.println("Это время прошло...");
        } else {
            System.out.println("Текущее время" + date);
        }
    }
}

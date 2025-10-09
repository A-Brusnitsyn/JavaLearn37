package homeworks.HomeWork17;

//Задача 1:
//Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
//когда пользователю исполнится 100 лет. Использовать Date/Time API.

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthdayDateT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату рождения в формате дд/мм/гггг:");
        String bDay = sc.nextLine();
        sc.close();
        LocalDate bdDate = LocalDate.parse(bDay, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate oneHundredYears = bdDate.plus(1, ChronoUnit.CENTURIES);
        System.out.println("Сто лет исполнится - " + oneHundredYears);
        Period period = Period.between(oneHundredYears, LocalDate.now());
        System.out.println("Это случится через:" + period.getYears() + " лет " + period.getMonths() + " месяцев " + period.getDays() + " дней");
    }
}

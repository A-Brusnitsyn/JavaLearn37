package self_study.Lesson34.DateTime.Task3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

//Задача 3:
//Реализуйте программу, выводящую в консоль количество времени между двумя введенными с клавиатуры датами и
//временем в секундах, минутах, часах, днях, месяцах и годах.
//
//Пример ввода:
//
//20.12.2022 20:16:00
//28.06.1932 02:51:56
//Пример вывода:
//
//Seconds: 2855323444
//Minutes: 47588724
//Hours: 793145
//Days: 33047
//Months: 1085
//Years: 90
//Summary: 90 years, 5 months, 22 days, 17 hours 24 minutes 4 seconds
//
//Примечание: данная задача не предполагает реализацию через наследников интерфейса TemporalAmount.
// Однако вы можете использовать их для альтернативного решения.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();
        scanner.close();

        LocalDateTime dateTime1 = LocalDateTime.parse(firstInput, formatter);
        LocalDateTime dateTime2 = LocalDateTime.parse(secondInput, formatter);

        if (dateTime2.isAfter(dateTime1)) {
            LocalDateTime temp = dateTime1;
            dateTime1 = dateTime2;
            dateTime2 = temp;
        }

        // Разница в различных единицах
        long seconds = ChronoUnit.SECONDS.between(dateTime2, dateTime1);
        long minutes = ChronoUnit.MINUTES.between(dateTime2, dateTime1);
        long hours = ChronoUnit.HOURS.between(dateTime2, dateTime1);
        long days = ChronoUnit.DAYS.between(dateTime2, dateTime1);
        long months = ChronoUnit.MONTHS.between(dateTime2, dateTime1);
        long years = ChronoUnit.YEARS.between(dateTime2, dateTime1);

        // Подробная разница (для Summary)
        Period period = Period.between(dateTime2.toLocalDate(), dateTime1.toLocalDate());
        LocalDateTime tempDateTime = dateTime2.plusYears(period.getYears())
                .plusMonths(period.getMonths())
                .plusDays(period.getDays());
        Duration duration = Duration.between(tempDateTime, dateTime1);

        long remainingHours = duration.toHours();
        long remainingMinutes = duration.toMinutesPart();
        long remainingSeconds = duration.toSecondsPart();

        // Вывод результатов
        System.out.println("Seconds: " + seconds);
        System.out.println("Minutes: " + minutes);
        System.out.println("Hours: " + hours);
        System.out.println("Days: " + days);
        System.out.println("Months: " + months);
        System.out.println("Years: " + years);

        System.out.printf(
                "Summary: %d years, %d months, %d days, %d hours %d minutes %d seconds%n",
                period.getYears(), period.getMonths(), period.getDays(),
                remainingHours, remainingMinutes, remainingSeconds
        );
    }
}

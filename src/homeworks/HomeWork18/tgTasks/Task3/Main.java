package homeworks.HomeWork18.tgTasks.Task3;

//3. Подсчёт количества уникальных слов
//Дан список строк List<String> lines. Нужно посчитать количество уникальных слов (без учёта регистра).
//Input:
//List<String> lines = List.of(
//        "Stream API is powerful",
//        "Java stream is powerful",
//        "Powerful tools in Java"
//);

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lines = List.of(
                "Stream API is powerful",
                "Java stream is powerful",
                "Powerful tools in Java");

        long count = lines.stream()
                .flatMap(word -> Arrays.stream(word.split(" ")))
                .map(word -> word.toLowerCase())
                .distinct()
                .count();
        System.out.println(count);
    }
}

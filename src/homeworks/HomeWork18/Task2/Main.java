package homeworks.HomeWork18.Task2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Создать набор данных в формате id-name, сохраненный в Мар. Необходимо отобрать из
 * этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
 * Среди отобранных значений отобрать только те, которые имеют нечетное количество
 * букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.v
 */

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Билл");
        map.put(2, "Дон");
        map.put(3, "Фред");
        map.put(4, "Боб");
        map.put(5, "Саманта");
        map.put(6, "Аманда");
        map.put(7, "Майк");
        map.put(8, "Джони");
        map.put(9, "Роза");
        map.put(10, "Джеки");
        map.put(11, "Клава");
        map.put(12, "Галя");
        map.put(13, "Марго");

        List<Integer> allowedId = List.of(1, 2, 5, 8, 9, 13);
        List<String> sortedList = map.entrySet().stream()
                .filter(n -> allowedId.contains(n.getKey()))
                .filter(s -> s.getValue().length() % 2 != 0)
                .map(e -> new StringBuilder(e.getValue()).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(sortedList);

    }
}

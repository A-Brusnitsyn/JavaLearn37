package homeworks.HomeWork18.Task1;

import java.util.ArrayList;
import java.util.List;

/**
 Задача 1:
 Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
 Stream'oB:
 - Удалить дубликаты
 - Оставить только четные элементы
 - Вывести сумму оставшихся элементов в стриме
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(55);
        numbers.add(55);
        numbers.add(5);
        numbers.add(8);
        numbers.add(8);
        numbers.add(7);
        numbers.add(12);

        int sum = numbers.stream()
                .distinct() //удалить дубликаты
                .filter(n-> n%2==0) // только четные эл-ты
                .mapToInt(Integer::intValue) // преобразование в IntStream
                .sum();

        System.out.println("Сумма элементов массива после обработки составляет " + sum);
    }
}

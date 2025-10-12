package homeworks.HomeWork18.tgTasks.Task2;

//2. Сумма чисел, кратных 3 или 5
//Дан список List<Integer> numbers. Найти сумму всех чисел, кратных 3 или 5.

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 5, 6, 7, 8, 9, 15, 18, 19, 25, 28);
        int sum = list.stream()
                .filter(num -> num % 3 == 0 || num % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}

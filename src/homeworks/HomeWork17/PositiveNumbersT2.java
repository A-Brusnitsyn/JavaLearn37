package homeworks.HomeWork17;

//Задача 2:
//Используя Predicate среди массива чисел вывести только те, которые являются
//положительными.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class PositiveNumbersT2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(random.nextInt(-50, 50));
        numbers.add(random.nextInt(-50, 50));
        numbers.add(random.nextInt(-50, 50));
        numbers.add(random.nextInt(-50, 50));
        numbers.add(random.nextInt(-50, 50));
        numbers.add(random.nextInt(-50, 50));
        numbers.add(random.nextInt(-50, 50));
        numbers.add(random.nextInt(-50, 50));
        System.out.println(numbers);
        Predicate<Integer> isPos = i -> i > 0;
        System.out.println(isPositiv(numbers, isPos));
    }

    public static List<Integer> isPositiv(List<Integer> input, Predicate isPos) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : input) {
            if (isPos.test(num)) {
                result.add(num);
            }
        }
        return result;
    }
}

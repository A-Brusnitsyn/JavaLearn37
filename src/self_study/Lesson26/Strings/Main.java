package self_study.Lesson26.Strings;

//Реализуйте программу, принимающую с клавиатуры строку, содержащую слова, разделенные пробелом. Выведите в консоль
// количество уникальных слов в строке. Учтите, что строка может начинаться с пробела.
//Пример:
//Мама мыла раму мама рамы мыла. Пример строки
//В данном случае будем считать, что уникальных слов 6: мама, мыла, раму, рамы, пример, строки.
//Для упрощения допустим, что в строке не могут использоваться символы, отличные от пробела или русских/английский букв.
// Помните, что слово может быть введено в разных регистрах.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст:");
        String line = sc.nextLine();
        String[] arrLine =line.replace(".","").split(" ");
        System.out.println(Arrays.toString(arrLine));

        StringBuilder uniqueBuilder = new StringBuilder();

        for (String word : arrLine) {
            // Чтобы правильно искать, добавляем пробелы по краям
            String check = " " + word + " ";
            if (uniqueBuilder.indexOf(check) == -1) {
                uniqueBuilder.append(word).append(" ");
            }
        }

        // Преобразуем в массив уникальных слов
        String[] unique = uniqueBuilder.toString().trim().split("\\s+");

        System.out.println("Количество уникальных слов: " + unique.length);
        System.out.println("Уникальные слова:");
        for (String word : unique) {
            System.out.println(word);
        }
    }
}

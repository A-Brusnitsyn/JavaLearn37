package homeworks.HomeWork20.LessonsTasks;

//5. Сжатие и распаковка строк
//Условие: Реализуйте методы для сжатия (aaaabbc → a4b2c1) и распаковки (a3b2 → aaabb).

public class Task5 {
    public static void main(String[] args) {

        String original = "aaaabbc";
        String compressed = compress(original);
        System.out.println("Сжатие: " + original + " → " + compressed);

        String packed = "a3b2c1";
        String unpacked = decompress(packed);
        System.out.println("Распаковка: " + packed + " → " + unpacked);

        String test1 = "aaabbbcccddd";
        String test2 = "a1b2c3d4";
        System.out.println("Сжатие: " + test1 + " → " + compress(test1));
        System.out.println("Распаковка: " + test2 + " → " + decompress(test2));
    }

    // Метод для сжатия строки (aaaabbc → a4b2c1)
    public static String compress(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            // Если следующий символ такой же, увеличиваем счетчик
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // Добавляем символ и его количество
                result.append(str.charAt(i)).append(count);
                count = 1; // Сбрасываем счетчик
            }
        }

        return result.toString();
    }

    // Метод для распаковки строки (a3b2 → aaabb)
    public static String decompress(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            // Берем символ
            char currentChar = str.charAt(i);
            i++;

            StringBuilder numberStr = new StringBuilder();
            while (i < str.length() && Character.isDigit(str.charAt(i))) {
                numberStr.append(str.charAt(i));
                i++;
            }

            int count = Integer.parseInt(numberStr.toString());
            for (int j = 0; j < count; j++) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}


package homeworks.HomeWork20.LessonsTasks;

import java.util.HashMap;

public class Task6 {
    public static void main(String[] args) {
        String[] tests = {"aab", "code", "lolipop", "git", "java", "aabb"};

        for (String test : tests) {
            boolean result = canPermuteToPalindrome(test);
            System.out.println("\"" + test + "\" → " + result);
        }
    }

    public static boolean canPermuteToPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }

        // Подсчитываем частоту каждого символа
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Считаем количество символов с нечетной частотой
        int oddCount = 0;
        for (int count : charCount.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // Для палиндрома может быть не более одного символа с нечетной частотой
        return oddCount <= 1;
    }
}


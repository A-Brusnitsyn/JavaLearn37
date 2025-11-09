package homeworks.HomeWork20.LessonsTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//4. Группировка анаграмм
//Условие: Сгруппируйте слова-анаграммы вместе.
//Пример: ["eat","tea","tan","ate","nat","bat"] → [["eat","tea","ate"],["tan","nat"],["bat"]]

public class Task4 {
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> groups = new HashMap<>();

        for (String word : input) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);

            if (!groups.containsKey(sortedKey)) {
                groups.put(sortedKey, new ArrayList<>());
            }
            groups.get(sortedKey).add(word);
        }
        List<List<String>> result = new ArrayList<>(groups.values());
        System.out.println(result);
    }
}

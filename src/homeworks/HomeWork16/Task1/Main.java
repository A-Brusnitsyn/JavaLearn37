package homeworks.HomeWork16.Task1;

import java.util.HashMap;

//На вход поступает массив строк, верните Map<String, Boolean> где каждая отдельная строка является ключом,
//а ее значение равно true если эта строка встречается в массиве 2 или более раз.Пример:
//wordMultiple(["a","b","a","c","b"])->{"a":true, "b"true, "c":false}
public class Main {
    public static void main(String[] args) {
        String[] wordMultiple = {"a", "b", "c", "a", "b", "b", "d"};

        HashMap<String, Boolean> mapMultiple = new HashMap<>();

        for (String word : wordMultiple) {
            if (mapMultiple.containsKey(word)) {
                mapMultiple.put(word, true);
            } else {
                mapMultiple.put(word, false);
            }
        }
        System.out.println(mapMultiple);
    }
}

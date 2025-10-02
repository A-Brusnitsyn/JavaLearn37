package homeworks.HomeWork16.Task2;

import java.util.HashMap;

//На вход поступает массив не пустых строк, создайте и верните Map<String, String> следующим образом:
//для каждой строки добавьте ее первый символ в качестве ключа, последний в качестве значения. Пример:
//pairs(["code","bug"])->{"c":"e", "b":"g"}
//pairs(["man","moon","main"])->{"m":"n"}
public class Main {
    public static void main(String[] args) {
        String[] pairs = {"code", "bug", "man", "moon", "main", "lol"};
        HashMap<String, String> mapPairs = new HashMap<>();

        for (String words : pairs) {
            mapPairs.put(words.substring(0, 1), words.substring(words.length() - 1));
        }
        System.out.println(mapPairs);
    }
}

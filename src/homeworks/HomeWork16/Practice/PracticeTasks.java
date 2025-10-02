package homeworks.HomeWork16.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeTasks {
    public static void main(String[] args) {
        System.out.println("Задача 2:");
        //Задача 2: "Сломанный телефон"
        //Условие: У нас есть телефонная книга в виде HashMap (String(имя) -> Integer(номер)).
        //Нужно создать обратную мапу (Integer(номер) -> String(имя)).

        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Джони", 555);
        phonebook.put("Джессика", 454_324);
        phonebook.put("Дездемона", 92945);
        phonebook.put("Декстер", 97928);
        phonebook.put("Дональд", 12586);
        System.out.println(phonebook);

        HashMap<Integer, String> phonebook2 = new HashMap<>();

        for (Map.Entry<String, Integer> element : phonebook.entrySet()) {
            phonebook2.put(element.getValue(), element.getKey());
        }

        System.out.println(phonebook2);
        System.out.println("-------------------");
        System.out.println("Задача 3:");
        //Задача 3: "Поиск пропущенного числа"
        //Условие: Дан массив чисел от 1 до 10, где одно число пропущено. Найдите его.
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(8);
        nums.add(9);
        nums.add(10);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(1);
        nums2.add(2);
        nums2.add(3);
        nums2.add(4);
        nums2.add(5);
        nums2.add(6);
        nums2.add(7);
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        int sumNums = 0;
        for (int num : nums) {
            sumNums += num;
        }
        int sumNums2 = 0;
        for (int num : nums2) {
            sumNums2 += num;
        }
        int difference = sumNums2 - sumNums;
        System.out.println("В массиве не хватает числа - " + difference);
        System.out.println("-------------------");
        System.out.println("Задача 4:");
        /*
         Задача 4: "Группировка по длине слова"
         Условие: на вход массив из слов, нужно создать мапу которая хранит [3] ->[кот, ток], [4] -> [мода, вода]
         */
        String[] words = {"кот", "дом", "чаша", "стол", "слон", "окно", "программа"};

        Map<Integer, List<String>> lengthToWords = new HashMap<>();

        for (String word : words) {
            int length = word.length();

            // Если ключа еще нет - создаем новый список
            if (!lengthToWords.containsKey(length)) {
                lengthToWords.put(length, new ArrayList<>());
            }
            // Добавляем слово в соответствующий список
            lengthToWords.get(length).add(word);

        }
        System.out.println(lengthToWords);
    }
}

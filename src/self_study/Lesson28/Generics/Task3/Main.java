package self_study.Lesson28.Generics.Task3;

//Задача 3:
//Реализовать класс для работы с массивом. Разработать метод, производящий поиск значения в массиве. Если значение
//не найдено — выбрасывать исключение. Если найдено — возвращать его.

public class Main {
    public static void main(String[] args) {
        String[] stringArr= {"Cat","Dog","Cow","Mouse"};
        ArrWrap<String> arr1=new ArrWrap<>(stringArr);

        try {
            arr1.valueFind("Bear");
        } catch (ValueNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try {
            arr1.valueFind("Mouse");
            System.out.println("Элемент найден: " +arr1.valueFind("Mouse"));
        } catch (ValueNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }
}

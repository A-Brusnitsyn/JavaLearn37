package homeworks.HomeWork15.TaskStar;

/*Задача *:
Представим, что в Java нет коллекции типа ArrayList. Создать свой класс, симулирующий
работу класса динамической коллекции - т.е. создать свою кастомную коллекцию. В
основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных
классов(т.е. это generic).
Предусмотреть операции(методы):
1. добавления элемента
2. удаления элемента
3. получение элемента по индексу
4. проверка есть ли элемент в коллекции
5. очистка всей коллекции
Предусмотреть конструктор без параметров - создает массив размером
по умолчанию. Предусмотреть конструктор с задаваемым размером внутреннего
массива. Предусмотреть возможность автоматического расширения коллекции при
добавлении элемента в том случае, когда коллекция уже заполнена*/

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list); // [A, B, C]
        System.out.println(list.get(1)); // B
        System.out.println(list.contains("D")); // false
        System.out.println(list.size());

        list.remove(0);
        System.out.println(list); // [B, C]


        list.clear();
        System.out.println(list); // []
    }
}
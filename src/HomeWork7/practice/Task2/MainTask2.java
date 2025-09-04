package HomeWork7.practice.Task2;

public class MainTask2 {
    public static void main(String[] args) {

        /*Задача 2:
        Создать класс Person с полями name, age, gender. Поле name сделать public, age
        оставить по дефолту, gender – private. В классе Main создать объект Person.
        Предположить какие поля мы увидим. Продемонстрировать значения полей объекта
        используя геттеры и поля если это возможно.*/

        Person person = new Person();
        //Видны поля без геттера:
        person.name="Джони";
        person.age=25;
        System.out.println(person.name + " уже "+ person.age + " лет!");
        //Вернуть гендер можем через getGender
        System.out.println(person.getGender());
        //Меняем гендер через сеттер
        person.setGender("Эльф");
        person.age=80;
        System.out.println(person.name + " теперь " + person.getGender() + " " + person.age + " уровня!");

    }
}

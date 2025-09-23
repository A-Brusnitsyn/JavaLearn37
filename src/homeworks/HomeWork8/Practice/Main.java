package homeworks.HomeWork8.Practice;

//Практические задачи

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
    }

    static void task1() {
        /*Задача 1:
        1.1 Создать классы Dog, Cat, Main и интерфейс Voice c методом doVoice().
        1.2 В Dog и Cat имплементировать данный интерфейс и реализовать метод doVoice().
        1.3 В классе Main создать объекты Dog, Cat и вызвать метод doVoice().*/

        System.out.println("Practice. Task 1.\n");
        Dog dog = new Dog();
        dog.doVoice();
        Cat cat = new Cat();
        cat.doVoice();
        System.out.println("\n------------------\n");
    }

    static void task2() {
        /*Задача 2:
        Создать абстрактный класс Computer и абстрактный метод getClassName(). Создать
        классы Hp и Mac и отнаследоваться от Computer. Переопределить метод getClassName()
        в классах-наследниках так, чтобы они выводили сообщения «I’m HP» или «I’m Mac». В
        методе main класса Main создать объекты классов Hp Mac и вызвать методы для каждого*/
        System.out.println("Practice. Task 2.\n");
        Computer hp = new Hp();
        hp.getClassName();
        Computer mac = new Mac();
        mac.getClassName();
    }
}

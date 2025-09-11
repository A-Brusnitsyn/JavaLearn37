package HomeWork8.Task1;

/*Блок 2. Домашнее задание
        Задача 1:
Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
который печатает название должности и имплементировать этот метод в созданные
классы.
*/
public class TaskOne {
    public static void main(String[] args) {
        Director dir = new Director();
        dir.getTitle();
        Worker worker = new Worker();
        worker.getTitle();
        Accountant buh = new Accountant();
        buh.getTitle();

    }
}

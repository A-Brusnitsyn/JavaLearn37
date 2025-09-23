package homeworks.HomeWork8.TaskStar;
/*Задача *:
Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable.*/
public class TaskStar {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("Dolly", 5); //создание объекта
        Sheep sheep2 = (Sheep) sheep.clone(); //создание клона

        System.out.println(sheep2.getName()); //печать имени клона
        sheep.setName("Dolly original"); //изменение имени оригинала
        System.out.println(sheep.getName());
        System.out.println(sheep2.getName());



    }
}

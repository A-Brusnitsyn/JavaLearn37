package homeworks.HomeWork10;

/*Задача 1:
Создать класс для описания пользователя системы. Переопределить в классе методы
toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
значением полей и сравнить с помощью метода equals.
Задача *:
Создать программу для реализации поверхностного и глубокого клонирования объекта
класса User. Пусть на вход программе будет передаваться тип операции клонирования
(поверхностное клонирование или глубокое), а также id юзера для клонирования.*/

public class Task1 {
    public static void main(String[] args) throws CloneNotSupportedException {

        User user1 = new User(12, "user1", "us@us.er", new Link("google"));
        User user2 = new User(12, "user1", "us@us.er", new Link("yandex"));
        User user3 = new User(13, "user85", "us@ous.er", new Link("mail"));
        User user4 = new User(12, "user65", "us@us.er", new Link("yahoo"));

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);

        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user3));
        System.out.println(user1.equals(user4));
        System.out.println(user2.equals(user1));

        User copiedUser = (User) user1.clone();
        User deepCopy = user1.deepClone();

        System.out.println("Оригинал: " + user1);
        System.out.println("Обычное клонирование: " + copiedUser);
        System.out.println("Глубокое клонирование: " + deepCopy);

        System.out.println("Меняем Link у user1");
        user1.getLink().setUrl("rambler");

        System.out.println("Оригинал: " + user1);
        System.out.println("Обычное клонирование: " + copiedUser);
        System.out.println("Глубокое клонирование: " + deepCopy);

    }
}

package homeworks.HomeWork6.Task1;

public class MainTask1 {
    public static void main(String[] args) {
        /*Задача 1:
        Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
        метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
        который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
        выводит текущую информацию о карточке. Напишите программу, которая создает три
        объекта класса CreditCard у которых заданы номер счета и начальная сумма.
        Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
        третьей. Выведите на экран текущее состояние всех трех карточек*/

        CreditCard card = new CreditCard(1,5.3);
        CreditCard card2 = new CreditCard(2,76);
        CreditCard card3 = new CreditCard(3,88);
        card.deposit(1.77);
        card2.deposit(157);
        card3.withdraw(715);
        card.info();
        card2.info();
        card3.info();
    }
}

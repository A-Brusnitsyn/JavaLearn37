package homeworks.HomeWork13.TaskStar;
//Задача 1:
//Создать класс, в котором будет статический метод. Этот метод принимает на вход три
//параметра: login, password, confirmPassword. Все поля имеют тип данных String. Длина
//login должна быть меньше 20 символов и не должен содержать пробелы. Если login не
//соответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
//password должна быть меньше 20 символов, не должен содержать пробелом и должен
//содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
//Если password не соответствует этим требованиям, необходимо выбросить
//WrongPasswordException. WrongPasswordException и WrongLoginException -
//пользовательские классы исключения с двумя конструкторами – один по умолчанию,
//второй принимает сообщение исключения и передает его в конструктор класса
//Exception. Метод возвращает true, если значения верны.

import homeworks.HomeWork13.Task1.Validator;
import homeworks.HomeWork13.Task1.WrongLoginException;
import homeworks.HomeWork13.Task1.WrongPasswordException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String login;
        String password;
        String confirmPassword;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Введите логин:");
            login = sc.nextLine();
            System.out.println("Введите пароль:");
            password = sc.nextLine();
            System.out.println("Подтвердите пароль:");
            confirmPassword = sc.nextLine();
            boolean result = Validator.userCheck(login, password, confirmPassword);
            System.out.println("Проверка пройдена!");
            sc.close();
            System.exit(0);//принудительное завершение работы JVM
        } catch (WrongLoginException | WrongPasswordException ex) {
            System.out.println(ex);
            System.exit(0); //принудительное завершение работы JVM
        } finally {
            sc.close();
            System.out.println("Сканер закрыт");
        }

    }

}

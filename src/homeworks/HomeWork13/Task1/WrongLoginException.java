package homeworks.HomeWork13.Task1;

public class WrongLoginException extends Exception {

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
        super("Неверный логин! Логин должен начинаться с A-z, содержать только латиницу, минимум одну цифру, не содержать пробелов и быть меньше 20 символов!");
    }

}

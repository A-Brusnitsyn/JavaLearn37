package homeworks.HomeWork13.Task1;

public class WrongPasswordException extends Exception {

    public WrongPasswordException() {
        super("Пароль не соответствует требованиям:\n" +
                "имеет от 1 до 20 символов,\n" +
                "содержит минимум одну букву,\n" +
                "содержит минимум одну цифру,\n" +
                "содержит минимум один спецсимвол (не буква и не цифра).");
    }

    public WrongPasswordException(String message) {
        super(message);
    }

}

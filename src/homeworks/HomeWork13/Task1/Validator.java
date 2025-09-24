package homeworks.HomeWork13.Task1;

public class Validator {


    public static boolean userCheck(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches("^[A-Za-z][A-Za-z0-9_]{0,18}$")) {
            throw new WrongLoginException();
        }
        if (!password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[^A-Za-z\\d]).{1,20}")) {
            throw new WrongPasswordException();
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают!");
        }
        return true;
    }


}

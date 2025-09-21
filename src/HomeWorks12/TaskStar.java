package HomeWorks12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskStar {
    public static void main(String[] args) {

        //Задача *:
        //Программа на вход получает произвольный текст. В этом тексте может быть номер
        //документа(один или несколько), емейл и номер телефона. Номер документа в
        //формате: xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате:
        //+(xx)xxxxxxx. Документ может содержать не всю информацию, т.е. например, может не
        //содержать номер телефона, или другое. Необходимо найти эту информацию и вывести
        //в консоль в формате:
        //email: teachmeskills@gmail.com
        //document number: 1423-1512-51
        //и т.д

        String text = "Какой-то случайный текст в котором есть номер документа №1287-6268-27 и еще такой номер 3158-2658-99. Почта еще есть teachme@google.com, а также номер телефона +(99)1239874.";
        Pattern docPat = Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
        Pattern emailPat = Pattern.compile("[A-z]{2,}@[A-z]{2,}\\.[A-z]{2,}");
        Pattern phonePat = Pattern.compile("\\+\\([\\d]{2}\\)[\\d]{7}");

        Matcher docMatch = docPat.matcher(text);
        Matcher emailMatch = emailPat.matcher(text);
        Matcher phoneMatch = phonePat.matcher(text);

        while (docMatch.find()) {
            System.out.println("Document number: " + docMatch.group());
        }
        while (emailMatch.find()) {
            System.out.println("Email: " + emailMatch.group());
        }
        while (phoneMatch.find()) {
            System.out.println("Phone number: " + phoneMatch.group());
        }
    }
}

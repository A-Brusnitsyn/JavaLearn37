package lessons.lesson11;

public class Tasks {
    public static void main(String[] args) {
/*
  1.Mama
  M
  Ma
  Mam
  Mama
  String line = "Alohamora";
        char[] chars = line.toCharArray();    //12345
        StringBuilder resultLine = new StringBuilder("");
        for (int i = 0; i < chars.length; i++) {
            resultLine.append(chars[i]);
            System.out.println(resultLine);
        }

        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.substring(0, i + 1));
        }*/

/*        //2. Кол-во слов в строке
        String inputLine = "This is     second task! ! !"; //4

        inputLine = inputLine.replaceAll(",", "").replace("!", "");
        String[] resultArray = inputLine.split(" ");

        int count = 0;
        for (String line : resultArray) {
            if (!line.isBlank()) {
                count++;
            }
        }
        System.out.println(count);*/

        //3. Пользователь вводит строку из чисел через запятую(например 3,8,9,23,27) и число. Нужно вывести числа из строки которые меньше чем число которое ввел пользователь.
        String input = "1,4,6,19,44,69,100";
        int number = 50;

        String[] numbers = input.split(",");

        for (String oneNumber : numbers) {
            if (number > Integer.parseInt(oneNumber)) {
                System.out.println(Integer.parseInt(oneNumber));
            }
        }
    }
}

//4. Метод isPalindrome(String input) проверяет, является ли строка палиндромом. Условие: Игнорировать регистр и пробелы.
//5. Метод compress(String input) реализует простое сжатие строки. Пример: "aaabbc" → "a3b2c1" Условие: Если сжатая строка не короче исходной — вернуть исходную.

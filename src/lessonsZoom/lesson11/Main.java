package lessonsZoom.lesson11;

import lessonsZoom.lesson9.Dog;

public class Main {
    public static void main(String[] args) {
        String testLine = "Hello world !!!";

        System.out.println(testLine.length()); //длину строки!

        System.out.println(testLine.charAt(5)); //символ по индексу
        System.out.println(testLine.indexOf('o')); //индекс первого вхождения символа
        System.out.println(testLine.lastIndexOf("wor")); //индекс последнего вхождения символа

        System.out.println(testLine.substring(5, 10)); //вырезает подстроку из строки
        System.out.println(testLine.substring(5)); //вырезает подстроку из строки

        System.out.println("asdad".concat("Hello"));
        System.out.println("HELLO WORLD ".equals(testLine));
        System.out.println("HELLO WORLD ".equalsIgnoreCase(testLine));
        System.out.println("HELLO WORLD ".compareToIgnoreCase(testLine));

        System.out.println(testLine.toLowerCase()); //преобразовать в нижний регистр
        System.out.println(testLine.toUpperCase()); //преобразовать в верхний регистр

        System.out.println("   TMS       ".trim()); //обрезает лишние пробелы с обеих сторон
        System.out.println("   TMS       ".stripTrailing()); //обрезает лишние пробелы с конца строки
        System.out.println("   TMS       ".stripLeading()); //обрезает лишние пробелы с начала строки

        System.out.println(testLine.replace("!", "")); //заменяет один символ на второй
        System.out.println(testLine.replace("Hello", "!")); //заменяет один символ на второй
        System.out.println(testLine.replaceFirst(" +", "FIND!!!")); //ищет 1 REGEX и заменяет на строку
        System.out.println(testLine.replaceAll(" +", "FIND!!!")); //ищет все REGEX и заменяет на строку

        char[] charArray = testLine.toCharArray(); // из строки в массив символов
        String dimaDog = String.valueOf(new Dog("Dima")); //преобразование чего угодно в строку
        String[] names = "Dima,Alina,Sergey,Adam,Renata".split(",");

        for (String oneName : names) {
            System.out.println(oneName);
        }


        System.out.println("      ".isEmpty()); //Проверяет есть ли символы в этой строке
        System.out.println("   af  ".isBlank()); //Проверяет есть ли символы в этой строке(за исключением пробела,табуляции etc.)
        System.out.println(testLine.contains("llo worl"));
        System.out.println(testLine.startsWith("Hello"));
        System.out.println(testLine.endsWith(" !"));

        System.out.println("hello".repeat(4));

        System.out.println(testLine.regionMatches(6, "world Hi", 0, 7));

        String sbExample = """
                This
                        is
                                String
                                        Block
                                                :)
                """;

        System.out.println(sbExample);


        System.out.println("---------------------");

        String ilya = new String("ilya");
        ilya = ilya.intern();
        System.out.println(ilya == "ilya");

        System.gc();
    }
}

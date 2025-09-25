package homeworks.HomeWork14.taskStar;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    //Задача *:
    //Допустим есть txt файл с номерами документов. Номером документа является строка,
    //состоящая из букв и цифр(без служебных символов). Пусть этот файл содержит
    //каждый номер документа с новой строки и в строке никакой другой информации,
    //только номер документа. Валидный номер документа должен иметь длину 15
    //символов и начинаться с последовательности docnum(далее любая
    //последовательность букв/цифр) или contract(далее любая последовательность
    //букв/цифр). Написать программу для чтения информации из входного файла - путь к
    //входному файлу должен задаваться через консоль. Программа должна проверять
    //номера документов на валидность. Валидные номера документов следует записать в
    //один файл-отчет. Невалидные номера документов следует записать в другой
    //файл-отчет, но после номеров документов следует добавить информацию о том,
    //почему этот документ не валиден.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте путь к файлу:");
        File file = new File(sc.nextLine());
        StringBuilder sb = new StringBuilder();
        try (FileReader fr = new FileReader(file)) {
            int i;
            while ((i = fr.read()) != -1) {
                sb.append((char) i);
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
        String[] arrDocs = sb.toString().split("\\s+");
        StringBuilder sbValid = new StringBuilder();
        StringBuilder sbNotValid = new StringBuilder();
        String reg1 = "^(docnum\\w{0,8}|contract\\w{0,6})$";
        String reg2 = "^(docnum\\w{10,}|contract\\w{8,})$";
        String valid = "";

        for (String num : arrDocs) {
            if (num.matches("^(docnum\\w{9}|contract\\w{7})$")) {
                sbValid.append(num + "\n");
            } else if (num.matches(reg1)) {
                sbNotValid.append(num + " содержит меньше 15 символов\n");
            } else if (num.matches(reg2)) {
                sbNotValid.append(num + " содержит больше 15 символов\n");
            } else {
                sbNotValid.append(num + " не начинается с docnum или contract\n");
            }
        }
        valid = sbValid.toString();

        try (FileWriter fw = new FileWriter("D:\\valid.txt")) {
            fw.write(valid);
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }

        String notValid = "";
        notValid = sbNotValid.toString();

        try (FileWriter fw1 = new FileWriter("D:\\notValid.txt")) {
            fw1.write(notValid);
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }

        System.out.println("Валидные договора документов сохранены по пути D:\\valid.txt, не валидные D:\\notValid.txt.");


    }
}

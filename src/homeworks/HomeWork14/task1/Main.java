package homeworks.HomeWork14.task1;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File book = new File("D:\\romeo-and-juliet.txt");
        StringBuilder sb = new StringBuilder();

        try (FileReader fr = new FileReader(book)) {
            int i;
            while ((i=fr.read())!=-1){
                sb.append((char) i);
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
        String[] splitedBook=sb.toString().split("\\s+|\\-");
        String longestword="";
        for (String word:splitedBook){
            String cleanWord=word.replaceAll("[^A-z]","");
            if (word.length()>longestword.length()){
                longestword=cleanWord;
            }
        }
        System.out.println("Самое длинное слово в книге - " + longestword + "\nСохраним его в файл result.txt на диске D");

        try (FileWriter fw = new FileWriter("D:\\result.txt")){
            fw.write(longestword);
        }catch (IOException e){
            System.out.println("Exception: " + e);
        }

    }
}

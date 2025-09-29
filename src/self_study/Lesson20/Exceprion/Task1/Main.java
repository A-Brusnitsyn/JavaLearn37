package self_study.Lesson20.Exceprion.Task1;

import java.io.FileNotFoundException;
import java.util.Scanner;

//Задача 1:
//Создайте массив, имитирующий простейшую файловую систему и содержащий объекты файлов.
//Реализуйте класс «Файл» содержит название файла, его размер и тип информации (Текст, изображение, аудио, видео.
// Рекомендую задать типы информации через Enum).
//Реализуйте механизм поиска по файлам. Метод, реализующий поиск должен выбрасывать FileNotFoundException, если файл
// не найден (вне зависимости от варианта задачи). Если файл с названием, введенным пользователем с клавиатуры,
// существует – вывести на экран информацию о нем (допустимо использовать переопределенный toString()). Если нет, то
//Вариант 1: выведите сообщение «Искомый файл не существует»;
//Вариант 2: выбросьте исключение FileNotFoundException. Подсказка: throws можно использовать в том числе в main().
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File[] files = {
                new File("doc.doc", 12034, FileType.TEXT),
                new File("video.mp4", 32434, FileType.VIDEO),
                new File("summer.jpeg", 120, FileType.PHOTO),
                new File("song.mp3", 640, FileType.AUDIO),
        };

       String searchFile= sc.nextLine();

       try {
           File foundFile=findFile(files,searchFile);
           System.out.println("Файл найден: " + foundFile);
       } catch (FileNotFoundException ex){
           System.out.println("Нет такого файла!");
           ex.printStackTrace();  // Вариант 2 (вывод стека при исключении)
       }


    }
    public static File findFile(File[] files, String fileName) throws FileNotFoundException {
        for (File file:files){
            if (file.getName().equalsIgnoreCase(fileName)){
                return file;
            }
        }
        throw new FileNotFoundException("Файл " + fileName + " не найден!");
    }
}

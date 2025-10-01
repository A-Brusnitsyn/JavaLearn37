package homeworks.HomeWork15.Task3;

//Задача 3:
//Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
//оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
//Написать метод, который удаляет студентов со средним баллом <3. Если средний
//балл>=3, студент переводится на следующий курс. Дополнительно написать метод
//printStudents(List<Student> students, int course), который получает список студентов и
//номер курса. А также печатает на консоль имена тех студентов из списка, которые
//обучаются на данном курсе.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Иван Иванов","2a",2,Arrays.asList(1,2,4,5,5)));
        students.add(new Student("Джеки Чан","3в",2,Arrays.asList(3,2,4,2,3)));
        students.add(new Student("Джон Траволта","1б",1,Arrays.asList(3,3,3,3,2)));
        students.add(new Student("Сильвестр Сталоне","4п",3,Arrays.asList(5,5,5,5,5)));
        students.add(new Student("Дженифер Лопез","3е",3,Arrays.asList(4,4,2,3,2)));
        students.add(new Student("Киану Ривз","3е",3,Arrays.asList()));

        System.out.println("Текущие студенты:");
        for (Student student : students) {
            System.out.println(student);
        }
        removeStudents(students);

        System.out.println("\nОставшиеся студенты:");
        for (Student student : students) {
            System.out.println(student.getName());
        }

        printStudents(students, 3);
    }
    public static void removeStudents(List<Student> students) {
        // Создаем временный список для студентов, которые останутся
        ArrayList<Student> tempStudents = new ArrayList<>();
        System.out.println("\nПодводим итоги учебного года...\n");
        for (Student student : students) {
            if (student.getAverageGrade() >= 3.0) {
                student.promote();
                System.out.println("Студент " + student.getName() + " переведен на следующий курс.");
                tempStudents.add(student);
            }
        }
        System.out.println("\nОтчисляем студентов...\n");
        for (Student student : students) {
            if (student.getAverageGrade() < 3.0) {
                System.out.println("Студент " + student.getName() + " отчислен!");
            }
        }

        // Очищаем исходный список и добавляем обратно только оставшихся студентов
        students.clear();
        students.addAll(tempStudents);
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("\nСтуденты " + course + "-го курса:");
        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("На данном курсе студентов не найдено");
        }
    }
}

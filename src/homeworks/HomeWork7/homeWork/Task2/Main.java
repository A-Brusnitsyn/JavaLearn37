package homeworks.HomeWork7.homeWork.Task2;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        /**Задача *:
         Создать класс Apple и добавить в него поле color с модификатором доступа private и
         инициализировать его. В методе main другого класса создать объект Apple, и не
         используя сеттеры изменить значение поля color.*/

        try {
            Apple apple = new Apple();
            apple.showColor();
            Field field = Apple.class.getDeclaredField("color");
            field.setAccessible(true);
            field.set(apple, "yellow");
            apple.showColor();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

package self_study.Lesson7.Methods.VarArgs;

public class Task1 {
    public static void main(String[] args) {
        //Задача 1:
        //Написать программу, которая объединяет любое количество строк, объединяя их через пробел.
        //Реализацию конкатенации строк вынести в отдельный метод.
        String a="delo1";
        String b="delo2";
        String c="delo3";
        String d="delo4";
        concat(a,b,c,d);

    }
    static void concat(String...s){
        String t="";
        for (String text:s){
            t+=text;
            t+=" ";
        }
        System.out.println(t);
    }
}

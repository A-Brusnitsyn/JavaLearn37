package self_study.Lesson14.Polymorphism.Task1.model;

public class Square extends Figure{
    private String figureName;
    private int sideLenght;

    public Square(String figureName) {
        this.figureName = figureName;
    }

    @Override
    public void paint(int sideLenght) {
        String len = " ";
        String wid = "";
        String space = "";

        for (int i = 1; i <= sideLenght; i++) {
            len += "---";
            space += "   ";
        }
        for (int i = 1; i <= sideLenght; i++) {
            wid += "\n|" + space + "|";
        }
        System.out.println(len + wid + "\n" + len);
    }
}

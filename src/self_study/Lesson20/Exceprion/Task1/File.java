package self_study.Lesson20.Exceprion.Task1;

public class File {
    private String name;
    private int size;
    private FileType type;

    public File(String name, int size, FileType type) {
        this.name = name;
        this.size = size;
        this.type = type;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Файл: " + name + ", размер: " + size + "KB, тип: " + type;
    }

}

package CodeTraining.Lesson8.Objects;

public class Schet {
    String name;
    int sch;

    public Schet(String name, int sch) {
        this.name = name;
        this.sch = sch;
    }

    public Schet(String name) {
        this.name = name;
        this.sch = 0;
    }

    public int plusSc() {
        return sch++;
    }

    public int minusSc() {
        return sch--;
    }

    public int plusSc(int i) {
        sch += i;
        return sch;
    }

    public int minusSc(int i) {
        sch -= i;
        return sch;
    }
}

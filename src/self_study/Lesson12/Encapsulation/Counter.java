package self_study.Lesson12.Encapsulation;

public class Counter {
    private String name;
    private String unit;
    private int value;

    public Counter(String name, String unit, int value) {
        this.name = name;
        this.unit = unit;
        this.value = value;
    }

    public Counter(String name, String unit) {
        this(name, unit, 0);
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

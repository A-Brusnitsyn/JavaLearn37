package homeworks.HomeWork20.Task1;

public class MaxFinder extends Thread {
    private final int[] array;
    private int max;

    public MaxFinder(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
    }

    public int getMax() {
        return max;
    }
}

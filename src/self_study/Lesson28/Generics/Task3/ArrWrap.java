package self_study.Lesson28.Generics.Task3;

public class ArrWrap <T>{
    private final T[] arr;

    public ArrWrap(T[] arr) {
        this.arr = arr;
    }

    public T valueFind(T value) throws ValueNotFoundException {
        for (T element:arr){
            if (value==null?element==null:value.equals(element)){
                return element;
            }
        }
        throw new ValueNotFoundException("Значение '" + value + "' не найдено в массиве");
    }
}

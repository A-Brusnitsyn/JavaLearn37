package self_study.Lesson12.Encapsulation;

public class Main {
    public static final String GAS_COUNTER_NAME = "Газ";
    public static final String COLD_WATER_COUNTER_NAME = "Холодная вода";
    public static final String HOT_WATER_COUNTER_NAME = "Горячая вода";
    public static final String ELECTRICITY_COUNTER_NAME = "Электричество";

    public static final String M3_UNIT = "м3";
    public static final String KVTH_UNIT = "кВт/ч";

    public static void main(String[] args) {
        //Задача:
        //Разработать программу в рамках компании walking/com, позволяющую следить за счетчиками на газ, холодную воду,
        // горячую воду и электричество. Обозначение программы в рамках компании — counterAggregation.
        //Используя за основу задачу из темы про классы и объекты, реализовать класс счетчика, который хранит название
        // счетчика и его значение, его единицы измерения, а также обеспечивает доступ к значениям. Название счетчика
        // и его единицы измерения должны быть неизменны.
        //Также реализовать сервис CounterService, зона ответственности которого — хранение массива доступных счетчиков,
        // получение всех доступных счетчиков, получение доступа к счетчику по названию, увеличение значения счетчика на
        // единицу или заданное значение, а также сброс счетчика до нулевого значения.
        //Ответственность класса, содержащего main() — создание счетчиков. Сам класс также предлагаю назвать Main.
        //Также реализовать в классе Main приватный метод, который позволяет вывести значения счетчиков в виде:
        //<Название счетчика>: <Значение счетчика>
        //Например:
        //Газ: 2333
        //Горячая вода: 0
        //Холодная вода: 23

        Counter gasCounter = new Counter(GAS_COUNTER_NAME, M3_UNIT);
        Counter coldWaterCounter = new Counter(COLD_WATER_COUNTER_NAME, M3_UNIT);
        Counter hotWaterCounter = new Counter(HOT_WATER_COUNTER_NAME, M3_UNIT);
        Counter electricityCounter = new Counter(ELECTRICITY_COUNTER_NAME, KVTH_UNIT);

        CounterService counterService = new CounterService(gasCounter, coldWaterCounter);
        counterService.addCounter(hotWaterCounter);
        counterService.addCounter(electricityCounter);

        counterService.increaseCounter(GAS_COUNTER_NAME, 100);
        counterService.increaseCounter(coldWaterCounter, 10);

        printCounters(counterService.getAllCounters());

    }

    static void printCounters(Counter[] counters) {
        for (Counter counter : counters) {
            System.out.printf("%s: %s\n", counter.getName(), counter.getValue());
        }

    }
}

package HomeWork6.Task2;

public class ATM {
    private int bill20;
    private int bill50;
    private int bill100;

    //Конструктор
    public ATM(int bill20, int bill50, int bill100) {
        this.bill20 = bill20;
        this.bill50 = bill50;
        this.bill100 = bill100;
    }

    //Метод пополнения банкомата
    public void addMoney(int add20, int add50, int add100) {
        bill20 += add20;
        bill50 += add50;
        bill100 += add100;
    }

    //Метод снятия денег
    public boolean withdraw(int sum) {
        if (sum < 20 || sum % 10 != 0) {
            System.out.println("Нельзя выдать такую сумму");
            return false;
        }
        int need100 = Math.min(sum / 100, bill100); //проверка сколько купюр 100 можем выдать
        int tempSum = sum - need100 * 100; //отнимаем от общей суммы купюры по 100
        int need50 = Math.min(tempSum / 50, bill50); //проверка сколько купюр 50 можем выдать
        tempSum -= need50 * 50;

        if (tempSum % 20 != 0) { //если остаток суммы к выдаче не кратен 20,пытаемся скорректировать уменьшаем купюры по 50
            while (need50 > 0) {
                need50--;
                tempSum += 50;
                if (tempSum % 20 == 0)
                    break;
            }
            if (tempSum % 20 != 0) {
                while (need100 > 0) {
                    need100--;
                    tempSum += 100;
                    need50 = Math.min(tempSum / 50, bill50);
                    tempSum -= need50 * 50;
                    if (tempSum % 20 == 0)
                        break;
                }
            }
        }
        //добор суммы купюрами по 20
        int need20 = Math.min(tempSum / 20, bill20);
        tempSum -= need20 * 20;
        //если банкомат может выдать заданную сумму, выдаем
        if (tempSum == 0) {
            bill100 -= need100;
            bill50 -= need50;
            bill20 -= need20;

            System.out.println("Выдано купюр: по 100 - " + need100 + " по 50 - " + need50 + " по 20 - " + need20);
            return true;
        } else {
            System.out.println("Недостаточно купюр в банкомате");
            return false;
        }
    }

    //Метод отображения баланса банкомата
    public void balance() {
        int balance = bill20 * 20 + bill50 * 50 + bill100 * 100;
        System.out.println("Баланс банкомата: \n" +
                "Номинал 20 - Количество " + bill20 + "\n" +
                "Номинал 50 - Количество " + bill50 + "\n" +
                "Номинал 100 - Количество " + bill100 + "\n" +
                "Общая сумма: " + balance);
    }
}

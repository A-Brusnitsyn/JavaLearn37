package HomeWork6.Task1;

public class CreditCard {
        /**Задача 1:
        Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
        метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
        который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
        выводит текущую информацию о карточке.*/
        int bankAccountNumber;
        double balance;


        public CreditCard(int bankAccountNumber, double balance){
            this.bankAccountNumber=bankAccountNumber;
            this.balance=balance;
        }

        //метод пополнения баланса
        void deposit(double sum){
            if (sum>0) {
                balance += sum;
                System.out.println("Баланс пополнен на " + sum);
            } else {
                System.out.println("Некорректная сумма");
            }
        }

        //метод снятия с баланса
        void withdraw(double sum){
            if (sum>0){
                if(balance>sum){
                    balance-=sum;
                    System.out.println("Снято с баланса " + sum);
                }else{
                    System.out.println("Недостаточно средств. Доступно на балансе - " + balance);
                }
            } else {
                System.out.println("Некорректная сумма");
            }
        }

        //метод отображения информации о балансе
        void info(){
            System.out.println("Номер счета: " + bankAccountNumber + ". Текущий баланс: " + balance);
        }

}

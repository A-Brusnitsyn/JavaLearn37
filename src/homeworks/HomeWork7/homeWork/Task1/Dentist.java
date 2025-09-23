package homeworks.HomeWork7.homeWork.Task1;

import java.util.Random;

public class Dentist extends Doctor {
    public Dentist(String profession) {
        super(profession);
    }

    String[] heal = {"Д. - Готовь кошелек!",
            "Д. - Вижу лишние зубы!",
            "Д. - Тут всего-то одну пломбу поставить!"
    };

    Random random = new Random();

    @Override
    void heal(Patient patient) {
        super.heal(patient);
        int docSays = random.nextInt(heal.length);
        System.out.println(heal[docSays]);
    }
}

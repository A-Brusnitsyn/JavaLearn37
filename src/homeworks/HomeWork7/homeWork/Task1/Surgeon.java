package homeworks.HomeWork7.homeWork.Task1;

import java.util.Random;

public class Surgeon extends Doctor {
    public Surgeon(String profession) {
        super(profession);
    }

    String[] heal = {"Х. - Ну тут без ампутации не обойтись!",
            "Х. - Сейчас зашьем тебя!",
            "Х. - Впервые вижу такой перелом!"};

    Random random = new Random();

    @Override
    void heal(Patient patient) {
        super.heal(patient);
        int docSays = random.nextInt(heal.length);
        System.out.println(heal[docSays]);
    }
}

package HomeWork7.homeWork.Task1;

import java.util.Random;

public class Therapist extends Doctor {

    String[] heal = {"Т. - Совсем запустил себя голубчик!",
            "Т. - Сейчас мы тебя подлатаем!",
            "Т. - Выпей таблеточку!"};

    public Therapist(String profession) {
        super(profession);
    }

    Random random = new Random();

    @Override
    public void heal(Patient patient) {
        super.heal(patient);
        int docSays = random.nextInt(heal.length);
        System.out.println(heal[docSays]);
    }

    public void docSelect(Patient patient) {
        int healPlan = patient.getHealPlan();
        if (healPlan == 1) {
            Doctor surgeon = new Surgeon("Хирург");
            surgeon.heal(patient);
        } else if (healPlan == 2) {
            Doctor dentist = new Dentist("Дантист");
            dentist.heal(patient);
        } else {
            heal(patient);
        }
    }

}

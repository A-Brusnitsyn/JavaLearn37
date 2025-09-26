package self_study.Lesson17.Enum.Task2;

public enum Animal { CAT("meow"), DOG("woof"), COW("moo");

    private final String voice;
    Animal(String voice){
        this.voice=voice;
    }

    void sound(){
        System.out.println(voice);
    }
    public String getVoice() {
        return voice;
    }
}

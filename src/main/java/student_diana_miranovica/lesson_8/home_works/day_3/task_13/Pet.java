package student_diana_miranovica.lesson_8.home_works.day_3.task_13;

 abstract class Pet {

   String voice;

    public Pet(String voice) {
        this.voice = voice;
    }
}
class Cats extends Pet{

    public Cats(String voice) {
        super(voice);
    }
}
class Dogs extends Pet{

    public Dogs(String voice) {
        super(voice);
    }
}

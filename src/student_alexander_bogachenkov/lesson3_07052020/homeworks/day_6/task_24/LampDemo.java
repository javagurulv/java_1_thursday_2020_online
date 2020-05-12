package student_alexander_bogachenkov.lesson3_07052020.homeworks.day_6.task_24;

class LampDemo {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp("red",30,false, true);
        lamp1.infoAboutLamp();

        Lamp lamp2 = new Lamp("black",45,true, false);
        lamp2.infoAboutLamp();
    }
}
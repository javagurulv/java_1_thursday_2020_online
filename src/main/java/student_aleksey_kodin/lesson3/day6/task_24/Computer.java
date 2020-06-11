package student_aleksey_kodin.lesson3.day6.task_24;

class Computer {
    boolean isOn;

    Computer(boolean on) {
        isOn = on;
    }

    public boolean isOn() {
        return isOn;
    }
    public void setOn(boolean on) {
        isOn = on;
    }


    public void bootOS() {
        System.out.println("Load Windows 10");
    }
    public void showScreen() {
        System.out.println("Show Desktop");
    }
    public void startEditor() {
        System.out.println("You can write text");
    }
}

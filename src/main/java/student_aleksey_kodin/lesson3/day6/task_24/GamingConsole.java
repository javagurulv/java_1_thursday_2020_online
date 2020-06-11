package student_aleksey_kodin.lesson3.day6.task_24;

class GamingConsole extends Computer{
    boolean isOn;

    GamingConsole(boolean on) {
        super(on);
        isOn = on;
    }
    @Override
    public boolean isOn() {
        return isOn;
    }
    @Override
    public void setOn(boolean on) {
        isOn = on;
    }
    @Override
    public void bootOS() {
        System.out.println("Load Windows Core OS");
    }
    @Override
    public void showScreen() {
        System.out.println("Show Games Menu");
    }
    public void playGame() {  System.out.println("You can playing cool games");}
}

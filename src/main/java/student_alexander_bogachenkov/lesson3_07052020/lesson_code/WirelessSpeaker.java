package student_alexander_bogachenkov.lesson3_07052020.lesson_code;

class WirelessSpeaker {

    private boolean isOn;

    public WirelessSpeaker() {
        this.isOn = false;
    }

    public void switchOn() {
        this.isOn = true;
        System.out.println("Switched ON!");
    }

    public void switchOff() {
        this.isOn = false;
        System.out.println("Switched OFF!");
    }

}

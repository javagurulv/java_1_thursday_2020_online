package student_igors_mihejevs.lesson_3.lessoncode;

class WirelessLoudSpeaker {

    private final String model;

    // on-off
    private boolean isOn;

    public WirelessLoudSpeaker (String wirelessModel, boolean isSwitchedOn) {
        this.model = wirelessModel;
        this.isOn = isSwitchedOn;
    }

    public String getModel() {
        return this.model;

    }

    public void switchOn() {
        this.isOn = true;
        System.out.println("Switched On!");
    }

    public void switchOff() {
        this.isOn = false;
        System.out.println("Switched Off!");
    }
}

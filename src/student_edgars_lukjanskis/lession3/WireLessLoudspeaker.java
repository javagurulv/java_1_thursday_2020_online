package student_edgars_lukjanskis.lession3;

class WireLessLoudspeaker {

    //model
    private String model;


    // on/off
    private boolean isOn;

    public WireLessLoudspeaker(String wireLessModel,
                               boolean isTurnedOn) {
        this.model = wireLessModel;
        this.isOn = isTurnedOn;
    }

    public String getModel() {
        return this.model;
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println("Turned ON!");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("Turned OFF!");
    }

    // должна звучать
    // volume -/+
    // input

}

package student_oleg_ivanov.lesson3;

class WirlesLoudSpeaker {

    private final String model;

    // on/off
    private boolean isOn;
    public WirlesLoudSpeaker (String wirelesModel,
                              boolean isSwitchedOn) {
        this.model = wirelesModel;
        this.isOn = isSwitchedOn;
    }

    public String getModel() {
        return this.model;
    }

    public void switchOn() {
        this.isOn = true;
        System.out.println("Switched ON!");
    }

    public void switchOff() {
        this.isOn = false;
        System.out.println("Switched OFF!");
    }

    //должна звучать
    //звук + -
    // input

}

package student_vladimir_filipov.lesson3.hometasks;

public class WirelesLoudspeaker {

    public String getModel;

       private String model;

    //  on-off
    private boolean isOn;

    public WirelesLoudspeaker(String wirelesModel,
                              boolean isSwitchOn) {
        this.model = wirelesModel;
        this.isOn = isSwitchOn;
    }

    public String getModel () { return this.model;
    }
        public void switchOn () {
        this.isOn = true;
        System.out.println("Switched ON!");
    }
        public void switchOff () {
        this.isOn = false;
        System.out.println("Switched OFF!");
    }


    public void switchON() {
    }
}

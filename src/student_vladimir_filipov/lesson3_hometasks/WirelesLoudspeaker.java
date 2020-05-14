package student_vladimir_filipov.lesson3_hometasks;

class WirelesLoudspeaker {

    private final String model;

    //  on-off
    private boolean isOn;

    public WirelesLoudspeaker(String wirelesModel,
                              boolean isSwitchedOn) {
        this.model = wirelesModel;
        this.isOn = isSwitchedOn;
    }

    public String getModel () { return this.model;
    }
        public void switchedOn () {
        this.isOn = true;
        System.out.println("Switched ON!");
    }
        public void switchOff () {
        this.isOn = false;
        System.out.println("Switched OFF!");
    }


    public void switchedON() {
    }

}


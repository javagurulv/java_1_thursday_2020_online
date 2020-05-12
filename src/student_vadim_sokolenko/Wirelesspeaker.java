package student_vadim_sokolenko;

public class Wirelesspeaker {

    private String model;

    // on / off

    private boolean isOn;

    public Wirelesspeaker(String wirelesModel,
                          boolean isSwitchedOn){

        this.model = wirelesModel;
        this.isOn = isSwitchedOn;
    }

    public String getModel() {
        return this.model;

    }

    public void switchOn(){

        this.isOn = true;
        System.out.println("Switched ON");
    }

    public void switchOff(){

        this.isOn = false;
        System.out.println("Switched OFF");
    }

    // звучать

    //громкость

    //input




}

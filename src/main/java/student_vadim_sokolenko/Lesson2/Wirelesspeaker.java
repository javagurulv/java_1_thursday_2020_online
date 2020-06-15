package student_vadim_sokolenko.Lesson2;

class Wirelesspeaker {

    private String model;
    private boolean isOn;
    private int soundVolume;


    public Wirelesspeaker(String wirelessModel,
                          boolean isSwitchedOn){

        this.model = wirelessModel;
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
    public void increaseSound(){
        if(this.isOn == true) {
        this.soundVolume = this.soundVolume + 1;
    }}

    public void decreaseSound(){
        if (this.isOn ==true){
            this.soundVolume = this.soundVolume - 1;
        }
    }
    // звучать

    //громкость

    //input




}

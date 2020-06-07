package student_edgars_lukjanskis.lession_3;

class WireLessLoudSpeaker {

    private static final int MIN_SOUND_VOLUME = 0;
    private static final int MAX_SOUND_VOLUME = 10;

    private String model;
    private boolean isOn;
    private int soundVolume;


    public WireLessLoudSpeaker(String wireLessModel,
                               boolean isTurnedOn) {
        this.model = wireLessModel;
        this.isOn = isTurnedOn;
        this.soundVolume = MIN_SOUND_VOLUME;
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

    public boolean isOn(){
        return this.isOn;
    }

    public int getSoundVolume(){
        return this.soundVolume;
    }
    public void raiseVolume(){
        if((this.isOn == true)
                && (this.soundVolume < MAX_SOUND_VOLUME)) {
            this.soundVolume = this.soundVolume + 1;
        }
    }


    public void lowerVolume(){
        if ((this.isOn == true)
                && (this.soundVolume > MIN_SOUND_VOLUME)) {
            this.soundVolume = this.soundVolume - 1;
        }
    }


    // должна звучать
    // input

}

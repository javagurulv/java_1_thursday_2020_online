package student_diana_miranovica.lesson3.lesson_code;

class WirelessLoudspeaker {

    private static final int MIN_SOUND_VOLUME =0;
    private static final int MAX_SOUND_VOLUME =100;


    private final String model;
    private boolean isOn;
    private int soundVolume;


    public WirelessLoudspeaker(String wirelessModel,
                               boolean isSwitchedOn){
        this.model = wirelessModel;
        this.isOn = isSwitchedOn;
        this.soundVolume = MIN_SOUND_VOLUME;

    }
    public boolean isOn(){
        return this.isOn;
    }
    public String getModel(){
        return this.model;

    }
    public int getSoundVolume(){
        return this.soundVolume;
    }

    public void switchOn() {
        this.isOn = true;
        System.out.println("Switched ON!");
    }
    public void switchOff(){
        this.isOn = false;
        System.out.println("Switched OFF!");
    }
    public void  increaseSound(){
        if(isOn()&& isSoundVolumeLessThenMin()) {
            this.soundVolume = this.soundVolume + 1;
        }
    }

    private boolean isSoundVolumeLessThenMax(){
        return this.soundVolume < MAX_SOUND_VOLUME;
    }
    private boolean isSoundVolumeLessThenMin(){
        return this.soundVolume > MIN_SOUND_VOLUME;
    }


    public void  decreaseSound(){
        if(isOn()&&isSoundVolumeLessThenMin()){
            this.soundVolume = this.soundVolume -1;
        }


    }
    //должна звучать
    //звук -/+
    //input

}

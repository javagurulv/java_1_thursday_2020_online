package student_diana_miranovica.lesson3.lesson_code;

public class WirelessLoudspeaker {

    private  String model;

    // on/off
    private boolean isOn;
    public WirelessLoudspeaker(String wirelessModel,
                               boolean isSwitchedOn){
        this.model = wirelessModel;
        this.isOn = isSwitchedOn;

    }
    public String getModel(){
        return this.model;

    }
    public void switchOn() {
        this.isOn = true;
        System.out.println("Switched ON!");
    }
    public void switchOff(){
        this.isOn = false;
        System.out.println("Switched OFF!");
    }
    //должна звучать
    //звук -/+
    //input

}

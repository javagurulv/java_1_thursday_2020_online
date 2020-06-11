package student_arturs_ragausks;

class WirlessLoudspeeker {

    private  String model;

    //on/off boolean
    private boolean isOn;

    public  WirlessLoudspeeker(String wirelessModel,
                               boolean isSwitchedOn) {   // v kruglih skobkah eto parametr objekta v konstruktore
        this.model = wirelessModel;                      //ne budj lohom, ne zabivaj shto vse vzaimosvjazano
        this.isOn = isSwitchedOn;
    }
    public  String getModel(){
        return  this.model;

    }


    public void switchOn() {
        this.isOn = true;
        System.out.println("Switchet ON!");
    }

        public  void  switchOff() {
           this.isOn = false;
           System.out.println("Switched OFF! ");


        }



    //volume lvl

    //volume  sound

    //input



}

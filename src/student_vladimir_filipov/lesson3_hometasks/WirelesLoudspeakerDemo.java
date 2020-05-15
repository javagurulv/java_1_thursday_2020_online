package student_vladimir_filipov.lesson3_hometasks;

class WirelesLoudspeakerDemo {

    public static void main (String[] args) {
        WirelesLoudspeaker WS1 = new WirelesLoudspeaker ("Samsung",false);
        WS1.switchedOn();

        WS1.switchOff();
        String model1 = WS1.getModel();
		model1 = WS1.getModel();
		model1 = WS1.getModel();
        System.out.println("WS 1 model = " + model1);

        WirelesLoudspeaker WS2 = new WirelesLoudspeaker ("Bose",false);
        WS2.switchOff();
        String model2 = WS2.getModel();
        System.out.println("WS 2 model = " + model2);

        WirelesLoudspeaker WS3 = new WirelesLoudspeaker ("NOKIA",false);
        WS3.switchedOn();
        String model3 = WS3.getModel();
        System.out.println("WS 3 model = " + model3);

    }

    }



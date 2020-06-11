package student_oleg_ivanov.lesson3;

class WirlesLoudSpeakerDemo {

    public static void main(String[] arg) {
        WirlesLoudSpeaker ws1 = new WirlesLoudSpeaker("Bose", false);
        ws1.switchOn();
        ws1.switchOff();
        ws1.switchOn();
        String model1 = ws1.getModel();
        System.out.println("WS 1 model = " + model1);

        WirlesLoudSpeaker ws2 = new WirlesLoudSpeaker("Samsung", true);
        ws2.switchOn();
        String model2 = ws2.getModel();
        System.out.println("WS 2 model = " + model2);

        WirlesLoudSpeaker ws3 = new WirlesLoudSpeaker("Xaomi", false);
        ws3.switchOn();
        String model3 = ws3.getModel();
        System.out.println("WS3 model = " + model3);

    }
}

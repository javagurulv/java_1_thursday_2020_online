package student_edgars_lukjanskis.lession_3;

class WireLessLoudSpeakerDemo {

    public static void main(String[] args) {
        WireLessLoudSpeaker ws1 = new WireLessLoudSpeaker("Bose",false);
            String model1 = ws1.getModel();
            System.out.println("WS 1 model = " + model1);
            ws1.turnOn();
            ws1.turnOff();

        WireLessLoudSpeaker ws2 = new WireLessLoudSpeaker("Samsung",true);
            String model2 = ws2.getModel();
            System.out.println("WS 2 model = " + model2);
            ws2.turnOn();
            ws2.turnOff();

        WireLessLoudSpeaker ws3 = new WireLessLoudSpeaker("Apple", false);
            String model3 = ws3.getModel();
            System.out.println("WS 3 model = " + model3);
            ws3.turnOn();
            ws3.turnOff();
    }
}

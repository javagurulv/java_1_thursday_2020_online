package student_igors_mihejevs.lesson_3.lessoncode;

class WirelessLoudSpeakerDemo {
    public static void main(String[] args) {
        WirelessLoudSpeaker ws1 = new WirelessLoudSpeaker("Bose", true);
        ws1.switchOff();
        String model1 = ws1.getModel();
        System.out.println("WS1 model = " + model1);

        WirelessLoudSpeaker ws2 = new WirelessLoudSpeaker("Samsung", false);
        ws1.switchOff();
        String model2 = ws2.getModel();
        System.out.println("WS2 model = " + model2);

        WirelessLoudSpeaker ws3 = new WirelessLoudSpeaker("Sony", false);
        ws1.switchOff();
        String model3 = ws3.getModel();
        System.out.println("WS3 + model = " + model3);
    }
}

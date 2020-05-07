package student_diana_miranovica.lesson3.lesson_code;

import student_diana_miranovica.lesson3.lesson_code.WirelessLoudspeaker;

public class WirelessLoudspeakerDemo {
    public static void main(String[] args) {
        WirelessLoudspeaker ws1 = new WirelessLoudspeaker("Samsung ",false);
        ws1.switchOn();
        ws1.switchOn();
        ws1.switchOff();
        String model = ws1.getModel();
        System.out.println("WS 1 model =" + model);

        WirelessLoudspeaker ws2 = new WirelessLoudspeaker("Bose", true);
        ws2.switchOn();
        ws2.switchOff();
        String model2 = ws2.getModel();
        System.out.println("WS 2 model =" + model2);


        WirelessLoudspeaker ws3 = new WirelessLoudspeaker("LG", false);
        ws3.switchOn();
        ws3.switchOff();
        String model3 = ws3.getModel();
        System.out.println("WS 3 model =" + model3);

    }
}

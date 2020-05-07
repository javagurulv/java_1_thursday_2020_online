package student_vladimir_filipov.lesson3.hometasks;

import student_diana_miranovica.lesson_3.WirelessLoudspeaker;

public class Lesson_WirelessLoudspeakerDemo {

    public static void main(String[] args) {
        student_diana_miranovica.lesson_3.WirelessLoudspeaker ws1 = new student_diana_miranovica.lesson_3.WirelessLoudspeaker("Samsung ",false);
        ws1.switchOn();
        ws1.switchOn();
        ws1.switchOff();
        String model = ws1.getModel();
        System.out.println("WS 1 model =" + model);

        student_diana_miranovica.lesson_3.WirelessLoudspeaker ws2 = new student_diana_miranovica.lesson_3.WirelessLoudspeaker("Bose", true);
        ws2.switchOn();
        ws2.switchOff();
        String model2 = ws2.getModel();
        System.out.println("WS 2 model =" + model2);


        student_diana_miranovica.lesson_3.WirelessLoudspeaker ws3 = new WirelessLoudspeaker("LG", false);
        ws3.switchOn();
        ws3.switchOff();
        String model3 = ws3.getModel();
        System.out.println("WS 3 model =" + model3);

    }
}

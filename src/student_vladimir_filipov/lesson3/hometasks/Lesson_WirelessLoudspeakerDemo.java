package student_vladimir_filipov.lesson3.hometasks;

public class Lesson_WirelessLoudspeakerDemo {

    public static void main(String[] args) {
        Lesson_WirelessLoudspeaker ws1 = new Lesson_WirelessLoudspeaker("Samsung ",false);
        ws1.switchOn();
        ws1.switchOn();
        ws1.switchOff();
        String model = ws1.getModel();
        System.out.println("WS 1 model =" + model);

        Lesson_WirelessLoudspeaker ws2 = new Lesson_WirelessLoudspeaker("Bose", true);
        ws2.switchOn();
        ws2.switchOff();
        String model2 = ws2.getModel();
        System.out.println("WS 2 model =" + model2);


        Lesson_WirelessLoudspeaker ws3 = new Lesson_WirelessLoudspeaker("LG", false);
        ws3.switchOn();
        ws3.switchOff();
        String model3 = ws3.getModel();
        System.out.println("WS 3 model =" + model3);

    }
}

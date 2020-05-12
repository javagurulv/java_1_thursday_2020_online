package student_diana_miranovica.lesson3.lesson_code;


class WirelessLoudspeakerDemo {
    public static void main(String[] args) {
        WirelessLoudspeaker wireless1 = new WirelessLoudspeaker("Roadster ",false);
        wireless1.switchOn();
        wireless1.switchOn();
        wireless1.switchOff();
        String model = wireless1.getModel();
        System.out.println("WS 1 model = " + model);

        WirelessLoudspeaker wireless2 = new WirelessLoudspeaker("Sony", true);
        wireless2.switchOn();
        wireless2.switchOff();
        String model2 = wireless2.getModel();
        System.out.println("WS 2 model = " + model2);


        WirelessLoudspeaker wireless3 = new WirelessLoudspeaker("LG", false);
        wireless2.switchOn();
        wireless3.switchOff();
        String model3 = wireless3.getModel();
        System.out.println("WS 3 model = " + model3);

    }
}

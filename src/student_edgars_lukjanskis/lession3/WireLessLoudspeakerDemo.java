package student_edgars_lukjanskis.lession3;

class WireLessLoudspeakerDemo {

    public static void main(String[] args) {
        WireLessLoudspeaker ws1 = new WireLessLoudspeaker("Bose",false);
            String model1 = ws1.getModel();
            System.out.println("WS 1 model = " + model1);
            ws1.turnOn();
            ws1.turnOff();

        WireLessLoudspeaker ws2 = new WireLessLoudspeaker("Samsung",true);
            String model2 = ws2.getModel();
            System.out.println("WS 2 model = " + model2);
            ws2.turnOn();
            ws2.turnOff();

        WireLessLoudspeaker ws3 = new WireLessLoudspeaker("Apple", false);
            String model3 = ws3.getModel();
            System.out.println("WS 3 model = " + model3);
            ws3.turnOn();
            ws3.turnOff();
    }
}

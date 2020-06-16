package student_vadim_sokolenko.Lesson2;

class WirelessspeakerDemo {

    public static void main(String[] args) {
        Wirelesspeaker ws1 = new Wirelesspeaker("Bose", false);
        ws1.switchOn();
        String model1 = ws1.getModel();
        System.out.println("Ws 1 model =" + model1);

        Wirelesspeaker ws2 = new Wirelesspeaker("Samsung", true);
        String model2 = ws2.getModel();
        System.out.println("Ws 2 model =" + model2);
        ws2.switchOn();

        Wirelesspeaker ws3 = new Wirelesspeaker("Nokia", false);
        String model3 = ws3.getModel();
        System.out.println("Ws 3 model =" + model3);
        ws2.switchOn();
        ws3.switchOn();
    }


}

package student_vadim_sokolenko;

public class wirelessspeakerDemo {

    public static void main(String[] args) {
        wirelesspeaker ws1 = new wirelesspeaker("Bose", false);
        ws1.switchOn();
        String model1 = ws1.getModel();
        System.out.println("Ws 1 model =" + model1);

        wirelesspeaker ws2 = new wirelesspeaker("Samsung", true);
        String model2 = ws2.getModel();
        System.out.println("Ws 2 model =" + model2);
        ws2.switchOn();

        wirelesspeaker ws3 = new wirelesspeaker("Nokia", false);
        String model3 = ws3.getModel();
        System.out.println("Ws 3 model =" + model3);
        ws2.switchOn();
        ws3.switchOn();
    }


}

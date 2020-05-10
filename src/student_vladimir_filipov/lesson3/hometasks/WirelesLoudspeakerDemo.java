package student_vladimir_filipov.lesson3.hometasks;

public class WirelesLoudspeakerDemo {

    public static void main (String[] args) {

        WirelesLoudspeaker WS1 = new WirelesLoudspeaker ("Samsung",false);
        WS1.switchOn();

        WS1.switchOff();
        String model1 = getString(WS1);
        System.out.println("WS 1 model = " + model1);

        WirelesLoudspeaker WS2 = new WirelesLoudspeaker ("Bose",false);
        WS2.switchOff();
        String model2 = getString(WS2);
        System.out.println("WS 2 model = " + model2);

        WirelesLoudspeaker WS3 = new WirelesLoudspeaker ("NOKIA",false);
        WS3.switchOn();
        String model3 = getString(WS3);
        System.out.println("WS 3 model = " + model3);

    }
    private static String getString(WirelesLoudspeaker WS1) {
        String getModel = WS1.getModel;
        return getModel;
    }

}

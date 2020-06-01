package student_arturs_ragausks;

class WirelessLoudspeekerDemo {   //pokoditj, shtobi firma bila vidna u vseh kolonok

    public static void main(String[] args) {
        WirlessLoudspeeker ws1 = new WirlessLoudspeeker("Xiaomi" , false);
        ws1.switchOn();
        ws1.switchOn();
        ws1.switchOff();
        String model1 = ws1.getModel();
        System.out.println("WS 1 model = " + model1);

        WirlessLoudspeeker ws2 = new WirlessLoudspeeker("Samsung" , true);
        ws2.switchOn();
        String model2 = ws2.getModel();
        System.out.println("WS 2 model = " + model2);

        WirlessLoudspeeker ws3 = new WirlessLoudspeeker("Apple" ,false);
        ws3.switchOn();
        String model3 = ws3.getModel();
        System.out.println("WS 3 model = " + model3);


    }

}

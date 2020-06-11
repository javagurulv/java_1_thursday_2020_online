package student_oleg_ivanov.lesson4.homeWorkDay5;

class LightColorDetectorTest {

    public static void main(String [] arg) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleLight();
    }
    public void violetTest() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(380);
        if (result.equals("Color is violet")) {
            System.out.println("Test colour violet OK");
        } else {
            System.out.println("Test colour violet Fail");
        }
    }
    public void blueTest() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(450);
        if (result.equals("Color is blue")) {
            System.out.println("Test colour blue OK");
        } else {
            System.out.println("Test colour blue Fail");
        }
    }
    public void greenTest() {
       LightColorDetector detector = new LightColorDetector();
       String result = detector.detect(495);
       if (result.equals("Color is green")) {
           System.out.println("Test colour green OK");
       } else {
           System.out.println("Test colour green Fail");
       }
    }
    public void yellowTest() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(570);
        if (result.equals("Color is yellow")) {
            System.out.println("Test colour yellow OK");
        } else {
            System.out.println("Test colour yellow Fail");
        }
    }
    public void orangeTest() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(590);
        if (result.equals("Color is orange")) {
            System.out.println("Test colour orange OK");
        } else {
            System.out.println("Test colour orange Fail");
        }
    }
    public void redTest() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(620);
        if (result.equals("Color is red")) {
            System.out.println("Test colour red OK");
        } else {
            System.out.println("Test colour red Fail");
        }
    }
    public void invisibleLight() {
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(1);
        if (result.equals("Invisible Light")) {
            System.out.println("Test invisible Light OK");
        } else {
            System.out.println("Test invisible Light Fail. " + result);
        }
    }

}
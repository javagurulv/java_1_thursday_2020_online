package student_diana_miranovica.lesson4.homeworks.day_5;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.lightColorDetectorBlueTest();
        lightColorDetectorTest.lightColorDetectorGreenTest();
        lightColorDetectorTest.lightColorDetectorInvisibleTest();
        lightColorDetectorTest.lightColorDetectorOrangeTest();
        lightColorDetectorTest.lightColorDetectorYellowTest();
        lightColorDetectorTest.lightColorDetectorRedTest1();
        lightColorDetectorTest.lightColorDetectorVioletTest();




    }
    public void lightColorDetectorRedTest1() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(690);

        if(result.equals("Red")) {
            System.out.println("LightColorDetector test for RED = OK");
        } else {
            System.out.println("LightColorDetector test for RED = FAIL");
        }
    }
    public void lightColorDetectorOrangeTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(591);
        if(result.equals("Orange")) {
            System.out.println("LightColorDetector test for ORANGE = OK");
        } else {
            System.out.println("LightColorDetector test for ORANGE = FAIL");
        }
    }
    public void lightColorDetectorYellowTest () {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(575);
        if(result.equals("Yellow")) {
            System.out.println("LightColorDetector test for YELLOW = OK");
        } else {
            System.out.println("LightColorDetector test for YELLOW = FAIL");
        }
    }
    public void lightColorDetectorGreenTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(500);
        if(result.equals("Green")) {
            System.out.println("LightColorDetector test for GREEN = OK");
        } else {
            System.out.println("LightColorDetector test for GREEN = FAIL");
        }
    }
    public void lightColorDetectorBlueTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(490);
        if(result.equals("Blue")) {
            System.out.println("LightColorDetector test for BLUE = OK");
        } else {
            System.out.println("LightColorDetector test for BLUE = FAIL");
        }
    }
    public void lightColorDetectorVioletTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(390);
        if(result.equals("Violet")) {
            System.out.println("LightColorDetector test for VIOLET = OK");
        } else {
            System.out.println("LightColorDetector test for VIOLET = FAIL");
        }
    }
    public void lightColorDetectorInvisibleTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(250);
        if(result.equals("Invisible light wave")) {
            System.out.println("LightColorDetector test for Invisible Light wave = OK");
        } else {
            System.out.println("LightColorDetector test for Invisible Light wave = FAIL");
        }
    }
}

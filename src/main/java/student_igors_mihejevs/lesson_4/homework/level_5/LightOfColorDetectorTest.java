package student_igors_mihejevs.lesson_4.homework.level_5;

class LightOfColorDetectorTest {

    public static void main(String[] args) {
        LightOfColorDetectorTest detectorTest = new LightOfColorDetectorTest();

        detectorTest.violetTest();
        detectorTest.blueTest();
        detectorTest.greenTest();
        detectorTest.yellowTest();
        detectorTest.orangeTest();
        detectorTest.redTest();
        detectorTest.invisibleLightITest();
    }

    public void violetTest() {
        LightColorDetector detector = new LightColorDetector();

        int wavelength;
        boolean isOK = true;
        for (wavelength = 380; wavelength <= 449; wavelength++) {
            if (!detector.detect(wavelength).equals("Violet")) isOK = false;
        }
        if (isOK) System.out.println("Violet test - OK");
        else System.out.println("Violet test - FAIL");
    }

    public void blueTest() {
        LightColorDetector detector = new LightColorDetector();

        int wavelength;
        boolean isOK = true;
        for (wavelength = 450; wavelength <= 494; wavelength++) {
            if (!detector.detect(wavelength).equals("Blue")) isOK = false;
        }
        if (isOK) System.out.println("Blue test - OK");
        else System.out.println("Blue test - FAIL");
    }

    public void greenTest() {
        LightColorDetector detector = new LightColorDetector();

        int wavelength;
        boolean isOK = true;
        for (wavelength = 495; wavelength <= 569; wavelength++) {
            if (!detector.detect(wavelength).equals("Green")) isOK = false;
        }
        if (isOK) System.out.println("Green test - OK");
        else System.out.println("Green test - FAIL");
    }

    public void yellowTest() {
        LightColorDetector detector = new LightColorDetector();

        int wavelength;
        boolean isOK = true;
        for (wavelength = 570; wavelength <= 589; wavelength++) {
            if (!detector.detect(wavelength).equals("Yellow")) isOK = false;
        }
        if (isOK) System.out.println("Yellow test - OK");
        else System.out.println("Yellow test - FAIL");
    }

    public void orangeTest() {
        LightColorDetector detector = new LightColorDetector();

        int wavelength;
        boolean isOK = true;
        for (wavelength = 590; wavelength <= 619; wavelength++) {
            if (!detector.detect(wavelength).equals("Orange")) isOK = false;
        }
        if (isOK) System.out.println("Orange test - OK");
        else System.out.println("Orange test - FAIL");
    }

    public void redTest() {
        LightColorDetector detector = new LightColorDetector();

        int wavelength;
        boolean isOK = true;
        for (wavelength = 620; wavelength <= 750; wavelength++) {
            if (!detector.detect(wavelength).equals("Red")) isOK = false;
        }
        if (isOK) System.out.println("Red test - OK");
        else System.out.println("Red test - FAIL");
    }

    public void invisibleLightITest() {
        LightColorDetector detector = new LightColorDetector();

        int wavelength;
        boolean isOK = true;
        for (wavelength = 0; wavelength < 380; wavelength++) {
            if (!detector.detect(wavelength).equals("Invisible Light")) isOK = false;
        }
        for (wavelength = 751; wavelength <= 100000; wavelength++) {
            if (!detector.detect(wavelength).equals("Invisible Light")) isOK = false;
        }
        if (isOK) System.out.println("Invisible Light test - OK");
        else System.out.println("Invisible Light test - FAIL");
    }

}

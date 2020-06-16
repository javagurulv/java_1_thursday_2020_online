package student_vadim_sokolenko.Lesson4.lesson4Day4Task16;

class LightColorDetectorTest {
    public static void main(String[] args) {


        LightColorDetectorTest LightColorDetectorTest = new LightColorDetectorTest();

        LightColorDetectorTest.TestForViolet();
        LightColorDetectorTest.TestForBlue();
        LightColorDetectorTest.TestForGreen();
        LightColorDetectorTest.TestForYellow();
        LightColorDetectorTest.TestForOrange();
        LightColorDetectorTest.TestForRed();
        LightColorDetectorTest.TestForInvisibleLight1();
        LightColorDetectorTest.TestForInvisibleLight2();
        LightColorDetectorTest.TestForInvisibleLight3();



    }
    public void TestForViolet() {
        int wavelength = 399;
        String expectedResult = "Violet";

        LightColorDetector waveLengthTest = new LightColorDetector();
        String result = waveLengthTest.detect(wavelength);

        if (result == expectedResult) {
            System.out.println("Test for " + expectedResult + "Wavelength Is OK");
        } else {
            System.out.println("Test for " + expectedResult + "Wavelength Is Failed");
        }
    }
    public void TestForBlue() {
        int wavelength = 460;
        String expectedResult = "Blue";

        LightColorDetector waveLengthTest = new LightColorDetector();
        String result = waveLengthTest.detect(wavelength);

        if (result == expectedResult) {
            System.out.println("Test for " + expectedResult + "Wavelength Is OK");
        } else {
            System.out.println("Test for " + expectedResult + "Wavelength Is Failed");
        }
    }
    public void TestForGreen() {
        int wavelength = 500;
        String expectedResult = "Green";

        LightColorDetector waveLengthTest = new LightColorDetector();
        String result = waveLengthTest.detect(wavelength);

        if (result == expectedResult) {
            System.out.println("Test for " + expectedResult + "Wavelength Is OK");
        } else {
            System.out.println("Test for " + expectedResult + "Wavelength Is Failed");
        }
    }
    public void TestForYellow() {
            int wavelength = 580;
            String expectedResult = "Yellow";

            LightColorDetector waveLengthTest = new LightColorDetector();
            String result = waveLengthTest.detect(wavelength);

            if (result == expectedResult) {
                System.out.println("Test for " + expectedResult + "Wavelength Is OK");
            } else {
                System.out.println("Test for " + expectedResult + "Wavelength Is Failed");
            }
        }
    public void TestForOrange() {
        int wavelength = 600;
        String expectedResult = "Orange";

        LightColorDetector waveLengthTest = new LightColorDetector();
        String result = waveLengthTest.detect(wavelength);

        if (result == expectedResult) {
            System.out.println("Test for " + expectedResult + "Wavelength Is OK");
        } else {
            System.out.println("Test for " + expectedResult + "Wavelength Is Failed");
        }
    }
    public void TestForRed() {
        int wavelength = 700;
        String expectedResult = "Red";

        LightColorDetector waveLengthTest = new LightColorDetector();
        String result = waveLengthTest.detect(wavelength);

        if (result == expectedResult) {
            System.out.println("Test for " + expectedResult + "Wavelength Is OK");
        } else {
            System.out.println("Test for " + expectedResult + "Wavelength Is Failed");
        }
    }
    public void TestForInvisibleLight1() {
        int wavelength = 100;
        String expectedResult = "Invisible Light";

        LightColorDetector waveLengthTest = new LightColorDetector();
        String result = waveLengthTest.detect(wavelength);

        if (result == expectedResult) {
            System.out.println("Test for " + expectedResult + "Wavelength Is OK");
        } else {
            System.out.println("Test for " + expectedResult + "Wavelength Is Failed");
        }
    }
    public void TestForInvisibleLight2() {
        int wavelength = 200;
        String expectedResult = "Invisible Light";

        LightColorDetector waveLengthTest = new LightColorDetector();
        String result = waveLengthTest.detect(wavelength);

        if (result == expectedResult) {
            System.out.println("Test for " + expectedResult + "Wavelength Is OK");
        } else {
            System.out.println("Test for " + expectedResult + "Wavelength Is Failed");
        }
    }
    public void TestForInvisibleLight3() {
        int wavelength = 999;
        String expectedResult = "Invisible Light";

        LightColorDetector waveLengthTest = new LightColorDetector();
        String result = waveLengthTest.detect(wavelength);

        if (result == expectedResult) {
            System.out.println("Test for " + expectedResult + "Wavelength Is OK");
        } else {
            System.out.println("Test for " + expectedResult + "Wavelength Is Failed");
        }
    }
}

package student_dmitrijs_visuns.homeworks.lesson_4.day_5;

class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest detectorTest = new LightColorDetectorTest();

        detectorTest.TestForViolet();
        detectorTest.TestForBlue();
        detectorTest.TestForGreen();
        detectorTest.TestForYellow();
        detectorTest.TestForOrange();
        detectorTest.TestForRed();
        detectorTest.TestForInvisible1();
        detectorTest.TestForInvisible2();

    }


        public void TestForViolet() {
            int wavelength = 400;
            String expectedResult = "Violet";

            LightColorDetector wavelengthTest = new LightColorDetector();
            String result = wavelengthTest.detect(wavelength);

            if (result == expectedResult) {
                System.out.println("Test for " + expectedResult + " wavelength - OK");
            } else {
                System.out.println("Test for " + expectedResult + " wavelength - FAIL");
            }
        }


    public void TestForBlue() {
        int wavelength = 490;
        String expectedResult = "Blue";

        LightColorDetector wavelengthTest = new LightColorDetector();
        String result = wavelengthTest.detect(wavelength);

        if (result == expectedResult) {
            System.out.println("Test for " + expectedResult + " wavelength - OK");
        } else {
            System.out.println("Test for " + expectedResult + " wavelength - FAIL");
        }
    }


    public void TestForGreen() {
        int wavelength = 500;
        String expectedResult = "Green";

        LightColorDetector wavelengthTest = new LightColorDetector();
        String result = wavelengthTest.detect(wavelength);

        if (result == expectedResult) {
            System.out.println("Test for " + expectedResult + " wavelength - OK");
        } else {
            System.out.println("Test for " + expectedResult + " wavelength - FAIL");
        }
    }


    public void TestForYellow() {
        int wavelength = 580;
        String expectedResult = "Yellow";

        LightColorDetector wavelengthTest = new LightColorDetector();
        String result = wavelengthTest.detect(wavelength);

        if (result == expectedResult) {
            System.out.println("Test for " + expectedResult + " wavelength - OK");
        } else {
            System.out.println("Test for " + expectedResult + " wavelength - FAIL");
        }
    }

    public void TestForOrange() {
        int wavelength = 600;
        String expectedResult = "Orange";

        LightColorDetector wavelengthTest = new LightColorDetector();
        String result = wavelengthTest.detect(wavelength);

        if (result == expectedResult) {
            System.out.println("Test for " + expectedResult + " wavelength - OK");
        } else {
            System.out.println("Test for " + expectedResult + " wavelength - FAIL");
        }
    }


    public void TestForRed() {
        int wavelength = 700;
        String expectedResult = "Red";

        LightColorDetector wavelengthTest = new LightColorDetector();
        String result = wavelengthTest.detect(wavelength);

        if (result == expectedResult) {
            System.out.println("Test for " + expectedResult + " wavelength - OK");
        } else {
            System.out.println("Test for " + expectedResult + " wavelength - FAIL");
        }
    }


    public void TestForInvisible1() {
        int wavelength = 370;
        String expectedResult = "Invisible Light";

        LightColorDetector wavelengthTest = new LightColorDetector();
        String result = wavelengthTest.detect(wavelength);

        if (result == expectedResult) {
            System.out.println("Test for " + expectedResult + " - OK");
        } else {
            System.out.println("Test for " + expectedResult + " - FAIL");
        }
    }

    public void TestForInvisible2() {
        int wavelength = 760;
        String expectedResult = "Invisible Light";

        LightColorDetector wavelengthTest = new LightColorDetector();
        String result = wavelengthTest.detect(wavelength);

        if (result == expectedResult) {
            System.out.println("Test for " + expectedResult + " - OK");
        } else {
            System.out.println("Test for " + expectedResult + " - FAIL");
        }
    }



}

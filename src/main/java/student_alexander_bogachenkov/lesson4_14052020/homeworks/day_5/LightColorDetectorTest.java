package student_alexander_bogachenkov.lesson4_14052020.homeworks.day_5;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest detectorTest = new LightColorDetectorTest();

        detectorTest.testViolet();
        detectorTest.testBlue();
        detectorTest.testGreen();
        detectorTest.testYellow();
        detectorTest.testOrange();
        detectorTest.testRed();
        detectorTest.testInvisibleLight();
    }

    public void testViolet() {
        int waveLength = 397;
        String expectedResult = "Violet";

        LightColorDetector detector = new LightColorDetector();
        String actualResult = detector.detect(waveLength);

        if (actualResult == expectedResult) {
            System.out.println("testViolet PASSED");
        } else {
            System.out.println("testViolet FAILED");
            System.out.println("Expected result = " + expectedResult + ", but actual result = " + actualResult);
        }
    }

    public void testBlue() {
        int waveLength = 467;
        String expectedResult = "Blue";

        LightColorDetector detector = new LightColorDetector();
        String actualResult = detector.detect(waveLength);

        if (actualResult == expectedResult) {
            System.out.println("testBlue PASSED");
        } else {
            System.out.println("testBlue FAILED");
            System.out.println("Expected result = " + expectedResult + ", but actual result = " + actualResult);
        }
    }

    public void testGreen() {
        int waveLength = 517;
        String expectedResult = "Green";

        LightColorDetector detector = new LightColorDetector();
        String actualResult = detector.detect(waveLength);

        if (actualResult == expectedResult) {
            System.out.println("testGreen PASSED");
        } else {
            System.out.println("testGreen FAILED");
            System.out.println("Expected result = " + expectedResult + ", but actual result = " + actualResult);
        }
    }

    public void testYellow() {
        int waveLength = 573;
        String expectedResult = "Yellow";

        LightColorDetector detector = new LightColorDetector();
        String actualResult = detector.detect(waveLength);

        if (actualResult == expectedResult) {
            System.out.println("testYellow PASSED");
        } else {
            System.out.println("testYellow FAILED");
            System.out.println("Expected result = " + expectedResult + ", but actual result = " + actualResult);
        }
    }

    public void testOrange() {
        int waveLength = 604;
        String expectedResult = "Orange";

        LightColorDetector detector = new LightColorDetector();
        String actualResult = detector.detect(waveLength);

        if (actualResult == expectedResult) {
            System.out.println("testOrange PASSED");
        } else {
            System.out.println("testOrange FAILED");
            System.out.println("Expected result = " + expectedResult + ", but actual result = " + actualResult);
        }
    }

    public void testRed() {
        int waveLength = 699;
        String expectedResult = "Red";

        LightColorDetector detector = new LightColorDetector();
        String actualResult = detector.detect(waveLength);

        if (actualResult == expectedResult) {
            System.out.println("testRed PASSED");
        } else {
            System.out.println("testRed FAILED");
            System.out.println("Expected result = " + expectedResult + ", but actual result = " + actualResult);
        }
    }

    public void testInvisibleLight() {
        int waveLength = -789;
        String expectedResult = "Invisible Light";

        LightColorDetector detector = new LightColorDetector();
        String actualResult = detector.detect(waveLength);

        if (actualResult == expectedResult) {
            System.out.println("testInvisibleLight PASSED");
        } else {
            System.out.println("testInvisibleLight FAILED");
            System.out.println("Expected result = " + expectedResult + ", but actual result = " + actualResult);
        }
    }
}

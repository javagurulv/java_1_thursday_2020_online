package student_aleksey_kodin.lesson4.dayx.supertask4.version_2;

class LightColorDetectorTest {
    private static final LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

    public static void main(String[] args) {

        lightColorDetectorTest.testViolet(405);
        lightColorDetectorTest.testBlue(475);
        lightColorDetectorTest.testGreen(505);
        lightColorDetectorTest.testYellow(585);
        lightColorDetectorTest.testOrange(619);
        lightColorDetectorTest.testRed(620);
        lightColorDetectorTest.testInvisible(760);
    }
    private String detect(int wavelength) {
        for (LightColorDetector light: LightColorDetector.values()) {
            return light.detect(wavelength);
        }
    return "Invisible Light";
    }
    private void testViolet(int wavelength) {
        String result = lightColorDetectorTest.detect(wavelength);
        printTestResult(result.equals("VIOLET"),"Violet");

    }
    private void testBlue(int wavelength) {
        String result = lightColorDetectorTest.detect(wavelength);
        printTestResult(result.equals("BLUE"),"Blue");
    }
    private void testGreen(int wavelength) {
        String result = lightColorDetectorTest.detect(wavelength);
        printTestResult(result.equals("GREEN"),"Green");
    }
    private void testYellow(int wavelength) {
        String result = lightColorDetectorTest.detect(wavelength);
        printTestResult(result.equals("YELLOW"),"Yellow");
    }
    private void testOrange(int wavelength) {
        String result = lightColorDetectorTest.detect(wavelength);
        printTestResult(result.equals("ORANGE"),"Orange");
    }
    private void testRed(int wavelength) {
        String result = lightColorDetectorTest.detect(wavelength);
        printTestResult(result.equals("RED"),"Red");
    }
    private void testInvisible(int wavelength) {
        String result = lightColorDetectorTest.detect(wavelength);
        printTestResult(result.equals("Invisible Light"),"Invisible Light");
    }
    private void printTestResult(boolean isResultOk,String waveLengthName) {
        if (isResultOk) {
            System.out.println("LightColorDetector test - " + waveLengthName + " = OK");
        } else {
            System.out.println("LightColorDetector test - " + waveLengthName + " = FAIL");
        }
    }

}

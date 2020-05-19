package student_aleksey_kodin.lesson4.dayx.supertask4;

class LightColorDetectorTest {
    private static final LightColorDetector lightColorDetector = new LightColorDetector();

    public static void main(String[] args) {
    LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.testViolet(405);
        lightColorDetector.testBlue(475);
        lightColorDetector.testGreen(505);
        lightColorDetector.testYellow(585);
        lightColorDetector.testOrange(619);
        lightColorDetector.testRed(620);
        lightColorDetector.testInvisible(760);
}
    public void testViolet(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
            printTestResult(result.equals("Violet"),"Violet");

    }
    public void testBlue(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
            printTestResult(result.equals("Blue"),"Blue");
    }
    public void testGreen(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
            printTestResult(result.equals("Green"),"Green");
    }
    public void testYellow(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
            printTestResult(result.equals("Yellow"),"Yellow");
    }
    public void testOrange(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
            printTestResult(result.equals("Orange"),"Orange");
    }
    public void testRed(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
            printTestResult(result.equals("Red"),"Red");
    }
    public void testInvisible(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
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

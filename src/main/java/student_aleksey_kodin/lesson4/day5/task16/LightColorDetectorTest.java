package student_aleksey_kodin.lesson4.day5.task16;

class LightColorDetectorTest {
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
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Violet")) {
            System.out.println("LightColorDetector test - Violet = OK");
        } else {
            System.out.println("LightColorDetector test - Violet = FAIL");
        }
    }
    public void testBlue(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Blue")) {
            System.out.println("LightColorDetector test - Blue = OK");
        } else {
            System.out.println("LightColorDetector test - Blue = FAIL");
        }
    }
    public void testGreen(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Green")) {
            System.out.println("LightColorDetector test - Green = OK");
        } else {
            System.out.println("LightColorDetector test - Green = FAIL");
        }
    }
    public void testYellow(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Yellow")) {
            System.out.println("LightColorDetector test - Yellow = OK");
        } else {
            System.out.println("LightColorDetector test - Yellow = FAIL");
        }
    }
    public void testOrange(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Orange")) {
            System.out.println("LightColorDetector test - Orange = OK");
        } else {
            System.out.println("LightColorDetector test - Orange = FAIL");
        }
    }
    public void testRed(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Red")) {
            System.out.println("LightColorDetector test - Red = OK");
        } else {
            System.out.println("LightColorDetector test - Red = FAIL");
        }
    }
    public void testInvisible(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Invisible Light")) {
            System.out.println("LightColorDetector test - Invisible Light = OK");
        } else {
            System.out.println("LightColorDetector test - Invisible Light = FAIL");
        }
    }
}

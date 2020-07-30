package student_igors_mihejevs.lesson_4.homework.level_x;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.test("Violet",405);
        lightColorDetector.test("Blue",475);
        lightColorDetector.test("Green",505);
        lightColorDetector.test("Yellow",585);
        lightColorDetector.test("Orange",619);
        lightColorDetector.test("Red",620);
        lightColorDetector.test("Invisible Light",760);
    }
    void test(String color, int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals(color)) {
            System.out.println("LightColorDetector test - "+ color + " = OK");
        } else {
            System.out.println("LightColorDetector test - "+ color + " = FAIL");
        }
    }
}
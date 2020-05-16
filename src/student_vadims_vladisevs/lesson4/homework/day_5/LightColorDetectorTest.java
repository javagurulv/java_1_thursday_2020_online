package student_vadims_vladisevs.lesson4.homework.day_5;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest detector = new LightColorDetectorTest();

        detector.colorDetectorTestViolet();
        detector.colorDetectorTestBlue();
        detector.colorDetectorTestGreen();
        detector.colorDetectorTestYellow();
        detector.colorDetectorTestOrange();
        detector.colorDetectorTestRed();
        detector.colorDetectorTestInvisibleLight();

    }


    public void colorDetectorTestInvisibleLight(){

        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(800);

        if (result.equals("Invisible Light")){
            System.out.println("Light color detector test for invisible Light = OK");
        }
        else {
            System.out.println("Light color detector test for invisible Light = FAIL");
        }

    }

    public void colorDetectorTestRed(){

        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(650);

        if (result.equals("Color is red")){
            System.out.println("Light color detector test for red color = OK");
        }
        else {
            System.out.println("Light color detector test for red color = FAIL");
        }

    }

    public void colorDetectorTestOrange(){

        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(590);

        if (result.equals("Color is orange")){
            System.out.println("Light color detector test for orange color = OK");
        }
        else {
            System.out.println("Light color detector test for orange color = FAIL");
        }

    }

    public void colorDetectorTestYellow(){

        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(580);

        if (result.equals("Color is yellow")){
            System.out.println("Light color detector test for yellow color = OK");
        }
        else {
            System.out.println("Light color detector test for yellow color = FAIL");
        }

    }

    public void colorDetectorTestGreen(){

        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(500);

        if (result.equals("Color is green")){
            System.out.println("Light color detector test for green color = OK");
        }
        else {
            System.out.println("Light color detector test for green color = FAIL");
        }

    }


    public void colorDetectorTestBlue(){

        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(460);

        if (result.equals("Color is blue")){
            System.out.println("Light color detector test for blue color = OK");
        }
        else {
            System.out.println("Light color detector test for blue color = FAIL");
        }

    }

    public void colorDetectorTestViolet(){

        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(400);

        if (result.equals("Color is violet")){
            System.out.println("Light color detector test for violet color = OK");
        }
        else {
            System.out.println("Light color detector test for violet color = FAIL");
        }

    }
}

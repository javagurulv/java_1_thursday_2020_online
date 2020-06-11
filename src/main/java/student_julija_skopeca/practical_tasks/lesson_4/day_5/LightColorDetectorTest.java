package student_julija_skopeca.practical_tasks.lesson_4.day_5;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.testVioletlow();
        lightColorDetectorTest.testVioletmid();
        lightColorDetectorTest.testVioletmax();
        lightColorDetectorTest.testBluelow();
        lightColorDetectorTest.testBluemid();
        lightColorDetectorTest.testBluemax();
        lightColorDetectorTest.testGreenlow();
        lightColorDetectorTest.testGreenmid();
        lightColorDetectorTest.testGreenmax();
        lightColorDetectorTest.testYellowlow();
        lightColorDetectorTest.testYellowmid();
        lightColorDetectorTest.testYellowmax();
        lightColorDetectorTest.testOrangelow();
        lightColorDetectorTest.testOrangemid();
        lightColorDetectorTest.testOrangemax();
        lightColorDetectorTest.testRedlow();
        lightColorDetectorTest.testRedmid();
        lightColorDetectorTest.testRedmax();
        lightColorDetectorTest.testInvisibleNegative();
        lightColorDetectorTest.testInvisibleZero();
        lightColorDetectorTest.testInvisibleMax();
    }
        public void testVioletlow() {
            int wavelength = 380;
            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = lightColorDetector.detect(wavelength);
            if (result == "Violet"){
                System.out.println("Violet low test = OK");
            } else {
                System.out.println("Violet low test = FAIL");
            }
        }

    public void testVioletmid() {
        int wavelength = 400;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Violet"){
            System.out.println("Violet mid test = OK");
        } else {
            System.out.println("Violet mid test = FAIL");
        }
    }

    public void testVioletmax() {
        int wavelength = 449;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Violet"){
            System.out.println("Violet max test = OK");
        } else {
            System.out.println("Violet max test = FAIL");
        }
    }

    public void testBluelow() {
        int wavelength = 450;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Blue"){
            System.out.println("Blue low test = OK");
        } else {
            System.out.println("Blue low test = FAIL");
        }
    }

    public void testBluemid() {
        int wavelength = 500;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Blue"){
            System.out.println("Blue mid test = OK");
        } else {
            System.out.println("Blue mid test = FAIL");
        }
    }

    public void testBluemax() {
        int wavelength = 494;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Blue"){
            System.out.println("Blue max test = OK");
        } else {
            System.out.println("Blue max test = FAIL");
        }
    }

    public void testGreenlow() {
        int wavelength = 495;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Green"){
            System.out.println("Green low test = OK");
        } else {
            System.out.println("Green low test = FAIL");
        }
    }

    public void testGreenmid() {
        int wavelength = 500;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Green"){
            System.out.println("Green mid test = OK");
        } else {
            System.out.println("Green mid test = FAIL");
        }
    }

    public void testGreenmax() {
        int wavelength = 569;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Green"){
            System.out.println("Green max test = OK");
        } else {
            System.out.println("Green max test = FAIL");
        }
    }

    public void testYellowlow() {
        int wavelength = 570;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Yellow"){
            System.out.println("Yellow low test = OK");
        } else {
            System.out.println("Yellow low test = FAIL");
        }
    }

    public void testYellowmid() {
        int wavelength = 580;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Yellow"){
            System.out.println("Yellow mid test = OK");
        } else {
            System.out.println("Yellow mid test = FAIL");
        }
    }

    public void testYellowmax() {
        int wavelength = 589;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Yellow"){
            System.out.println("Yellow max test = OK");
        } else {
            System.out.println("Yellow max test = FAIL");
        }
    }

    public void testOrangelow() {
        int wavelength = 590;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Orange"){
            System.out.println("Orange low test = OK");
        } else {
            System.out.println("Orange low test = FAIL");
        }
    }

    public void testOrangemid() {
        int wavelength = 600;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Orange"){
            System.out.println("Orange mid test = OK");
        } else {
            System.out.println("Orange mid test = FAIL");
        }
    }

    public void testOrangemax() {
        int wavelength = 619;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Orange"){
            System.out.println("Orange max test = OK");
        } else {
            System.out.println("Orange max test = FAIL");
        }
    }

    public void testRedlow() {
        int wavelength = 620;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Red"){
            System.out.println("Red low test = OK");
        } else {
            System.out.println("Red low test = FAIL");
        }
    }

    public void testRedmid() {
        int wavelength = 700;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Red"){
            System.out.println("Red mid test = OK");
        } else {
            System.out.println("Red mid test = FAIL");
        }
    }

    public void testRedmax() {
        int wavelength = 750;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Red"){
            System.out.println("Red max test = OK");
        } else {
            System.out.println("Red max test = FAIL");
        }
    }

    public void testInvisibleNegative() {
        int wavelength = -1;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Invisible Light"){
            System.out.println("Invisible Light negative test = OK");
        } else {
            System.out.println("Invisible Light negative test = FAIL");
        }
    }

    public void testInvisibleZero() {
        int wavelength = -1;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Invisible Light"){
            System.out.println("Invisible Light zero test = OK");
        } else {
            System.out.println("Invisible Light zero test = FAIL");
        }
    }

    public void testInvisibleMax() {
        int wavelength = 1000;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if (result == "Invisible Light"){
            System.out.println("Invisible Light max test = OK");
        } else {
            System.out.println("Invisible Light max test = FAIL");
        }
    }

    }

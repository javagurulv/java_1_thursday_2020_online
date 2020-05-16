package student_aleksey_kodin.lesson5.javaguru.lv.moodle.level2;

class TvTest {
    public static void main(String[] args) {
        TvTest tvTest = new TvTest();
        tvTest.testSetManufacturer();
        tvTest.testTvOffTryNextChannel();
        tvTest.testTvOffTryPrevChannel();
        tvTest.testTvOffTryVolumeUp();
        tvTest.testTvOffTryVolumeDown();
        tvTest.testSetTvOn();
        tvTest.testTvOnTryNextChannel();
        tvTest.testTvOnTryPrevChannel();
        tvTest.testTvOnTryVolumeUp();
        tvTest.testTvOnTryVolumeDown();
        tvTest.testTvOnVolumeDownTryMinValue();
        tvTest.testTvOnVolumeUpTryMaxValue();
    }
    void testSetManufacturer() {
        Tv tv = new Tv("LG");
        String result = tv.getManufacturer();
        if (result.equals("LG")) {
            System.out.println("Tv class test - Set manufacture 'LG', return -> 'LG' test = OK");
        } else {
            System.out.println("Tv class test - Set manufacture 'LG', If return -> 'LG' test = FAIL");
        }
    }
    void testTvOffTryNextChannel() {
        Tv tv = new Tv("LG");
        tv.nextChannel();
        int result = tv.getTvCurrentChannel();
        if (result == 0) {
            System.out.println("Tv class test - TV Off, try next channel -> return 0, test = OK");
        } else {
            System.out.println("Tv class test -  TV Off, try next channel -> return !=0, test = FAIL");
        }
    }
    void testTvOffTryPrevChannel() {
        Tv tv = new Tv("LG");
        tv.prevChannel();
        int result = tv.getTvCurrentChannel();
        if (result == 0) {
            System.out.println("Tv class test - TV Off, try prev channel -> return 0, test = OK");
        } else {
            System.out.println("Tv class test -  TV Off, try prev channel -> return !=0, test = FAIL");
        }
    }
    void testTvOffTryVolumeUp() {
        Tv tv = new Tv("LG");
        tv.volumeUp();
        int result = tv.getCurrentVolume();
        if (result == 0) {
            System.out.println("Tv class test - TV Off, try volume up -> return 0, test = OK");
        } else {
            System.out.println("Tv class test -  TV Off, try volume up -> return !=0, test = FAIL");
        }
    }
    void testTvOffTryVolumeDown() {
        Tv tv = new Tv("LG");
        tv.volumeDown();
        int result = tv.getCurrentVolume();
        if (result == 0) {
            System.out.println("Tv class test - TV Off, try volume down -> return 0, test = OK");
        } else {
            System.out.println("Tv class test -  TV Off, try volume down -> return !=0, test = FAIL");
        }
    }
    void testSetTvOn(){
        Tv tv = new Tv("LG");
        tv.setTvOn(true);
        boolean result = tv.getTvOn();
        if (result) {
            System.out.println("Tv class test - TV On -> return true, test = OK");
        } else {
            System.out.println("Tv class test -  TV On -> return false, test = FAIL");
        }
    }
    void testTvOnTryNextChannel() {
        Tv tv = new Tv("LG");
        tv.setTvOn(true);
        tv.nextChannel();
        int result = tv.getTvCurrentChannel();
        if (result == 1) {
            System.out.println("Tv class test - TV On, try next channel -> return 1, test = OK");
        } else {
            System.out.println("Tv class test -  TV On, try next channel -> return !=1, test = FAIL");
        }
    }
    void testTvOnTryPrevChannel() {
        Tv tv = new Tv("LG");
        tv.setTvOn(true);
        tv.prevChannel();
        int result = tv.getTvCurrentChannel();
        if (result == 999) {
            System.out.println("Tv class test - TV On, try next channel -> return 999, test = OK");
        } else {
            System.out.println("Tv class test -  TV On, try next channel -> return !=999, test = FAIL");
        }
    }
    void testTvOnTryVolumeUp() {
        Tv tv = new Tv("LG");
        tv.setTvOn(true);
        tv.volumeUp();
        int result = tv.getCurrentVolume();
        if (result == 1) {
            System.out.println("Tv class test - TV On, try volume up -> return 1, test = OK");
        } else {
            System.out.println("Tv class test -  TV On, try volume up -> return !=1, test = FAIL");
        }
    }
    void testTvOnTryVolumeDown() {
        Tv tv = new Tv("LG");
        tv.setTvOn(true);
        tv.volumeUp();
        tv.volumeDown();
        int result = tv.getCurrentVolume();
        if (result == 0) {
            System.out.println("Tv class test - TV On, try volume down -> return 0, test = OK");
        } else {
            System.out.println("Tv class test -  TV On, try volume down -> return !=0, test = FAIL");
        }
    }
    void testTvOnVolumeDownTryMinValue() {
        Tv tv = new Tv("LG");
        tv.setTvOn(true);
        tv.volumeDown();
        int result = tv.getCurrentVolume();
        if (result == 0) {
            System.out.println("Tv class test - TV On, volume = 0 try volume down -> return 0, test = OK");
        } else {
            System.out.println("Tv class test -  TV On, volume = 0 try volume down -> return !=0, test = FAIL");
        }
    }
    void testTvOnVolumeUpTryMaxValue() {
        Tv tv = new Tv("LG");
        tv.setTvOn(true);
        for (int count = 0; count < 100; count++) {
            tv.volumeUp();
        }
        tv.volumeUp();
        int result = tv.getCurrentVolume();
        if (result == 100) {
            System.out.println("Tv class test - TV On, volume = 100 try volume up -> return 100, test = OK");
        } else {
            System.out.println("Tv class test -  TV On, volume = 100 try volume up -> return !=100, test = FAIL");
        }
    }
}

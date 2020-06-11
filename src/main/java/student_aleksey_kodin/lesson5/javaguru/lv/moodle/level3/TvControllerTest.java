package student_aleksey_kodin.lesson5.javaguru.lv.moodle.level3;

class TvControllerTest {
    public static void main(String[] args) {
        TvControllerTest tvTest = new TvControllerTest();
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
        Tv tv = new Tv("Samsung");
        TvController tvController = new TvController();
        tvController.setConnectionWithTv(tv);
        String result = tvController.getConnectionTvName();
        if (result.equals("Samsung")) {
            System.out.println("Tv class test - Connect to 'Samsung', return -> 'Samsung' test = OK");
        } else {
            System.out.println("Tv class test - Connect to 'Samsung', If not return -> 'Samsung' test = FAIL");
        }
    }
    void testTvOffTryNextChannel() {
        Tv tv = new Tv("Samsung");
        TvController tvController = new TvController();
        tvController.setConnectionWithTv(tv);
        tvController.nextChannelThroughController();
        int result = tv.getTvCurrentChannel();
        if (result == 0) {
            System.out.println("Tv class test - TV Off, try next channel -> return 0, test = OK");
        } else {
            System.out.println("Tv class test -  TV Off, try next channel -> return !=0, test = FAIL");
        }
    }
    void testTvOffTryPrevChannel() {
        Tv tv = new Tv("Samsung");
        TvController tvController = new TvController();
        tvController.setConnectionWithTv(tv);
        tvController.prevChannelThroughController();
        int result = tv.getTvCurrentChannel();
        if (result == 0) {
            System.out.println("Tv class test - TV Off, try prev channel -> return 0, test = OK");
        } else {
            System.out.println("Tv class test -  TV Off, try prev channel -> return !=0, test = FAIL");
        }
    }
    void testTvOffTryVolumeUp() {
        Tv tv = new Tv("Samsung");
        TvController tvController = new TvController();
        tvController.setConnectionWithTv(tv);
        tvController.volumeUpThroughController();
        int result = tv.getCurrentVolume();
        if (result == 0) {
            System.out.println("Tv class test - TV Off, try volume up -> return 0, test = OK");
        } else {
            System.out.println("Tv class test -  TV Off, try volume up -> return !=0, test = FAIL");
        }
    }
    void testTvOffTryVolumeDown() {
        Tv tv = new Tv("Samsung");
        TvController tvController = new TvController();
        tvController.setConnectionWithTv(tv);
        tvController.volumeDownThroughController();
        int result = tv.getCurrentVolume();
        if (result == 0) {
            System.out.println("Tv class test - TV Off, try volume down -> return 0, test = OK");
        } else {
            System.out.println("Tv class test -  TV Off, try volume down -> return !=0, test = FAIL");
        }
    }
    void testSetTvOn() {
        Tv tv = new Tv("Samsung");
        TvController tvController = new TvController();
        tvController.setConnectionWithTv(tv);
        tvController.setOnThroughController(true);
        boolean result = tv.getTvOn();
        if (result) {
            System.out.println("Tv class test - TV On -> return true, test = OK");
        } else {
            System.out.println("Tv class test -  TV On -> return false, test = FAIL");
        }
    }
    void testTvOnTryNextChannel() {
        Tv tv = new Tv("Samsung");
        TvController tvController = new TvController();
        tvController.setConnectionWithTv(tv);
        tvController.setOnThroughController(true);
        tvController.nextChannelThroughController();
        int result = tv.getTvCurrentChannel();
        if (result == 1) {
            System.out.println("Tv class test - TV On, try next channel -> return 1, test = OK");
        } else {
            System.out.println("Tv class test -  TV On, try next channel -> return !=1, test = FAIL");
        }
    }
    void testTvOnTryPrevChannel() {
        Tv tv = new Tv("Samsung");
        TvController tvController = new TvController();
        tvController.setConnectionWithTv(tv);
        tvController.setOnThroughController(true);
        tvController.prevChannelThroughController();
        int result = tv.getTvCurrentChannel();
        if (result == 999) {
            System.out.println("Tv class test - TV On, try next channel -> return 999, test = OK");
        } else {
            System.out.println("Tv class test -  TV On, try next channel -> return !=999, test = FAIL");
        }
    }
    void testTvOnTryVolumeUp() {
        Tv tv = new Tv("Samsung");
        TvController tvController = new TvController();
        tvController.setConnectionWithTv(tv);
        tvController.setOnThroughController(true);
        tvController.volumeUpThroughController();
        int result = tv.getCurrentVolume();
        if (result == 1) {
            System.out.println("Tv class test - TV On, try volume up -> return 1, test = OK");
        } else {
            System.out.println("Tv class test -  TV On, try volume up -> return !=1, test = FAIL");
        }
    }
    void testTvOnTryVolumeDown() {
        Tv tv = new Tv("Samsung");
        TvController tvController = new TvController();
        tvController.setConnectionWithTv(tv);
        tvController.setOnThroughController(true);
        tvController.volumeUpThroughController();
        tvController.volumeDownThroughController();
        int result = tv.getCurrentVolume();
        if (result == 0) {
            System.out.println("Tv class test - TV On, try volume down -> return 0, test = OK");
        } else {
            System.out.println("Tv class test -  TV On, try volume down -> return !=0, test = FAIL");
        }
    }
    void testTvOnVolumeDownTryMinValue() {
        Tv tv = new Tv("Samsung");
        TvController tvController = new TvController();
        tvController.setConnectionWithTv(tv);
        tvController.setOnThroughController(true);
        tvController.volumeDownThroughController();
        int result = tv.getCurrentVolume();
        if (result == 0) {
            System.out.println("Tv class test - TV On, volume = 0 try volume down -> return 0, test = OK");
        } else {
            System.out.println("Tv class test -  TV On, volume = 0 try volume down -> return !=0, test = FAIL");
        }
    }
    void testTvOnVolumeUpTryMaxValue() {
        Tv tv = new Tv("Samsung");
        TvController tvController = new TvController();
        tvController.setConnectionWithTv(tv);
        tvController.setOnThroughController(true);
        for (int count = 0; count < 100; count++) {
            tvController.volumeUpThroughController();
        }
        tvController.volumeUpThroughController();
        int result = tv.getCurrentVolume();
        if (result == 100) {
            System.out.println("Tv class test - TV On, volume = 100 try volume up -> return 100, test = OK");
        } else {
            System.out.println("Tv class test -  TV On, volume = 100 try volume up -> return !=100, test = FAIL");
        }
    }
}

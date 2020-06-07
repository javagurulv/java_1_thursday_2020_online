package student_edgars_lukjanskis.lession_3;

class WireLessLoudSpeakerTest {

    public static void main(String[] args) {
        WireLessLoudSpeakerTest speakerTest = new WireLessLoudSpeakerTest();

        speakerTest.test1();
        speakerTest.test2();
        speakerTest.test3();
        speakerTest.test4();
        speakerTest.test5();
        speakerTest.test6();
        speakerTest.test7();
    }

    //Test 1 : Turned on?
    public void test1() {
        WireLessLoudSpeaker speaker = new WireLessLoudSpeaker("Apple", false);
        speaker.turnOn();
        if (speaker.isOn() == true) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    //Test 2 : Turned off?
    public void test2() {
        WireLessLoudSpeaker speaker = new WireLessLoudSpeaker("Apple", true);
        speaker.turnOff();
        if (speaker.isOn() == false) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }

    //Test 3 : Speaker is turned on? Can raise volume?
    public void test3() {
        WireLessLoudSpeaker speaker = new WireLessLoudSpeaker("Apple", true);
        int soundVolumeBefore = speaker.getSoundVolume();
        speaker.raiseVolume();
        int soundVolumeAfter = speaker.getSoundVolume();
        if (soundVolumeAfter > soundVolumeBefore) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }
        //Test 4 : Speaker is turned off? Can raise volume?
        public void test4() {
            WireLessLoudSpeaker speaker = new WireLessLoudSpeaker("Apple", false);
            int soundVolumeBefore = speaker.getSoundVolume();
            speaker.raiseVolume();
            int soundVolumeAfter = speaker.getSoundVolume();
            if (soundVolumeAfter == soundVolumeBefore) {
                System.out.println("Test 4 = OK");
            } else {
                System.out.println("Test 4 = FAIL");
            }
        }
        //Test 5 : Speaker is turned on? Can lower volume?
        public void test5() {
            WireLessLoudSpeaker speaker = new WireLessLoudSpeaker("Apple", true);
            speaker.raiseVolume();
            int soundVolumeBefore = speaker.getSoundVolume();
            speaker.lowerVolume();
            int soundVolumeAfter = speaker.getSoundVolume();
            if (soundVolumeAfter < soundVolumeBefore) {
                System.out.println("Test 5 = OK");
            } else {
                System.out.println("Test 5 = FAIL");
            }
        }
    public void test6() {
        WireLessLoudSpeaker speaker = new WireLessLoudSpeaker("Apple", true);
        int soundVolumeBefore = speaker.getSoundVolume();
        speaker.lowerVolume();
        int soundVolumeAfter = speaker.getSoundVolume();
        if ((soundVolumeBefore == 0) && (soundVolumeAfter == 0)) {
            System.out.println("Test 6 = OK");
        } else {
            System.out.println("Test 6 = FAIL");
        }
    }


        //Test 7 : Speaker is turned off? Can lower volume?
        public void test7() {
            WireLessLoudSpeaker speaker = new WireLessLoudSpeaker("Apple", false);
            int soundVolumeBefore = speaker.getSoundVolume();
            speaker.lowerVolume();
            int soundVolumeAfter = speaker.getSoundVolume();
            if (soundVolumeBefore == soundVolumeAfter) {
                System.out.println("Test 7 = OK");
            } else {
                System.out.println("Test 7 = FAIL");
            }
        }


    }

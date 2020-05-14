package student_diana_miranovica.lesson3.lesson_code;

class WirelessLoudspeakerTest {
    public static void main(String[] args) {
        WirelessLoudspeakerTest speakerTest = new WirelessLoudspeakerTest();
        speakerTest.test1();
        speakerTest.test2();
        speakerTest.test3();
        speakerTest.test4();
        speakerTest.test5();
    }


    // is turned on?
    public void test1() {
        WirelessLoudspeaker speaker =
                new WirelessLoudspeaker("Sony", true);
        speaker.switchOn();
        if (speaker.isOn() == true) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = Fail");
        }
    }

    // is turn off?
    public void test2() {
        WirelessLoudspeaker speaker =
                new WirelessLoudspeaker("Sony", true);
        speaker.switchOff();
        if (speaker.isOn() == false) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = Fail");
        }
    }

    // Колонка включена, можно ли увеличить звук
    public void test3() {
        WirelessLoudspeaker speaker =
                new WirelessLoudspeaker("Sony", true);
        int soundVolumeBefore = speaker.getSoundVolume();
        speaker.increaseSound();
        int soundVolumeAfter = speaker.getSoundVolume();
        if (soundVolumeAfter > soundVolumeBefore) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = Fail");
        }
        // Колонка выключена, можно ли увеличить звук


    }

    public void test4() {
        WirelessLoudspeaker speaker =
                new WirelessLoudspeaker("Sony", true);
        int soundVolumeBefore = speaker.getSoundVolume();
        speaker.decreaseSound();
        int soundVolumeAfter = speaker.getSoundVolume();
        if (soundVolumeAfter < soundVolumeBefore) {
            System.out.println("Test 4 = OK");
        } else {
            System.out.println("Test 4 = Fail");
        }

        // Колонка включена, можно ли уменьшить звук
        // Колонка выключена, можно ли уменьшить звук


    }

    public void test5() {
        WirelessLoudspeaker speaker =
                new WirelessLoudspeaker("Sony", true);
        int soundVolumeBefore = speaker.getSoundVolume();
        speaker.decreaseSound();
        int soundVolumeAfter = speaker.getSoundVolume();
        if (soundVolumeAfter < soundVolumeBefore) {
            System.out.println("Test 5 = OK");
        } else {
            System.out.println("Test 5 = Fail");
        }

    }
}
package student_igors_mihejevs.lesson_4.lessoncode;

class WirelesLoudspeekerTest {

	public static void main(String[] args) {
		WirelesLoudspeekerTest speekerTest = new WirelesLoudspeekerTest();
		speekerTest.test1();
		speekerTest.test2();
		speekerTest.test3();
		speekerTest.test4();
		speekerTest.test5();
		speekerTest.test6();
		speekerTest.test7();
	}

	// Включается ли колонка?
	public void test1() {
		WirelesLoudspeeker speeker =
				new WirelesLoudspeeker("Samsumg", false);
		speeker.switchOn();
		if (speeker.isOn() == true) {
			System.out.println("TEST 1 = OK");
		} else {
			System.out.println("TEST 1 = FALSE");
		}
	}

	// Выключается ли колонка
	public void test2() {
		WirelesLoudspeeker speeker =
				new WirelesLoudspeeker("Samsumg", true);
		speeker.switchOff();
		if (speeker.isOn() == false) {
			System.out.println("TEST 2 = OK");
		} else {
			System.out.println("TEST 2 = FALSE");
		}
	}

	// Колонка включена, можно ли увеличить звук
	public void test3() {
		WirelesLoudspeeker speeker =
				new WirelesLoudspeeker("Samsumg", true);
		int soundVolumeBefore = speeker.getSoundVolume();
		speeker.increaseSound();
		int soundVolumeAfter = speeker.getSoundVolume();
		if (soundVolumeAfter > soundVolumeBefore) {
			System.out.println("TEST 3 = OK");
		} else {
			System.out.println("TEST 3 = FALSE");
		}
	}

	// Колонка выключена, можно ли увеличить звук
	public void test4() {
		WirelesLoudspeeker speeker =
				new WirelesLoudspeeker("Samsumg", false);
		int soundVolumeBefore = speeker.getSoundVolume();
		speeker.increaseSound();
		int soundVolumeAfter = speeker.getSoundVolume();
		if (soundVolumeAfter == soundVolumeBefore) {
			System.out.println("TEST 4 = OK");
		} else {
			System.out.println("TEST 4 = FALSE");
		}
	}

	// Колонка включена, можно ли уменьшить звук
	public void test5() {
		WirelesLoudspeeker speeker =
				new WirelesLoudspeeker("Samsumg", true);
		speeker.increaseSound();
		int soundVolumeBefore = speeker.getSoundVolume();
		speeker.decreaseSound();
		int soundVolumeAfter = speeker.getSoundVolume();
		if (soundVolumeAfter < soundVolumeBefore) {
			System.out.println("TEST 5 = OK");
		} else {
			System.out.println("TEST 5 = FALSE");
		}
	}

	public void test6() {
		WirelesLoudspeeker speeker =
				new WirelesLoudspeeker("Samsumg", true);
		int soundVolumeBefore = speeker.getSoundVolume();
		speeker.decreaseSound();
		int soundVolumeAfter = speeker.getSoundVolume();
		if ((soundVolumeBefore == 0) && (soundVolumeAfter == 0)) {
			System.out.println("TEST 6 = OK");
		} else {
			System.out.println("TEST 6 = FALSE");
		}
	}

	// Колонка выключена, можно ли уменьшить звук
	public void test7() {
		WirelesLoudspeeker speeker =
				new WirelesLoudspeeker("Samsumg", false);
		int soundVolumeBefore = speeker.getSoundVolume();
		speeker.decreaseSound();
		int soundVolumeAfter = speeker.getSoundVolume();
		if (soundVolumeBefore == soundVolumeAfter) {
			System.out.println("TEST 7 = OK");
		} else {
			System.out.println("TEST 7 = FALSE");
		}
	}


}

package teacher.lesson_5.lessoncode;

import java.util.Random;

public class ForArrayExample {

	public static void main(String[] args) {

		Random random = new Random();
		//random.nextInt(10000);

		int[] randomNumbers = new int[1000];

		for (int i = 0; i < randomNumbers.length; i++) {
			int randomNumber = random.nextInt(10000);
			randomNumbers[i] = randomNumber;
		}

		for (int i = 0; i < randomNumbers.length; i++) {
			System.out.println(randomNumbers[i]);
		}

	}


}

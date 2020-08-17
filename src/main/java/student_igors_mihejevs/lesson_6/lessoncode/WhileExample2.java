package student_igors_mihejevs.lesson_6.lessoncode;

class WhileExample2 {

	public static void main(String[] args) {
		int number = 0;
		int sum = 0;
		while (sum < 100) {
			sum += number;
			System.out.println("Number = " + number + "  Sum = " + sum);
			number++;
		}

	}

}

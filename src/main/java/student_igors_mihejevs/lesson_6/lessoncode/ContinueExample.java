package student_igors_mihejevs.lesson_6.lessoncode;

class ContinueExample {

	public static void main(String[] args) {
		//int[][] arr = new int[5][5];

		int[][] arr = {{0, 1, 0},
				{4, 5, 9},
				{7, 8, 0}};
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int number = arr[i][j];
				if (j == 1) {
					continue;
				}
				System.out.println("" + i + "," + j + " = " + number);
			}
		}
	}

}

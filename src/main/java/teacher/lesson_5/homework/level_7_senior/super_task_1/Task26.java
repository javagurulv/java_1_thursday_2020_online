package teacher.lesson_5.homework.level_7_senior.super_task_1;

public class Task26 {

	public static void main(String[] args) {
		ArrayUtil arrayUtil = new ArrayUtil();
		int arrayLength = arrayUtil.getArrayLengthFromUser();
		int[] array = arrayUtil.newArray(arrayLength);
		arrayUtil.fillArrayWithRandomNumbers(array);
		arrayUtil.printArray(array);
	}

}

package student_igors_mihejevs.lesson_5.homework.level_x.super_task_1.from_viktor;

public class Task27 {

	public static void main(String[] args) {
		ArrayUtil arrayUtil = new ArrayUtil();
		int[] array = arrayUtil.newArrayWithRandomLength();
		arrayUtil.fillArrayWithRandomNumbers(array);
		arrayUtil.printArray(array);
		int maxNumber = arrayUtil.findMaxInArray(array);
		System.out.println("Max number = " + maxNumber);
	}

}

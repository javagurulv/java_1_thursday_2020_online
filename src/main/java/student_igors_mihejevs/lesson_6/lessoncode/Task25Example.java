package student_igors_mihejevs.lesson_6.lessoncode;

class Task25Example {

	// one line comment

/*
	Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
*/

	public static void main(String[] args) {
		ArrayUtil arrayUtil = new ArrayUtil();

		int arrLength = arrayUtil.getArrayLengthFromUser();
		int[] arr = arrayUtil.createArray(arrLength);
		arrayUtil.fillArrayWithNumbersFromUser(arr);
		arrayUtil.printArrayToConsole(arr);
	}


}

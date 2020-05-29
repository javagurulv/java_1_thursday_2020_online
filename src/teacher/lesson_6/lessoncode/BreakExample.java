package teacher.lesson_6.lessoncode;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Infinite Loop!");
			System.out.print("Enter magic number: ");
			int userNumber = sc.nextInt();
			if (userNumber == 5) {
				break;
			}
		}
		System.out.print("End!");
	}



}

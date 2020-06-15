package teacher.lesson_8.lessoncode;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addTwoNumbers() {
		Calculator calculator = new Calculator();
		int result = calculator.add(1, 2);
		assertEquals(result, 3);
	}

	@Test
	public void addNumbers() {
		Calculator calculator = new Calculator();
		int result = calculator.add(1, 2);
		assertEquals(result, 3);
	}

}
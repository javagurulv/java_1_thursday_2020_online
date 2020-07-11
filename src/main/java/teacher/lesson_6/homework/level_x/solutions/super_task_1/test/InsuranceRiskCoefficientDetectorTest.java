package teacher.lesson_6.homework.level_x.solutions.super_task_1.test;

import java.math.BigDecimal;

import teacher.lesson_6.homework.level_x.solutions.super_task_1.businesslogic.InsuranceRiskCoefficientDetector;
import teacher.lesson_6.homework.level_x.solutions.super_task_1.domain.InsuranceRisk;

public class InsuranceRiskCoefficientDetectorTest {

	private InsuranceRiskCoefficientDetector riskCoefficientDetector = new InsuranceRiskCoefficientDetector();

	public static void main(String[] args) {
		InsuranceRiskCoefficientDetectorTest test = new InsuranceRiskCoefficientDetectorTest();
		test.shouldReturnCorrectCoefficientForFireRiskAndSumLessThenBorder();
		test.shouldReturnCorrectCoefficientForFireRiskAndSumBiggerThenBorder();
		test.shouldReturnCorrectCoefficientForTheftRiskAndSumLessThenBorder();
		test.shouldReturnCorrectCoefficientForTheftRiskAndSumBiggerThenBorder();
	}

	public void shouldReturnCorrectCoefficientForFireRiskAndSumLessThenBorder() {
		BigDecimal coefficient = riskCoefficientDetector.getCoefficient(
				InsuranceRisk.FIRE, new BigDecimal("1000.00"));
		boolean condition = isEquals(coefficient, new BigDecimal("0.03"));
		checkResults(condition, "shouldReturnCorrectCoefficientForFireRiskAndSumLessThenBorder");
	}

	public void shouldReturnCorrectCoefficientForFireRiskAndSumBiggerThenBorder() {
		BigDecimal coefficient = riskCoefficientDetector.getCoefficient(
				InsuranceRisk.FIRE, new BigDecimal("3000.00"));
		boolean condition = isEquals(coefficient, new BigDecimal("0.04"));
		checkResults(condition, "shouldReturnCorrectCoefficientForFireRiskAndSumBiggerThenBorder");
	}

	public void shouldReturnCorrectCoefficientForTheftRiskAndSumLessThenBorder() {
		BigDecimal coefficient = riskCoefficientDetector.getCoefficient(
				InsuranceRisk.THEFT, new BigDecimal("1000.00"));
		boolean condition = isEquals(coefficient, new BigDecimal("0.01"));
		checkResults(condition, "shouldReturnCorrectCoefficientForTheftRiskAndSumLessThenBorder");
	}

	public void shouldReturnCorrectCoefficientForTheftRiskAndSumBiggerThenBorder() {
		BigDecimal coefficient = riskCoefficientDetector.getCoefficient(
				InsuranceRisk.THEFT, new BigDecimal("3000.00"));
		boolean condition = isEquals(coefficient, new BigDecimal("0.02"));
		checkResults(condition, "shouldReturnCorrectCoefficientForTheftRiskAndSumBiggerThenBorder");
	}

	private boolean isEquals(BigDecimal firstNumber, BigDecimal secondNumber) {
		return firstNumber.compareTo(secondNumber) == 0;
	}

	private void checkResults(boolean condition, String testName) {
		if (condition) {
			System.out.println(testName + " = OK");
		} else {
			System.out.println(testName + " = FAIL");
		}
	}

}

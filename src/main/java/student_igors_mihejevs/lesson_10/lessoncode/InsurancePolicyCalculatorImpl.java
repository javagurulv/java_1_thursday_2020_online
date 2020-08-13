package student_igors_mihejevs.lesson_10.lessoncode;

import java.math.BigDecimal;

class InsurancePolicyCalculatorImpl implements InsurancePolicyCalculator {

	@Override
	public BigDecimal calculate(Policy policy) {
		return new BigDecimal("1.0");
	}

}

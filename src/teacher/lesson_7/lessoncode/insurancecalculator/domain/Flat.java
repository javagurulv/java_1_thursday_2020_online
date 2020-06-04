package teacher.lesson_7.lessoncode.insurancecalculator.domain;

import java.math.BigDecimal;

public class Flat extends InsuranceObject {

	public Flat(BigDecimal cadastralValue) {
		super(cadastralValue);
	}

	@Override
	public BigDecimal getRiskCoeficient(InsuranceRisk insuranceRisk) {
		if (InsuranceRisk.FIRE == insuranceRisk) {
			return new BigDecimal("0.02");
		}
		throw new IllegalArgumentException("Insurance risk not supported! " + insuranceRisk);
	}

}

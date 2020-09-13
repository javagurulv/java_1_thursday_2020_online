package teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.businesslogic;

import java.math.BigDecimal;

import teacher.lesson_6.homework.level_7_senior.solutions.super_task_1.domain.InsuranceRisk;

public class InsuranceRiskCoefficientDetector {

	private static final BigDecimal STANDARD_FIRE_RISK_COEF = new BigDecimal("0.03");
	private static final BigDecimal OVERPRICED_FIRE_RISK_COEF = new BigDecimal("0.04");

	private static final BigDecimal STANDARD_THEFT_RISK_COEF = new BigDecimal("0.01");
	private static final BigDecimal OVERPRICED_THEFT_RISK_COEF = new BigDecimal("0.02");

	private static final BigDecimal PRICE_BORDER = new BigDecimal("2000.00");


	public BigDecimal getCoefficient(InsuranceRisk insuranceRisk, BigDecimal sum) {
		if (InsuranceRisk.FIRE == insuranceRisk) {
			if (sum.compareTo(PRICE_BORDER) < 0) {
				return STANDARD_FIRE_RISK_COEF;
			} else {
				return OVERPRICED_FIRE_RISK_COEF;
			}
		}
		if (InsuranceRisk.THEFT == insuranceRisk) {
			if (sum.compareTo(PRICE_BORDER) < 0) {
				return STANDARD_THEFT_RISK_COEF;
			} else {
				return OVERPRICED_THEFT_RISK_COEF;
			}
		}
		throw new IllegalArgumentException("Insurance risk not supported! " + insuranceRisk);
	}

}
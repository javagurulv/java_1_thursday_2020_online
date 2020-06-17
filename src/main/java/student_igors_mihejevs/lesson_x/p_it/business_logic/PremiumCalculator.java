package student_igors_mihejevs.lesson_x.p_it.business_logic;

import student_igors_mihejevs.lesson_x.p_it.domain.Policy;
import student_igors_mihejevs.lesson_x.p_it.domain.PolicyObject;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PremiumCalculator {

    private SubObjectsPremiumCalculator subObjectsPremiumCalculator
            = new SubObjectsPremiumCalculator();

    public BigDecimal calculate(Policy policy) {
        BigDecimal premium = BigDecimal.ZERO;
        for (PolicyObject policyObject : policy.getPolicyObjects()) {
            BigDecimal subObjectRiskPremium = subObjectsPremiumCalculator.calculate(policyObject);
            premium = premium.add(subObjectRiskPremium);
        }
        return premium.setScale(2, RoundingMode.HALF_UP);
    }

}

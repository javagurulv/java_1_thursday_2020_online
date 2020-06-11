package student_igors_mihejevs.pc.business_logic;

import student_igors_mihejevs.pc.domain.PolicyObject;
import student_igors_mihejevs.pc.domain.Policy;

import java.math.BigDecimal;

public class PremiumCalculator {

    private PolicyObjectPremiumCalculator policyObjectPremiumCalculator = new PolicyObjectPremiumCalculator();

    public BigDecimal calculate(Policy policy) {
        BigDecimal premium = BigDecimal.ZERO;
        for (PolicyObject policyObject : policy.getPolicyObjects()) {
            BigDecimal policyObjectPremium = policyObjectPremiumCalculator.calculate(policyObject);

            premium = premium.add(policyObjectPremium);
        }
        return premium;
    }

}

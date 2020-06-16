package student_aleksey_kodin.lesson7.dayx.supertask2_7.supertask6.businesslogic;

import student_aleksey_kodin.lesson7.dayx.supertask2_7.supertask6.domain.InsuranceObject;
import student_aleksey_kodin.lesson7.dayx.supertask2_7.supertask6.domain.InsuranceObjectType;

import java.math.BigDecimal;

public class FloodRiskCoeficientDetector {


    public BigDecimal detect(InsuranceObject insuranceObject) {
        if (InsuranceObjectType.FLAT == insuranceObject.getInsuranceObjectType()) {
            return new BigDecimal("0.001");
        }
        if (InsuranceObjectType.HOUSE == insuranceObject.getInsuranceObjectType()) {
            return new BigDecimal("0.002");
        }
        throw new IllegalArgumentException("Insurance object type not supported! " + insuranceObject.getInsuranceObjectType());
    }
}

package student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6;

import org.junit.Test;
import student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.businesslogic.InsurancePolicyPremiumCalculator;

import student_vadims_vladisevs.lesson7.day_x.super_task_2_3_4_5_6.domain.*;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class InsurancePolicyPremiumCalculatorTest {

    InsurancePolicyPremiumCalculator testCalc = new InsurancePolicyPremiumCalculator();


    @Test
    public void calculateV1() {
        //one object - house
        //sub-objects sum < 2000
        //risk - fire
        Policy policy = new Policy();
        InsuranceObject house = new InsuranceObject(InsuranceObjectType.HOUSE, new BigDecimal("10000"));
        SubInsuranceObject tv = new SubInsuranceObject("Television", new BigDecimal("1500"));
        tv.addInsuranceRisk(InsuranceRisk.FIRE);
        house.addInsuranceRisk(InsuranceRisk.FIRE);
        house.addSubInsuranceObject(tv);
        policy.addInsuranceObject(house);
        BigDecimal actual = testCalc.calculate(policy);
        assertEquals(new BigDecimal("545.00"), actual);
    }

    @Test
    public void calculateV2(){
        //one object - flat
        //sub-objects sum < 2000
        //risk - fire
        Policy policy = new Policy();
        InsuranceObject flat = new InsuranceObject(InsuranceObjectType.FLAT, new BigDecimal("10000"));
        flat.addInsuranceRisk(InsuranceRisk.FIRE);
        SubInsuranceObject tv = new SubInsuranceObject("TV", new BigDecimal("1500"));
        tv.addInsuranceRisk(InsuranceRisk.FIRE);
        flat.addSubInsuranceObject(tv);
        policy.addInsuranceObject(flat);

        BigDecimal actual = testCalc.calculate(policy);
        assertEquals(new BigDecimal("245.00"), actual);
    }

    @Test
    public void calculateV3() {
        //one object - house
        //sub-objects sum > 2000
        //risk - fire
        Policy policy = new Policy();
        InsuranceObject house = new InsuranceObject(InsuranceObjectType.HOUSE, new BigDecimal("10000"));
        SubInsuranceObject tv = new SubInsuranceObject("Television", new BigDecimal("2500"));
        tv.addInsuranceRisk(InsuranceRisk.FIRE);
        house.addInsuranceRisk(InsuranceRisk.FIRE);
        house.addSubInsuranceObject(tv);
        policy.addInsuranceObject(house);
        BigDecimal actual = testCalc.calculate(policy);
        assertEquals(new BigDecimal("600.00"), actual);
    }

    @Test
    public void calculateV4(){
        //one object - flat
        //sub-objects sum > 2000
        //risk - fire
        Policy policy = new Policy();
        InsuranceObject flat = new InsuranceObject(InsuranceObjectType.FLAT, new BigDecimal("10000"));
        flat.addInsuranceRisk(InsuranceRisk.FIRE);
        SubInsuranceObject tv = new SubInsuranceObject("TV", new BigDecimal("2500"));
        tv.addInsuranceRisk(InsuranceRisk.FIRE);
        flat.addSubInsuranceObject(tv);
        policy.addInsuranceObject(flat);

        BigDecimal actual = testCalc.calculate(policy);
        assertEquals(new BigDecimal("300.00"), actual);
    }

    @Test
    public void calculateV5() {
        //one object - house
        //sub-objects sum > 2000
        //risk - fire,theft
        Policy policy = new Policy();
        InsuranceObject house = new InsuranceObject(InsuranceObjectType.HOUSE, new BigDecimal("10000"));
        SubInsuranceObject tv = new SubInsuranceObject("Television", new BigDecimal("2500"));
        SubInsuranceObject pc = new SubInsuranceObject("PC", new BigDecimal("2500"));
        tv.addInsuranceRisk(InsuranceRisk.FIRE);
        pc.addInsuranceRisk(InsuranceRisk.THEFT);
        house.addInsuranceRisk(InsuranceRisk.FIRE);
        house.addSubInsuranceObject(tv);
        house.addSubInsuranceObject(pc);
        policy.addInsuranceObject(house);
        BigDecimal actual = testCalc.calculate(policy);
        assertEquals(new BigDecimal("650.00"), actual);
    }

    @Test
    public void calculateV6() {
        //one object - house
        //sub-objects sum < 2000
        //risk - fire,theft
        Policy policy = new Policy();
        InsuranceObject house = new InsuranceObject(InsuranceObjectType.HOUSE, new BigDecimal("10000"));
        SubInsuranceObject tv = new SubInsuranceObject("Television", new BigDecimal("500"));
        SubInsuranceObject pc = new SubInsuranceObject("PC", new BigDecimal("400"));
        tv.addInsuranceRisk(InsuranceRisk.FIRE);
        pc.addInsuranceRisk(InsuranceRisk.THEFT);
        house.addInsuranceRisk(InsuranceRisk.FIRE);
        house.addSubInsuranceObject(tv);
        house.addSubInsuranceObject(pc);
        policy.addInsuranceObject(house);
        BigDecimal actual = testCalc.calculate(policy);
        assertEquals(new BigDecimal("519.00"), actual);
    }
}
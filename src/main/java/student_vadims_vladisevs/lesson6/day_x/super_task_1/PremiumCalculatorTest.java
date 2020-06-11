package student_vadims_vladisevs.lesson6.day_x.super_task_1;

class PremiumCalculatorTest {
    public static void main(String[] args) {
        PremiumCalculatorTest testCalc = new PremiumCalculatorTest();
        testCalc.oneHouseIsFirePriceTest();
        testCalc.twoHousesIsFirePriceTest();
        testCalc.oneFlatIsFirePriceTest();
        testCalc.twoFlatsIsFirePriceTest();
        testCalc.oneFlatAndOneHouseIsFirePriceTest();
        testCalc.twoFlatsAndTwoHousesIsFirePriceTest();
        testCalc.electronicsSumPriceLess2000IsFirePriceTest();
        testCalc.electronicsSumPriceBigger2000IsFirePriceTest();
        testCalc.electronicsSumPriceLess2000IsTheftPriceTest();
        testCalc.electronicsSumPriceBigger2000IsTheftPriceTest();
        testCalc.houseAndFlatAndElectronicsSumPriceLess2000PolicyPriceTest();
        testCalc.houseAndFlatAndElectronicsSumPriceBigger2000PolicyPriceTest();
    }

    public void printTestResult(double expectedResult, double result) {
        String testName = Thread.currentThread().getStackTrace()[2].getMethodName();
        if (result == expectedResult) {
            System.out.println(testName + " = OK!" + " <||> expected result: " + expectedResult + ". <||> Result: " + result);
        } else {
            System.out.println(testName + " = FAIL!" + " <||> expected result: " + expectedResult + ". <||> Result: " + result);
        }
    }

    public void oneHouseIsFirePriceTest(){
        Policy policy = new Policy();
        PremiumCalculator calc = new PremiumCalculator();
        policy.addPropertyHouse("Riga", 120000);
        double result = calc.calculate(policy);
        printTestResult((6000), result);
    }

    public void twoHousesIsFirePriceTest(){
        Policy policy = new Policy();
        PremiumCalculator calc = new PremiumCalculator();
        policy.addPropertyHouse("Riga", 120000);
        policy.addPropertyHouse("Riga", 100000);
        double result = calc.calculate(policy);
        printTestResult((11000), result);
    }

    public void oneFlatIsFirePriceTest(){
        Policy policy = new Policy();
        PremiumCalculator calc = new PremiumCalculator();
        policy.addPropertyFlat("Riga", 50000);
        double result = calc.calculate(policy);
        printTestResult((1000), result);
    }

    public void twoFlatsIsFirePriceTest(){
        Policy policy = new Policy();
        PremiumCalculator calc = new PremiumCalculator();
        policy.addPropertyFlat("Riga", 50000);
        policy.addPropertyFlat("Riga", 70000);
        double result = calc.calculate(policy);
        printTestResult((2400), result);
    }

    public void oneFlatAndOneHouseIsFirePriceTest(){
        Policy policy = new Policy();
        PremiumCalculator calc = new PremiumCalculator();
        policy.addPropertyFlat("Riga", 50000);
        policy.addPropertyHouse("Riga", 120000);
        double result = calc.calculate(policy);
        printTestResult((7000), result);
    }

    public void twoFlatsAndTwoHousesIsFirePriceTest(){
        Policy policy = new Policy();
        PremiumCalculator calc = new PremiumCalculator();
        policy.addPropertyFlat("Riga", 50000);
        policy.addPropertyHouse("Riga", 120000);
        policy.addPropertyFlat("Riga", 70000);
        policy.addPropertyHouse("Riga", 100000);
        double result = calc.calculate(policy);
        printTestResult((13400), result);
    }

    public void electronicsSumPriceLess2000IsFirePriceTest(){
        Policy policy = new Policy();
        PremiumCalculator calc = new PremiumCalculator();
        policy.addElectronic("Television", 1000);
        double result = policy.isFireElectronic();
        printTestResult((30), result);
    }

    public void electronicsSumPriceBigger2000IsFirePriceTest(){
        Policy policy = new Policy();
        PremiumCalculator calc = new PremiumCalculator();
        policy.addElectronic("Television", 1000);
        policy.addElectronic("Phone", 500);
        policy.addElectronic("Fridge", 720);
        double result = policy.isFireElectronic();
        printTestResult((88.8), result);
    }

    public void electronicsSumPriceLess2000IsTheftPriceTest(){
        Policy policy = new Policy();
        PremiumCalculator calc = new PremiumCalculator();
        policy.addElectronic("Television", 1000);
        double result = policy.isTheftElectronics();
        printTestResult((10), result);
    }

    public void electronicsSumPriceBigger2000IsTheftPriceTest(){
        Policy policy = new Policy();
        PremiumCalculator calc = new PremiumCalculator();
        policy.addElectronic("Television", 1000);
        policy.addElectronic("Phone", 500);
        policy.addElectronic("Fridge", 720);
        double result = policy.isTheftElectronics();
        printTestResult((44.4), result);
    }


    public void houseAndFlatAndElectronicsSumPriceLess2000PolicyPriceTest(){
        Policy policy = new Policy();
        PremiumCalculator calc = new PremiumCalculator();
        policy.addPropertyHouse("Riga", 120000);
        policy.addElectronic("Television", 1000);
        policy.addPropertyFlat("Riga", 50000);
        double result = calc.calculate(policy);
        printTestResult((7040), result);
    }

    public void houseAndFlatAndElectronicsSumPriceBigger2000PolicyPriceTest(){
        Policy policy = new Policy();
        PremiumCalculator calc = new PremiumCalculator();
        policy.addPropertyHouse("Riga", 120000);
        policy.addElectronic("Television", 1000);
        policy.addPropertyFlat("Riga", 50000);
        policy.addElectronic("Phone", 500);
        policy.addElectronic("Fridge", 720);
        double result = calc.calculate(policy);
        printTestResult((7133.2), result);
    }







}

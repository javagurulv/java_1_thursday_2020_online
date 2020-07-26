package student_aleksey_kodin.lesson12;

import java.util.List;

class ProductValidatorImplTest {
    private final ProductTitleValidationRule titleValidationRule = new ProductTitleValidationRule();
    private final ProductPriceValidationRule priceValidationRule = new ProductPriceValidationRule();
    private final ProductDescriptionValidationRule descriptionValidationRule = new ProductDescriptionValidationRule();
    private final ProductValidatorImpl validator = new ProductValidatorImpl(titleValidationRule,
            priceValidationRule, descriptionValidationRule);

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2();
        test.rule3();
        test.rule4();
        test.rule6();
        test.rule7();
        test.rule8();
        test.rule9();
        test.rule9_v2();
    }

    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleTitle().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getErrorMessage().equals("Title can not be empty"), "rule1");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleTitle().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getErrorMessage().equals("Title can not be empty"), "rule1");
    }

    public void rule2() {
        Product product = new Product("AA", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2");
        checkResult(exceptions.get(0).getRuleTitle().equals("RULE-2"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResult(exceptions.get(0).getErrorMessage().equals("Title less 3 symbols"), "rule2");
    }

    public void rule3() {
        Product product = new Product("1".repeat(101), 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3");
        checkResult(exceptions.get(0).getRuleTitle().equals("RULE-3"), "rule3");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResult(exceptions.get(0).getErrorMessage().equals("Title more 100 symbols"), "rule3");
    }

    public void rule4() {
        Product product = new Product("Привет", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleTitle().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getErrorMessage().equals("Title must be only Latin symbols"), "rule4");
    }

    public void rule6() {
        Product product = new Product("Test", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6");
        checkResult(exceptions.get(0).getRuleTitle().equals("RULE-6"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule6");
        checkResult(exceptions.get(0).getErrorMessage().equals("Price must contains only digits"), "rule6");
    }

    public void rule7() {
        Product product = new Product("Test", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule7");
        checkResult(exceptions.get(0).getRuleTitle().equals("RULE-7"), "rule7");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule7");
        checkResult(exceptions.get(0).getErrorMessage().equals("Price no might be 0"), "rule7");
    }

    public void rule8() {
        Product product = new Product("Test", 1, "1".repeat(2001));
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleTitle().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule8");
        checkResult(exceptions.get(0).getErrorMessage().equals("Title more 2000 symbols"), "rule8");
    }

    public void rule9() {
        Product product = new Product("Test", 1, "Привет");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule9");
        checkResult(exceptions.get(0).getRuleTitle().equals("RULE-9"), "rule9");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule9");
        checkResult(exceptions.get(0).getErrorMessage().equals("Title must be only Latin symbols and digits"), "rule9");
    }

    public void rule9_v2() {
        Product product = new Product("Test", 1, "Hi%");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule9_v2");

        checkResult(exceptions.get(0).getRuleTitle().equals("RULE-9"), "rule9_v2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule9_v2");
        checkResult(exceptions.get(0).getErrorMessage().equals("Title must be only Latin symbols and digits"), "rule9_v2");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}

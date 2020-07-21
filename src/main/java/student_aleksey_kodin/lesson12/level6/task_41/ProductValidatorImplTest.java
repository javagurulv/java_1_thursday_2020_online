package student_aleksey_kodin.lesson12.level6.task_41;

import java.util.List;

class ProductValidatorImplTest {
    private final ProductTitleValidationRule titleValidationRule = new ProductTitleValidationRule();
    private final ProductValidatorImpl validator = new ProductValidatorImpl(titleValidationRule);

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule1_v3();
        test.rule1_v4();
        test.rule1_v5();

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

    public void rule1_v3() {
        Product product = new Product("AA", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleTitle().equals("RULE-2"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getErrorMessage().equals("Title less 3 symbols"), "rule1");
    }

    public void rule1_v4() {
        Product product = new Product("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleTitle().equals("RULE-3"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getErrorMessage().equals("Title more 100 symbols"), "rule1");
    }

    public void rule1_v5() {
        Product product = new Product("Привет", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleTitle().equals("RULE-4"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getErrorMessage().equals("Title must be only Latin symbols"), "rule1");
    }


    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}

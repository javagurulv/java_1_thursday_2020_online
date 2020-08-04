package student_dmitrijs_visuns.homeworks.lesson_12.level_6.task_46;

import java.util.List;

class ProductValidatorImplTest {

    private ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(),
                                                                  new ProductPriceValidationRule(),
                                                                  new ProductDescriptionValidationRule());

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_rule_5();
        test.rule1_rule_8();
        test.rule6_rule_8();
        test.rule1_rule6_rule_8();
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }


    public void rule1_rule_5() {
        ValidationException rule1 = new ValidationException("RULE-1", "Title can not be empty", "title");
        ValidationException rule5 = new ValidationException("RULE-5", "Price field cannot be empty", "price");
        Product product = new Product(null, null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule1_rule_5");
        checkResult(exceptions.contains(rule1), "contains rule_1");
        checkResult(exceptions.contains(rule5), "contains rule_5");

    }

    public void rule1_rule_8() {
        ValidationException rule1 = new ValidationException("RULE-1", "Title can not be empty", "title");
        ValidationException rule8 = new ValidationException("RULE-8", "Description in latin characters and numbers only", "description");
        Product product = new Product("", 1, "дескрипция");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule1_rule_8");
        checkResult(exceptions.contains(rule1), "contains rule_1");
        checkResult(exceptions.contains(rule8), "contains rule_8");

    }

    public void rule6_rule_8() {
        ValidationException rule6 = new ValidationException("RULE-6", "Price must be more than zero", "price");
        ValidationException rule8 = new ValidationException("RULE-8", "Description in latin characters and numbers only", "description");
        Product product = new Product("Pineapple", -1, "дескрипция");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule1_rule_8");
        checkResult(exceptions.contains(rule6), "contains rule_6");
        checkResult(exceptions.contains(rule8), "contains rule_8");

    }

    public void rule1_rule6_rule_8() {
        ValidationException rule1 = new ValidationException("RULE-1", "Title can not be empty", "title");
        ValidationException rule6 = new ValidationException("RULE-6", "Price must be more than zero", "price");
        ValidationException rule8 = new ValidationException("RULE-8", "Description in latin characters and numbers only", "description");
        Product product = new Product("", -1, "дескрипция");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 3, "rule1_rule_8");
        checkResult(exceptions.contains(rule1), "contains rule_1");
        checkResult(exceptions.contains(rule6), "contains rule_6");
        checkResult(exceptions.contains(rule8), "contains rule_8");

    }






}
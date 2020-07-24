package student_vadims_vladisevs.lesson_12.level_6;


import java.util.List;

class ProductValidatorImplTest {

    ProductTitleValidationRule productTitleValidationRule = new ProductTitleValidationRule();
    ProductDescriptionValidationRule productDescriptionValidationRule = new ProductDescriptionValidationRule();
    ProductPriceValidationRule productPriceValidationRule = new ProductPriceValidationRule();

    private ProductValidator validator = new ProductValidatorImpl(productTitleValidationRule, productPriceValidationRule, productDescriptionValidationRule);

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2_v1();
        test.rule2_v2();
        test.rule3();
        test.rule4();
        test.rule5();
        test.rule6_v1();
        test.rule6_v2();
        test.rule8();
        test.rule9();
        test.rule1_5_v1();
        test.rule1_5_v2();
        test.rule2_6_v1();
        test.rule2_6_v2();
        test.rule3_8();
        test.rule4_9();
        test.rule5_9();
        test.rule6_8();
        test.rule1_6_9();
        test.rule4_5_9();
    }

    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule2_v1() {
        Product product = new Product("a", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResult(exceptions.get(0).getDescription().equals("Title is shorter than 3 symbols"), "rule2");
    }

    public void rule2_v2() {
        Product product = new Product("ba", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResult(exceptions.get(0).getDescription().equals("Title is shorter than 3 symbols"), "rule2");
    }

    public void rule3() {
        String name = "qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm";
        Product product = new Product(name, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResult(exceptions.get(0).getDescription().equals("Title is longer then 100 symbols"), "rule3");
    }

    public void rule4() {
        Product product = new Product("название", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Title must contain only English alphabet symbols and numbers"), "rule4");
    }

    public void rule5() {
        Product product = new Product("name", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule5");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule5");
        checkResult(exceptions.get(0).getDescription().equals("Price can not be empty"), "rule5");
    }

    public void rule6_v1() {
        Product product = new Product("name", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResult(exceptions.get(0).getDescription().equals("Price must be bigger than 0"), "rule6");
    }

    public void rule6_v2() {
        Product product = new Product("name", -10, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResult(exceptions.get(0).getDescription().equals("Price must be bigger than 0"), "rule6");
    }

    public void rule8() {
        String description1 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String description2 = description1 + description1 + description1 + description1 + description1;
        String description = description2 + description2;
        Product product = new Product("name", 1, description);
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("Description is longer than 2000 symbols"), "rule8");
    }

    public void rule9() {
        Product product = new Product("name", 1, "описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule9");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-9"), "rule9");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule9");
        checkResult(exceptions.get(0).getDescription().equals("Descriptions must contain only ENG symbols and numbers"), "rule9");
    }

    public void rule1_5_v1() {
        ValidationException rule_1 = new ValidationException("RULE-1", "Title can not be empty", "title");
        ValidationException rule_5 = new ValidationException("RULE-5", "Price can not be empty", "price");
        Product product = new Product("", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule1_5");
        checkResult(exceptions.contains(rule_1), "rule1_5");
        checkResult(exceptions.contains(rule_5), "rule1_5");
    }

    public void rule1_5_v2() {
        ValidationException rule_1 = new ValidationException("RULE-1", "Title can not be empty", "title");
        ValidationException rule_5 = new ValidationException("RULE-5", "Price can not be empty", "price");
        Product product = new Product(null, null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule1_5");
        checkResult(exceptions.contains(rule_1), "rule1_5");
        checkResult(exceptions.contains(rule_5), "rule1_5");

    }

    public void rule2_6_v1() {
        ValidationException rule_2 = new ValidationException("RULE-2", "Title is shorter than 3 symbols", "title");
        ValidationException rule_6 = new ValidationException("RULE-6", "Price must be bigger than 0", "price");
        Product product = new Product("na", -1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule2_6");
        checkResult(exceptions.contains(rule_2), "rule2_6");
        checkResult(exceptions.contains(rule_6), "rule2_6");
    }

    public void rule2_6_v2() {
        ValidationException rule_2 = new ValidationException("RULE-2", "Title is shorter than 3 symbols", "title");
        ValidationException rule_6 = new ValidationException("RULE-6", "Price must be bigger than 0", "price");
        Product product = new Product("na", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule2_6");
        checkResult(exceptions.contains(rule_2), "rule2_6");
        checkResult(exceptions.contains(rule_6), "rule2_6");

    }

    public void rule3_8() {
        ValidationException rule_3 = new ValidationException("RULE-3", "Title is longer then 100 symbols", "title");
        ValidationException rule_8 = new ValidationException("RULE-8", "Description is longer than 2000 symbols", "description");
        String name = "qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm";
        String description1 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String description2 = description1 + description1 + description1 + description1 + description1;
        String description = description2 + description2;
        Product product = new Product(name, 2, description);
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule3_8");
        checkResult(exceptions.contains(rule_3), "rule3_8");
        checkResult(exceptions.contains(rule_8), "rule3_8");

    }

    public void rule4_9() {
        ValidationException rule_4 = new ValidationException("RULE-4", "Title must contain only English alphabet symbols and numbers", "title");
        ValidationException rule_9 = new ValidationException("RULE-9", "Descriptions must contain only ENG symbols and numbers", "description");
        Product product = new Product("название", 2, "описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule4_9");
        checkResult(exceptions.contains(rule_4), "rule4_9");
        checkResult(exceptions.contains(rule_9), "rule4_9");

    }

    public void rule5_9() {
        ValidationException rule_5 = new ValidationException("RULE-5", "Price can not be empty", "price");
        ValidationException rule_9 = new ValidationException("RULE-9", "Descriptions must contain only ENG symbols and numbers", "description");
        Product product = new Product("name", null, "описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule5_9");
        checkResult(exceptions.contains(rule_5), "rule5_9");
        checkResult(exceptions.contains(rule_9), "rule5_9");

    }

    public void rule6_8() {
        ValidationException rule_6 = new ValidationException("RULE-6", "Price must be bigger than 0", "price");
        ValidationException rule_8 = new ValidationException("RULE-8", "Description is longer than 2000 symbols", "description");
        String description1 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String description2 = description1 + description1 + description1 + description1 + description1;
        String description = description2 + description2;
        Product product = new Product("name", -10, description);
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 2, "rule6_8");
        checkResult(exceptions.contains(rule_6), "rule6_8");
        checkResult(exceptions.contains(rule_8), "rule6_8");

    }

    public void rule1_6_9() {
        ValidationException rule_1 = new ValidationException("RULE-1", "Title can not be empty", "title");
        ValidationException rule_6 = new ValidationException("RULE-6", "Price must be bigger than 0", "price");
        ValidationException rule_9 = new ValidationException("RULE-9", "Descriptions must contain only ENG symbols and numbers", "description");
        Product product = new Product(null, -10, "описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 3, "rule1_6_9");
        checkResult(exceptions.contains(rule_6), "rule1_6_9");
        checkResult(exceptions.contains(rule_1), "rule1_6_9");
        checkResult(exceptions.contains(rule_9), "rule1_6_9");

    }

    public void rule4_5_9() {
        ValidationException rule_4 = new ValidationException("RULE-4", "Title must contain only English alphabet symbols and numbers", "title");
        ValidationException rule_5 = new ValidationException("RULE-5", "Price can not be empty", "price");
        ValidationException rule_9 = new ValidationException("RULE-9", "Descriptions must contain only ENG symbols and numbers", "description");
        Product product = new Product("название", null, "описание");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 3, "rule4_5_9");
        checkResult(exceptions.contains(rule_4), "rule4_5_9");
        checkResult(exceptions.contains(rule_5), "rule4_5_9");
        checkResult(exceptions.contains(rule_9), "rule4_5_9");

    }


    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}



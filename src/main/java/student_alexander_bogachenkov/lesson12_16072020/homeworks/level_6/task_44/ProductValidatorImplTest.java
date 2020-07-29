package student_alexander_bogachenkov.lesson12_16072020.homeworks.level_6.task_44;

import java.util.List;

class ProductValidatorImplTest {

    private ProductValidator validator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule());

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2_v1();
        test.rule2_v2();
        test.rule3_v1();
        test.rule3_v2();
        test.rule4_v1();
        test.rule4_v2();
        test.rule5_v1();
        test.rule6_v1();
        test.rule6_v2();
        test.rule7_v1();
        test.rule7_v2();
        test.rule8_v1();
        test.rule8_v2();
    }

    public void rule1_v1() throws NullPointerException {
        try {
            Product product = new Product(null, 1, "description");
            List<ValidationException> exceptions = validator.validate(product);
            checkResult(exceptions.size() == 1, "rule1");
            checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
            checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
            checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
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
        Product product = new Product("ti", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be shorter than 3 characters"), "rule2");
    }

    public void rule2_v2() {
        Product product = new Product("t", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be shorter than 3 characters"), "rule2");
    }

    public void rule3_v1() {
        Product product = new Product("here is exactly 101 characters sdfsdfsdfsdfsdfsdfsdfsdfsdfsfsdfsdfsdfsdfsdfsdfsdfsdfsdfssdfsdfsdfssdf", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be longer than 100 characters"), "rule3");
    }

    public void rule3_v2() {
        Product product = new Product("here is exactly 102 characters sdfsddfsdfsdfsdfsdfsdfsdfsdfsfsdfsdfsdfsdfsdfsdfsdfsdfsdfssdfsdfsdfssdf", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be longer than 100 characters"), "rule3");
    }

    public void rule4_v1() {
        Product product = new Product("tфыввфi", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Title must contain only english alphabet letters and numbers"), "rule4");
    }

    public void rule4_v2() {
        Product product = new Product("title&$", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Title must contain only english alphabet letters and numbers"), "rule4");
    }

    public void rule5_v1() {
        Product product = new Product("title", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule5");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule5");
        checkResult(exceptions.get(0).getDescription().equals("Price can not be empty"), "rule5");
    }

    public void rule6_v1() {
        Product product = new Product("title", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResult(exceptions.get(0).getDescription().equals("Price must be greater than zero"), "rule6");
    }

    public void rule6_v2() {
        Product product = new Product("title", -5, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResult(exceptions.get(0).getDescription().equals("Price must be greater than zero"), "rule6");
    }

    public void rule7_v1() {
        Product product = new Product("title", 1, "here is exactly 2001 characters Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. At in tellus integer feugiat scelerisque varius morbi. Dignissim sodales ut eu sem. Enim sit amet venenatis urna cursus. Nisi lacus sed viverra tellus in hac. Pharetra magna ac placerat vestibulum lectus mauris ultrices eros. Nisl nunc mi ipsum faucibus vitae aliquet nec ullamcorper sit. Eu tincidunt tortor aliquam nulla facilisi cras fermentum odio. Tellus cras adipiscing enim eu turpis egestas pretium. Non sodales neque sodales ut. Imperdiet nulla malesuada pellentesque elit eget gravida cum sociis here is exactly 2001 characters Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. At in tellus integer feugiat scelerisque varius morbi. Dignissim sodales ut eu sem. Enim sit amet venenatis urna cursus. Nisi lacus sed viverra tellus in hac. Pharetra magna ac placerat vestibulum lectus mauris ultrices eros. Nisl nunc mi ipsum faucibus vitae aliquet nec ullamcorper sit. Eu tincidunt tortor aliquam nulla facilisi cras fermentum odio. Tellus cras adipiscing enim eu turpis egestas pretium. Non sodales neque sodales ut. Imperdiet nulla malesuada pellentesque elit eget gravida cum sociis here is exactly 2001 characters Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. At in tellus integer feugiat scelerisque varius morbi. Dignissim sodales ut eu sem. Enim sit amet venenatis urna cursus. Nisi lacus sed viverra tellus in hac. Pharetra magna ac placerat vestibulum lectus mauris ultrices eros. Nisl nunc mi ipsum faucibus vitae aliquet nec ullamcorper sit. Eu tincidunt tortor aliquam nulla facilisi cras fermentum odio. Tellus cras adipiscing enim eu turpis egestas pretium. Non sodales neque sodales ut. Imperdiet nulla malesuada pellentesque elit eget gravida cum sociis sodales nequewe");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule7");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-7"), "rule7");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule7");
        checkResult(exceptions.get(0).getDescription().equals("Description can not be longer than 2000 characters"), "rule7");
    }

    public void rule7_v2() {
        Product product = new Product("title", 1, "here is exactly 2002 characters Lorem ipsmum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. At in tellus integer feugiat scelerisque varius morbi. Dignissim sodales ut eu sem. Enim sit amet venenatis urna cursus. Nisi lacus sed viverra tellus in hac. Pharetra magna ac placerat vestibulum lectus mauris ultrices eros. Nisl nunc mi ipsum faucibus vitae aliquet nec ullamcorper sit. Eu tincidunt tortor aliquam nulla facilisi cras fermentum odio. Tellus cras adipiscing enim eu turpis egestas pretium. Non sodales neque sodales ut. Imperdiet nulla malesuada pellentesque elit eget gravida cum sociis here is exactly 2001 characters Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. At in tellus integer feugiat scelerisque varius morbi. Dignissim sodales ut eu sem. Enim sit amet venenatis urna cursus. Nisi lacus sed viverra tellus in hac. Pharetra magna ac placerat vestibulum lectus mauris ultrices eros. Nisl nunc mi ipsum faucibus vitae aliquet nec ullamcorper sit. Eu tincidunt tortor aliquam nulla facilisi cras fermentum odio. Tellus cras adipiscing enim eu turpis egestas pretium. Non sodales neque sodales ut. Imperdiet nulla malesuada pellentesque elit eget gravida cum sociis here is exactly 2001 characters Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. At in tellus integer feugiat scelerisque varius morbi. Dignissim sodales ut eu sem. Enim sit amet venenatis urna cursus. Nisi lacus sed viverra tellus in hac. Pharetra magna ac placerat vestibulum lectus mauris ultrices eros. Nisl nunc mi ipsum faucibus vitae aliquet nec ullamcorper sit. Eu tincidunt tortor aliquam nulla facilisi cras fermentum odio. Tellus cras adipiscing enim eu turpis egestas pretium. Non sodales neque sodales ut. Imperdiet nulla malesuada pellentesque elit eget gravida cum sociis sodales nequewe");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule7");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-7"), "rule7");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule7");
        checkResult(exceptions.get(0).getDescription().equals("Description can not be longer than 2000 characters"), "rule7");
    }

    public void rule8_v1() {
        Product product = new Product("title", 1, "tфыввфi");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("Description must contain only english alphabet letters and numbers"), "rule8");
    }

    public void rule8_v2() {
        Product product = new Product("title", 1, "description&$");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResult(exceptions.get(0).getDescription().equals("Description must contain only english alphabet letters and numbers"), "rule8");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
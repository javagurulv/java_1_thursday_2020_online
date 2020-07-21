package student_aleksey_kodin.lesson12.level6.task_43;

class ProductPriceValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        /*if (checkParam.matches("^[^0-9]+$")) {
            throw new ValidationException("RULE-6","Price must contains only digits","title");
        }*/
        if (product.getProductPrice() == 0) {
            throw new ValidationException("RULE-7","Price no might be 0","title");
        }
    }
}

package student_aleksey_kodin.lesson12;

class ProductPriceValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getProductPrice() == 0) {
            throw new ValidationException("RULE-7","Price no might be 0","title");
        }
    }
}

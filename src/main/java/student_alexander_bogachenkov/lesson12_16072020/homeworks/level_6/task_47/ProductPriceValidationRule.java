package student_alexander_bogachenkov.lesson12_16072020.homeworks.level_6.task_47;

class ProductPriceValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        Integer productPrice = product.getPrice();
        if (productPrice == null) {
            throw new ValidationException("RULE-5", "Price can not be empty", "price");
        } else if (!isMoreThanZero(productPrice)) {
            throw new ValidationException("RULE-6", "Price must be greater than zero", "price");
        }
    }

    private boolean isMoreThanZero(Integer productPrice) {
        return productPrice > 0;
    }

}

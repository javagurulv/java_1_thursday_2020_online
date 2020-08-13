package student_dmitrijs_visuns.homeworks.lesson_12.level_6.task_43;

class ProductPriceValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {

        if (hasNullPrice(product)) {
            throw new ValidationException("RULE-5", "Price field cannot be empty", "price");
        }

        if (priceIsLessThanZero(product)) {
            throw new ValidationException("RULE-6", "Price must be more than zero", "price");
        }

    }


    private boolean hasNullPrice (Product product) {
        return product.getPrice() == null;
    }

    private boolean priceIsLessThanZero (Product product) {
        return product.getPrice() <= 0;
    }

}

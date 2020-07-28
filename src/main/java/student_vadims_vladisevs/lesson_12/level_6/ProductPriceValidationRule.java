package student_vadims_vladisevs.lesson_12.level_6;

class ProductPriceValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {

        if (isPriceEmpty(product)){
            throw new ValidationException("RULE-5", "Price can not be empty", "price");
        }


        if (isPriceBiggerThanZero(product)){
            throw new ValidationException("RULE-6", "Price must be bigger than 0", "price");
        }
    }

    private boolean isPriceEmpty(Product product){
        return product.getPrice() == null;
    }

    private boolean isPriceBiggerThanZero(Product product){
        return product.getPrice() <= 0;
    }

}

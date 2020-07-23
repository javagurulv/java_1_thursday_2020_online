package student_vadims_vladisevs.lesson_12.level_6;

class ProductPriceValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {

        try {
            int temp = product.getPrice();
        } catch (NumberFormatException e){
            throw new ValidationException("RULE-6", "Price must contain only numbers", "price");
        }

        if (isPriceEmpty(product)){
            throw new ValidationException("RULE-5", "Price can not be empty", "price");
        }


        if (isPriceZero(product)){
            throw new ValidationException("RULE-7", "Price can not be 0", "price");
        }
    }

    private boolean isPriceEmpty(Product product){
        return product.getPrice() == null;
    }

    private boolean isPriceZero(Product product){
        return product.getPrice() == 0;
    }

}

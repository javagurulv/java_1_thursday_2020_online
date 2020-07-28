package student_vadims_vladisevs.lesson_12.level_6;

class ProductDescriptionValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {

        if (isDescriptionLongerThan2000Symbols(product)){
            throw new ValidationException("RULE-8", "Description is longer than 2000 symbols", "description");
        }

        if(!isDescriptionContainOnlyEngSymbolsAndNumbers(product)){
            throw new ValidationException("RULE-9", "Descriptions must contain only ENG symbols and numbers", "description");
        }

    }


    private boolean isDescriptionLongerThan2000Symbols(Product product){
        return product.getDescription().length() > 2000;
    }

    private boolean isDescriptionContainOnlyEngSymbolsAndNumbers(Product product){
        return product.getDescription().matches("^[a-zA-Z0-9 ]*$");
    }
}

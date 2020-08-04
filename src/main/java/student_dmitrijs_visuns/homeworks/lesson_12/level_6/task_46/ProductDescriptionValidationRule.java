package student_dmitrijs_visuns.homeworks.lesson_12.level_6.task_46;

class ProductDescriptionValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {

        if (isBiggerThan2000Chars(product)) {
            throw new ValidationException("RULE-7", "Description length cannot exceed 2000 characters", "description");
        }

        if (descriptionContainsWrongCharacters(product)) {
            throw new ValidationException("RULE-8", "Description in latin characters and numbers only", "description");
        }

    }


    private boolean isBiggerThan2000Chars (Product product) {
        return product.getDescription().length() > 2000;
    }

    private boolean descriptionContainsWrongCharacters (Product product) {
        return !product.getDescription().matches("^[a-zA-Z0-9 ]*$");
    }
}

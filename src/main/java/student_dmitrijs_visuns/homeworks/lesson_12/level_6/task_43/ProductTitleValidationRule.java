package student_dmitrijs_visuns.homeworks.lesson_12.level_6.task_43;

class ProductTitleValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {

        if ( (hasNullTitle(product)) || (hasEmptyTitle(product)) ) {
            throw new ValidationException("RULE-1", "Title can not be empty", "title");
        }

        if (TitleShorterThan3Characters(product)) {
            throw new ValidationException("RULE-2", "Title must be at least 3 characters long", "title");
        }

        if (TitleLongerThan100Characters(product)) {
            throw new ValidationException("RULE-3", "Title length should not exceed 100 characters", "title");
        }

        if (TitleContainsWrongCharacters(product)) {
            throw new ValidationException("RULE-4", "Title should contain latin letters and numbers only", "title");
        }

    }


    private boolean hasNullTitle (Product product) {
        return product.getTitle() == null;
    }

    private boolean hasEmptyTitle (Product product) {
        return product.getTitle().isBlank();
    }

    private boolean TitleShorterThan3Characters(Product product) {
        return product.getTitle().length() < 3;
    }

    private boolean TitleLongerThan100Characters(Product product) {
        return product.getTitle().length() > 100;
    }

    private boolean TitleContainsWrongCharacters(Product product) {
        return !product.getTitle().matches("^[a-zA-Z0-9 ]*$");
    }

}


package student_alexander_bogachenkov.lesson12_16072020.homeworks.level_6.task_46;

class ProductTitleValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        String productTitle = product.getTitle();
        if (productTitle == null || productTitle.equals("")) {
            throw new ValidationException("RULE-1", "Title can not be empty", "title");
        } else if (hasLessThan3Characters(productTitle)) {
            throw new ValidationException("RULE-2", "Title can not be shorter than 3 characters", "title");
        } else if (hasMoreThan100Characters(productTitle)) {
            throw new ValidationException("RULE-3", "Title can not be longer than 100 characters", "title");
        } else if (!containsOnlyAllowedSymbols(productTitle)) {
            throw new ValidationException("RULE-4", "Title must contain only english alphabet letters and numbers", "title");
        }
    }

    boolean hasLessThan3Characters(String text) {
        char[] characters = text.toCharArray();
        return characters.length < 3;
    }

    boolean hasMoreThan100Characters(String text) {
        char[] characters = text.toCharArray();
        return characters.length > 100;
    }

    boolean containsOnlyAllowedSymbols(String text) {
        text = text.replaceAll("\\s", "");
        return text.matches("\\w+");
    }

}

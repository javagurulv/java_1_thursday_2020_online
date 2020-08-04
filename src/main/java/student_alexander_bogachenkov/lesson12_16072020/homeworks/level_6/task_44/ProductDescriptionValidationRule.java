package student_alexander_bogachenkov.lesson12_16072020.homeworks.level_6.task_44;

class ProductDescriptionValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        String productDescription = product.getDescription();
        if (hasMoreThan2000Characters(productDescription)) {
            throw new ValidationException("RULE-7", "Description can not be longer than 2000 characters", "description");
        } else if (!containsOnlyAllowedSymbols(productDescription)) {
            throw new ValidationException("RULE-8", "Description must contain only english alphabet letters and numbers", "description");
        }
    }

    private boolean hasMoreThan2000Characters(String productDescription) {
        return productDescription.length() > 2000;
    }

    private boolean containsOnlyAllowedSymbols(String text) {
        text = text.replaceAll("\\s", "");
        return text.matches("\\w+");
    }

}

package student_aleksey_kodin.lesson12.level6.task_40;

class ProductTitleValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getProductTitle() == null) {
            throw new ValidationException("RULE-1","Product title is empty","Description");
        }
        if (product.getProductTitle().length() < 3) {
            throw new ValidationException("RULE-2","Product title less 3 characters","Description");
        }
        if (product.getProductTitle().length() > 100) {
            throw new ValidationException("RULE-3","Product title more 100 characters","Description");
        }
        if (product.getProductTitle().matches("^[A-Za-z]")) {
            throw new ValidationException("RULE-3","Must be only Latins letters","Description");
        }
    }
}

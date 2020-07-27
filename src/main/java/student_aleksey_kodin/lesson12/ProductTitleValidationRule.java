package student_aleksey_kodin.lesson12;

class ProductTitleValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getProductTitle() == null) {
            throw new ValidationException("RULE-1","Title can not be empty","title");
        }
        if (product.getProductTitle().equals("")) {
            throw new ValidationException("RULE-1","Title can not be empty","title");
        }
        if (product.getProductTitle().length() < 3) {
            throw new ValidationException("RULE-2","Title less 3 symbols","title");
        }
        if (product.getProductTitle().length() > 100) {
            throw new ValidationException("RULE-3","Title more 100 symbols","title");
        }
        if (product.getProductTitle().matches("[А-Яа-я]+")) {
            throw new ValidationException("RULE-4","Title must be only Latin symbols","title");
        }
    }
}

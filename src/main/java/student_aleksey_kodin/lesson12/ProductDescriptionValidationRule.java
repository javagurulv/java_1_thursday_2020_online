package student_aleksey_kodin.lesson12;

class ProductDescriptionValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getProductDescription().length() > 2000) {
            throw new ValidationException("RULE-8","Title more 2000 symbols","title");
        }
        if (product.getProductDescription().matches("[А-Яа-я]+")) {
            throw new ValidationException("RULE-9","Title must be only Latin symbols and digits","title");
        }
        String st = "(.*)[/!*&^%$#@{}';:?>,.<*-+_=](.*)";
        if (product.getProductDescription().matches(st)) {
            throw new ValidationException("RULE-9","Title must be only Latin symbols and digits","title");
        }    }
}

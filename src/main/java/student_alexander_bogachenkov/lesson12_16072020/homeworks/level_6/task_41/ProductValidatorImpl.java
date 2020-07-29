package student_alexander_bogachenkov.lesson12_16072020.homeworks.level_6.task_41;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator {

    private ProductTitleValidationRule titleValidationRule;

    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule) {
        this.titleValidationRule = titleValidationRule;
    }

    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        try {
            titleValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }
        return exceptions;
    }

}
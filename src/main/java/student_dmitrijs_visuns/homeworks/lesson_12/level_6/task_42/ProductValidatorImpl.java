package student_dmitrijs_visuns.homeworks.lesson_12.level_6.task_42;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator {

    private ProductPriceValidationRule priceValidationRule;

    public ProductValidatorImpl(ProductPriceValidationRule priceValidationRule) {
        this.priceValidationRule = priceValidationRule;
    }

    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        try {
            priceValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }
        return exceptions;
    }

}


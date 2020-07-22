package student_aleksey_kodin.lesson12.level6.task_43;

import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator {
    private final ProductTitleValidationRule titleValidationRule;
    private final ProductPriceValidationRule priceValidationRule;

    ProductValidatorImpl(ProductTitleValidationRule titleValidationRule,
                         ProductPriceValidationRule priceValidationRule) {
        this.titleValidationRule = titleValidationRule;
        this.priceValidationRule = priceValidationRule;
    }

    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        try {
            titleValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }
        try {
            priceValidationRule.validate(product);
        } catch (ValidationException e) {
            exceptions.add(e);
        }
        return exceptions;
    }

}

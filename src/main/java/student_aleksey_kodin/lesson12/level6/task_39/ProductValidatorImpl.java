package student_aleksey_kodin.lesson12.level6.task_39;


import java.util.ArrayList;
import java.util.List;

class ProductValidatorImpl implements ProductValidator {
    private final ProductTitleValidationRule titleValidationRule;


    ProductValidatorImpl(ProductTitleValidationRule titleValidationRule)
 {
        this.titleValidationRule = titleValidationRule;
    }

    @Override
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

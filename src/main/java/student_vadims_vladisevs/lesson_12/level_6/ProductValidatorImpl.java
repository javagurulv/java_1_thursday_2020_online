package student_vadims_vladisevs.lesson_12.level_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class ProductValidatorImpl implements ProductValidator {

    List<FieldValidationRule> validationRules = new ArrayList<>();

    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule,
                                ProductPriceValidationRule priceValidationRule,
                                ProductDescriptionValidationRule descriptionValidationRule) {

        validationRules.add(titleValidationRule);
        validationRules.add(priceValidationRule);
        validationRules.add(descriptionValidationRule);
    }

    public List<ValidationException> validate(Product product){
        List<ValidationException> exceptions = new ArrayList<>();
        for (FieldValidationRule validationRule : validationRules) {
            try {
                validationRule.validate(product);
            } catch (ValidationException e) {
                exceptions.add(e);
            }
        }
        return exceptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductValidatorImpl that = (ProductValidatorImpl) o;
        return Objects.equals(validationRules, that.validationRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validationRules);
    }
}




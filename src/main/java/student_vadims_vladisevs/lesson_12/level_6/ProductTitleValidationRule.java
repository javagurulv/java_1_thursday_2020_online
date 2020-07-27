package student_vadims_vladisevs.lesson_12.level_6;

class ProductTitleValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {

        if(isTitleNull(product) || isTitleEmpty(product)){
            throw new ValidationException("RULE-1", "Title can not be empty", "title");
        }

        if (isTitleShorterThanThreeSymbols(product)){
            throw new ValidationException("RULE-2", "Title is shorter than 3 symbols", "title");
        }

        if(isTitleLongerThanHundredSymbols(product)){
            throw new ValidationException("RULE-3", "Title is longer then 100 symbols", "title");
        }

        if(!isTitleContainsOnlyEnglishSymbolsAndNumbers(product)){
            throw new ValidationException("RULE-4", "Title must contain only English alphabet symbols and numbers", "title");
        }
    }

    private boolean isTitleNull(Product product){
        return product.getTitle() == null;
    }

    private boolean isTitleEmpty(Product product){
        return product.getTitle().isEmpty();
    }

    private boolean isTitleShorterThanThreeSymbols(Product product){
        return product.getTitle().length() < 3;
    }

    private boolean isTitleLongerThanHundredSymbols(Product product){
        return product.getTitle().length() > 100;
    }

    private boolean isTitleContainsOnlyEnglishSymbolsAndNumbers(Product product){ return product.getTitle().matches("^[a-zA-Z0-9 ]*$");}

}

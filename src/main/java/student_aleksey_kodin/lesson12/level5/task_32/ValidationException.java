package student_aleksey_kodin.lesson12.level5.task_32;

class ValidationException extends Exception {
    private final String ruleTitle;
    private final String errorMessage;
    private final String fieldName;

    public ValidationException(String ruleTitle, String errorMessage, String fieldName) {
        super(errorMessage);
        this.ruleTitle = ruleTitle;
        this.errorMessage = errorMessage;
        this.fieldName = fieldName;
    }

    public String getRuleTitle() {
        return ruleTitle;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getFieldName() {
        return fieldName;
    }
}

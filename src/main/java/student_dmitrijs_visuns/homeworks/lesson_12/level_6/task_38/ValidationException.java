package student_dmitrijs_visuns.homeworks.lesson_12.level_6.task_38;

class ValidationException extends Exception {

    private String ruleName;
    private String description;
    private String fieldName;

    public ValidationException (String ruleName, String description, String fieldName) {
        this.ruleName = ruleName;
        this.description = description;
        this.fieldName = fieldName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public String getDescription() {
        return description;
    }

    public String getFieldName() {
        return fieldName;
    }

}

package student_vadims_vladisevs.lesson_12.level_5;

class ValidationException extends Exception {


    private String ruleName;
    private String description;
    private String fieldName;


    public ValidationException(String ruleName, String description, String fieldName){
        super(description);
        this.ruleName = ruleName;
        this.description = description;
        this.fieldName = fieldName;
    }

    public String getDescription() {
        return description;
    }

    public String getRuleName() {
        return ruleName;
    }

    public String getFieldName() {
        return fieldName;
    }
}

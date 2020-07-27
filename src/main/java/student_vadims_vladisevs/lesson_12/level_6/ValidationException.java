package student_vadims_vladisevs.lesson_12.level_6;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidationException exception = (ValidationException) o;
        return ruleName.equals(exception.ruleName) &&
                description.equals(exception.description) &&
                fieldName.equals(exception.fieldName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, description, fieldName);
    }
}

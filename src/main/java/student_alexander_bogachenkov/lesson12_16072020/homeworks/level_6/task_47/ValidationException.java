package student_alexander_bogachenkov.lesson12_16072020.homeworks.level_6.task_47;

import java.util.Objects;

class ValidationException extends Exception {

    private String ruleName;
    private String description;
    private String fieldName;

    public ValidationException(String ruleName, String description, String fieldName) {
        this.ruleName = ruleName;
        this.description = description;
        this.fieldName = fieldName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidationException that = (ValidationException) o;
        return ruleName == that.ruleName &&
                Objects.equals(description, that.description) &&
                Objects.equals(fieldName, that.fieldName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, description, fieldName);
    }

    @Override
    public String toString() {
        return "ValidationException{" +
                "ruleName='" + ruleName + '\'' +
                ", description='" + description + '\'' +
                ", fieldName='" + fieldName + '\'' +
                '}';
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

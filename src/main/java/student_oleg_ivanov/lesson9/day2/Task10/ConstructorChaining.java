package student_oleg_ivanov.lesson9.day2.Task10;

class ConstructorChaining {
    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }
    public ConstructorChaining(int parameterCount, String constructorName) {
        ConstructorChaining constructorChaining = new ConstructorChaining(constructorName);
        this.parameterCount = parameterCount;
    }
}

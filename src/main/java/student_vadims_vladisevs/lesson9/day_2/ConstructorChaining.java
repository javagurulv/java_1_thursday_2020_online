package student_vadims_vladisevs.lesson9.day_2;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount){
        ConstructorChaining constructorChaining = new ConstructorChaining(constructorName);
        this.parameterCount = parameterCount;
    }

}